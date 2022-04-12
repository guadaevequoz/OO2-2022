package ar.edu.unlp.info.oo2.tp3_ej3;

public class Adapter4G implements Connection{
	private Connection4G conn4G;
	
	public Adapter4G(){
		this.conn4G = new Connection4G();
	}

	@Override
	public String sendData(String data, int crc) {
		return this.conn4G.transmit(data, crc);
	}
	
	public String pict() {
		return this.conn4G.symb();
	}
	
}
