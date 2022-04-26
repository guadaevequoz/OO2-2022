package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.TreeSet;
import java.util.SortedSet;

public class GuiaTelefonica {
	public SortedSet<String> guia = new TreeSet<String>();
	
	public boolean agregarTelefono(String str) {
		boolean encontre = guia.contains(str);
		if (!encontre) {
			guia.add(str);
			encontre= true;
			return encontre;
		}
		else {
			encontre= false;
			return encontre;
		}
	}
	
	public String obtenerNumero() {
		String num = guia.last();
		guia.remove(num);
		return num;
	}
	
	public void agregarNumero(String num) {
		this.guia.add(num);
	}
}
