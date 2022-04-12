package ar.edu.unlp.info.oo2.tp3_ej3;

public class WifiConn implements Connection{
	private String pict = "Wifi";
	
	@Override
	public String sendData(String data, int crc) {
		return data + "" + crc;
	}

	public String pict() {
		return this.pict;
	}

}
