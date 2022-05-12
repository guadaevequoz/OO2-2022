package ar.edu.unlp.info.oo2.accesobd;

import java.util.Collection;
import java.util.List;
import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;

public class DatabaseProxy implements DatabaseAccess{
	private DatabaseRealAccess db;
	private boolean estaAutenticado = false;
	private Logger logger = Logger.getLogger("MyLog");
	private ConsoleHandler handlerUppercase = new ConsoleHandler();
	private ConsoleHandler handlerJSON = new ConsoleHandler();
	
	public DatabaseProxy(DatabaseRealAccess db) {
		super();
		this.db = db;
		handlerUppercase.setFormatter(new UppercaseFormatter());
		handlerJSON.setFormatter(new JSONFormatter());
		logger.addHandler(handlerUppercase);
		logger.addHandler(handlerJSON);
		logger.setUseParentHandlers(false);
	}

	@Override
	public Collection<String> getSearchResults(String queryString) {
		if(!checkAccess()) {
			throw new RuntimeException("No está autenticado.");
		}else {
			logger.info("Acceso de busqueda valido.");
		}
		return db.getSearchResults(queryString);
	}

	public int insertNewRow(List<String> rowData) {
		if(!checkAccess()) {
			throw new RuntimeException("No está autenticado.");
		}else {
			logger.warning("Acceso de inserción valido.");
		}
		return db.insertNewRow(rowData);
	}
	
	private boolean checkAccess() {
		if(!estaAutenticado) {
			logger.severe("No está autenticado.");
		}
		return estaAutenticado;
	}
	
	public void autenticar() {
		this.estaAutenticado = true;
	}
	
}
