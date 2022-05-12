package tp6.ej1C;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

public class DatabaseProxy implements DatabaseAccess{
	private DatabaseRealAccess db;
	private boolean estaAutenticado = false;
	Logger logger;
	
	public DatabaseProxy(DatabaseRealAccess db) throws IOException {
		super();
		this.db = db;

		logger = Logger.getLogger("MyLog");
		FiltroHandler filtroHandler = new FiltroHandler(Arrays.asList("Acceso","busqueda"));
		MailHandler mailHandler = new MailHandler();
		logger.addHandler(mailHandler);
		logger.addHandler(filtroHandler);
		logger.setUseParentHandlers(false);
		
	}

	@Override
	public Collection<String> getSearchResults(String queryString) {
		if(!checkAccess()) {
			throw new RuntimeException("No está autenticado");
		}else {
			logger.info("Acceso de busqueda valido");
		}
		return db.getSearchResults(queryString);
	}

	public int insertNewRow(List<String> rowData) {
		if(!checkAccess()) {
			throw new RuntimeException("No está autenticado");
		}else {
			logger.warning("Acceso de inserción valido");
		}
		return db.insertNewRow(rowData);
	}
	
	private boolean checkAccess() {
		if(!estaAutenticado) {
			logger.severe("No está autenticado");
		}
		return estaAutenticado;
	}
	
	public void autenticar() {
		this.estaAutenticado = true;
	}
	
	
}
