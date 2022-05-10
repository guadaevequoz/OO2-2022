package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class Persoonal {
	private List<Persoona> personas = new ArrayList<Persoona>();
	private List<Llamada> llamadas = new ArrayList<Llamada>();
	private SortedSet<String> guia = new TreeSet<String>();
	/*GuiaTelefonica guia = new GuiaTelefonica();*/
	/*static double descuentoJur = 0.15;
	static double descuentoFis = 0;*/
	
	public boolean agregarTelefono(String str) {
		/*boolean encontre = lista3.guia.contains(str);
		if (!encontre) {
			lista3.guia.add(str);
			encontre= true;
			return encontre;
		}
		else {
			encontre= false;
			return encontre;
		}*/
		return guia.add(str);
	}
	/*
	public Persoona registrarUsuario(String data, String nombre, String tipo) {
		Persoona var = new Persoona();
		if (t.equals("fisica")) {
			var.setNya(nombre);
			String tel = lista3.guia.last();
			lista3.guia.remove(tel);
			var.setT(t);
			var.setTel(tel);
			var.setDoc(data);
		}
		else if (t.equals("juridica")) {
			String tel = lista3.guia.last();
			lista3.guia.remove(tel);
			var.nya =nombre;
			var.t =t;
			var.tel = tel;
			var.cuit =data;
		}
		var.sis = this;
		lista1.add(var);
		return var;
	}*/
	
	public Persoona registrarUsuarioFisico(String dni, String nombre) {
		Persoona per = new PersoonaFisica(nombre,this.getNumeroTelefono(),dni);
		personas.add(per);
		return per;
	}
	
	public Persoona registrarUsuarioJuridico(String nombre, String cuit) {
		Persoona per = new PersoonaFisica(nombre,this.getNumeroTelefono(),cuit);
		personas.add(per);
		return per;
	}

	private String getNumeroTelefono() {
		String num = guia.last();
		guia.remove(num);
		return num;
	}

	public boolean eliminarUsuario(Persoona p) {
		/*List<Persoona> l = lista1.stream().filter(persona -> persona != p).collect(Collectors.toList());
		boolean borre = false;
		if (l.size() < lista1.size()) {
			this.lista1 = l;
			this.lista3.guia.add(p.getTel());
			borre = true;
		}
		return borre;*/
		if(personas.remove(p)) {
			guia.add(p.getTel());
			return true;
		}
		return false;
	}
	
	/*public Llamada registrarLlamada(Persoona emisor, Persoona receptor, String tipo, int duracion) {
		Llamada x = new Llamada();
		x.tipoDeLlamada = t;
		x.setEmisor(q.tel);
		x.setRemitente(q2.getTel());
		x.dur= d;
		lista2.add(x);
		q.lista1.add(x);
		return x;
	}*/
	
	public Llamada registrarLlamadaNacional(String emisor, String receptor, int duracion) {
		Llamada llamada = new LlamadaNacional(emisor,receptor,duracion);
		llamadas.add(llamada);
		return llamada;
	}
	
	public Llamada registrarLlamadaInternacional(String emisor, String receptor, int duracion) {
		Llamada llamada = new LlamadaInternacional(emisor,receptor,duracion);
		llamadas.add(llamada);
		return llamada;
	}

	public int cantidadDeUsuarios() {
		return personas.size();
	}

	public boolean existeUsuario(Persoona persona) {
		return personas.contains(persona);
	}
	
}
