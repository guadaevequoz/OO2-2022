package ar.edu.unlp.info.oo2.accesobd;

import java.util.Collection;
import java.util.List;

public class DatabaseProxy implements DatabaseAccess{
	private DatabaseRealAccess db;
	private boolean estaAutenticado = true;
	
	public DatabaseProxy(DatabaseRealAccess db) {
		super();
		this.db = db;
	}

	@Override
	public Collection<String> getSearchResults(String queryString) {
		if(!estaAutenticado) {
			throw new RuntimeException("No está autenticado.");
		}
		return db.getSearchResults(queryString);
	}

	public int insertNewRow(List<String> rowData) {
		if(!estaAutenticado) {
			throw new RuntimeException("No está autenticado.");
		}
		return db.insertNewRow(rowData);
	}
	
	
}
