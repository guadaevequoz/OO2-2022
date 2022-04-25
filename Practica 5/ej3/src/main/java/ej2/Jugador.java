package ej2;

public class Jugador {
	public String nombre;
    public String apellido;
    public int puntuacion = 0;
    
    public void incrementar(int cant) {
    	this.puntuacion += cant;
    }
    
    public void decrementar(int cant) {
    	this.puntuacion -= cant;
    }
}
