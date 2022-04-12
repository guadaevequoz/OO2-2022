package ar.edu.unlp.info.oo2.tp3_ej3;

import java.util.zip.CRC32;

public class CRC32_Calculator implements Calculator{
	
	public int crcFpr(String data) {
		CRC32 crc = new CRC32();
		String datos = "un mensaje";
		crc.update(datos.getBytes());
		long result = crc.getValue();
		Long r = result;
		return r.intValue();
	}
	
}
