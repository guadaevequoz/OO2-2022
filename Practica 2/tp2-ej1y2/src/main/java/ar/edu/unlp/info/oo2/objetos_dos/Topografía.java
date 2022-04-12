package ar.edu.unlp.info.oo2.objetos_dos;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public abstract class Topografía {

	public abstract double calcularProporcionAgua();

	public double calcularProporcionTierra() {
		return 1 - this.calcularProporcionAgua();
	}
	
	public List<Topografía> getComponentes() {
		List<Topografía> v = new ArrayList<Topografía>();
		v.add(this);
		return v;
	}
	
	public boolean equals(Topografía t) {
		return this.calcularProporcionAgua() == t.calcularProporcionAgua();
	};
	
	@Override
	public boolean equals(Object o) {
		return this.equals((Topografía)o);
	}
	
}
