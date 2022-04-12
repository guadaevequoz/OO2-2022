package ar.edu.unlp.info.oo2.tp3_ej3;

public class Connection4G{

	public String transmit(String data, int crc) {
		return data + "" + crc;
	}
	
	public String symb() {
		return "4G";
	}
}
