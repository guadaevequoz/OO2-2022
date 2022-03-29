package ar.edu.unlp.info.oo2.objetos_dos;

import java.util.ArrayList;

public class Mixta extends Topografía{
	private ArrayList<Topografía> topografias;
	
	public Mixta() {
		super(0);
		this.topografias = new ArrayList<Topografía>();
	}
	
	public void agregarTopografia(Topografía t) throws Exception{
		if(topografias.size() < 4) this.topografias.add(t);
	}
	
	public ArrayList<Topografía> getTopografias(){
		return this.topografias;
	}
	
	public double getProporcion() {
		return this.topografias.stream()
				.mapToDouble(t -> t.getProporcion())
				.sum() / this.topografias.size();
	}
	
	public boolean esIgualA(Topografía m) {
		return this.topografias.equals(m.getTopografias());
	}
}
