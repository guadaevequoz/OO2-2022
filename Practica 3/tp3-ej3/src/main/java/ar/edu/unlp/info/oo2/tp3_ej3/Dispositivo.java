package ar.edu.unlp.info.oo2.tp3_ej3;

public class Dispositivo {
	private Connection connection;
	private Calculator calculator;
	private Display display;
	private Ringer ringer;
	
	public Dispositivo() {
		this.display = new Display();
		this.ringer = new Ringer();
		
		//valores default
		this.connection = new WifiConn();
		this.calculator = new CRC16_Calculator();
		
	}
	
	public String send(String data) {
		return connection.sendData(data, calculator.crcFpr(data));
	}


	public void configurarCRC(Calculator calculator) {
		this.calculator = calculator;
	}
	
	public String conectarCon(Connection c) {
		this.connection = c;
		this.ringer.ring();
		return this.display.showBanner(this.connection.pict());
	}
	
}
