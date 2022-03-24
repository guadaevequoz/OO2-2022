package ar.edu.unlp.info.oo2.ejercicio_1;

import java.util.ArrayList;
import java.util.List;

public class Twitter {
	private List<Usuario> usuarios;
	
	public Twitter() {
		this.usuarios = new ArrayList<Usuario>();
	}
	
	
	
	public List<Usuario> getUsuarios() {
		return usuarios;
	}



	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}



	public void agregarUsuario(Usuario u) {
		this.getUsuarios().add(u);
	}
	
	public void eliminarUsuario(Usuario u) {
		u.eliminarTweets();
		this.getUsuarios().remove(u);
	}
	
}
