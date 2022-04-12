package ar.edu.unlp.info.oo2.objetos_dos;

import java.util.ArrayList;
import java.util.List;

public class Mixta extends Topografía{
	private List<Topografía> topografias;
	
	public Mixta(Topografía c1, Topografía c2, Topografía c3, Topografía c4) {
		this.topografias = new ArrayList<Topografía>();
		this.topografias.add(c1); this.topografias.add(c2);
		this.topografias.add(c3); this.topografias.add(c4);
	}

	@Override
	public double calcularProporcionAgua() {
		return this.topografias
				.stream()
				.mapToDouble(c -> c.calcularProporcionAgua())
				.sum() / 4;
	}

	public List<Topografía> getTopografias() {
		return topografias;
	}
	
	public boolean equals(Topografía c) {
		return this.getComponentes().equals(c.getComponentes());
	}
	
	
	
}
