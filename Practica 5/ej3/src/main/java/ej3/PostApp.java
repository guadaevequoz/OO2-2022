package ej3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PostApp {
	private List<Post> posts = new ArrayList<Post>();
	
	
	
	/**
	* Retorna los últimos N posts que no pertenecen al usuario user
	*/
	public List<Post> ultimosPosts(Usuario user, int cantidad) {
		List<Post> postsOtrosUsuarios = this.filtrarPosts(user);
		
		this.ordenarPostPorFecha(postsOtrosUsuarios);
		
		return this.getUltimosPosts(postsOtrosUsuarios,cantidad);
	}



	private List<Post> getUltimosPosts(List<Post> postsOtrosUsuarios, int cantidad) {
		List<Post> ultimosPosts = new ArrayList<Post>();
	    int index = 0;
	    Iterator<Post> postIterator = postsOtrosUsuarios.iterator();
	    while (postIterator.hasNext() &&  index < cantidad) {
	        ultimosPosts.add(postIterator.next());
	    }
	    return ultimosPosts;
	}



	private void ordenarPostPorFecha(List<Post> postsOtrosUsuarios) {
		for (int i = 0; i < postsOtrosUsuarios.size(); i++) {
		       int masNuevo = i;
		       for(int j= i +1; j < postsOtrosUsuarios.size(); j++) {
		           if (postsOtrosUsuarios.get(j).getFecha().isAfter(
		     postsOtrosUsuarios.get(masNuevo).getFecha())) {
		              masNuevo = j;
		           }    
		       }
		      Post unPost = postsOtrosUsuarios.set(i,postsOtrosUsuarios.get(masNuevo));
		      postsOtrosUsuarios.set(masNuevo, unPost);    
		   }
	}



	private List<Post> filtrarPosts(Usuario user) {
		List<Post> postsOtrosUsuarios = new ArrayList<Post>();
	    for (Post post : this.posts) {
	        if (!post.getUsuario().equals(user)) {
	            postsOtrosUsuarios.add(post);
	        }
	    }
	    return postsOtrosUsuarios;
	}
	
	
}
