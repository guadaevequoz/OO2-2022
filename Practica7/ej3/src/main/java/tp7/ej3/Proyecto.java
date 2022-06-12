package tp7.ej3;

public class Proyecto {
	private Estado estado; 
	private String titulo;
	private double monto = 0;
	private double meta;
	private Emprendedor emprendedor;
	
	public Proyecto (String titulo, double meta, Emprendedor emp){
		this.estado = new Creado(this);
		this.titulo = titulo;
		this.meta = meta;
		this.emprendedor = emp;
	}

	public double getMonto() {
		return monto;
	}
	
	public void setMonto(double monto) {
		this.monto = monto;
	}

	public void invertir(double monto) {
		this.estado.invertir(monto);
	}
	
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public void cancelar() {
		this.estado.cancelar();
	}

	public double getMeta() {
		return meta;
	}
	
	
	
	
}
