package ar.edu.unlp.info.oo2.accesobd;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

import org.json.simple.JSONObject;

public class JSONFormatter extends Formatter{

	@Override
	public String format(LogRecord record) {
		Map<String, Object> map = new HashMap();
		
		map.put("message", record.getMessage());
		map.put("level", record.getLevel());
		
		return new JSONObject(map).toString();
	}

}
