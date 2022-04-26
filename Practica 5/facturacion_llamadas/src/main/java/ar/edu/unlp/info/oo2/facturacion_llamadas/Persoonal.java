package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public class Persoonal {
	List<Persoona> personas = new ArrayList<Persoona>();
	List<Llamada> llamadas = new ArrayList<Llamada>();
	GuiaTelefonica guia = new GuiaTelefonica();
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
		return guia.agregarTelefono(str);
	}
	
	public Persoona registrarUsuario(String data, String nombre, String tipo) {
		/*Persoona var = new Persoona();
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
		return var;*/
		Persoona persona = this.determinarPersona(data,nombre,tipo);
		personas.add(persona);
		return persona;
	}
	
	private Persoona determinarPersona(String data, String nombre, String tipo) {
		if(tipo.equals("fisica")) {
			return new PersoonaFisica(nombre,this.getNumeroTelefono(),data);
		}else if (tipo.equals("juridica")) {
			return new PersoonaJuridica(nombre, this.getNumeroTelefono(), data);
		}
		return null;
	}

	private String getNumeroTelefono() {
		return guia.obtenerNumero();
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
		if(this.existeUsuario(p)) {
			personas.remove(p);
			guia.agregarNumero(p.getTel());
			return true;
		}
		return false;
	}
	
	public Llamada registrarLlamada(Persoona emisor, Persoona receptor, String tipo, int duracion) {
		/*Llamada x = new Llamada();
		x.tipoDeLlamada = t;
		x.setEmisor(q.tel);
		x.setRemitente(q2.getTel());
		x.dur= d;
		lista2.add(x);
		q.lista1.add(x);
		return x;*/
		Llamada llamada = this.determinarLlamada(emisor, receptor, tipo, duracion);
		llamadas.add(llamada);
		emisor.agregarLlamada(llamada);
		return llamada;
	}
	
	private Llamada determinarLlamada(Persoona emisor, Persoona receptor, String tipo, int duracion) {
		if(tipo.equals("nacional")) {
			return new LlamadaNacional(emisor.getTel(),receptor.getTel(),duracion);
		}else if (tipo.equals("internacional")) {
			return new LlamadaInternacional(emisor.getTel(),receptor.getTel(),duracion);
		}
		return null;
	}
	
	public double calcularMontoTotalLlamadas(Persoona p) {
		/*double c = 0;
		Persoona aux = null;
		for (Persoona pp : lista1) {
			if (pp.tel == p.getTel()) {
				aux = pp;
				break;
			}
		} if (aux == null) return c;
		if (aux != null) {
			for (Llamada l : aux.lista1) {
				double auxc = 0;
				if (l.tipoDeLlamada == "nacional") {
					auxc += l.dur *3 + (l.dur*3*0.21);
				} else if (l.tipoDeLlamada == "internacional") {
					auxc += l.dur *200 + (l.dur*200*0.21);
				}
				
				if (aux.t == "fisica") {
					auxc -= auxc*descuentoFis;
				} else if(aux.t == "juridica") {
					auxc -= auxc*descuentoJur;
				}
				c += auxc;
			}
		}
		return c;*/
		double costo = p.calcularMontoTotalLlamadas();
		return costo;
	}

	public int cantidadDeUsuarios() {
		return personas.size();
	}

	public boolean existeUsuario(Persoona persona) {
		return personas.contains(persona);
	}
	
}
