package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONAdapter implements Adapter{
	
	private static JSONObject crearJson(Socio s) {
		JSONObject objectJson = new JSONObject();	
		objectJson.put("name",s.getNombre());
		objectJson.put("legajo", s.getLegajo());
		objectJson.put("email", s.getEmail());
		
		return objectJson;
	}
	
	public String exportar(List<Socio> socios) {
		
		JSONArray arrayJson = new JSONArray();
		
		for (Socio i: socios) {
			arrayJson.add(crearJson(i));
		}
		
		return arrayJson.toJSONString();
	}
	
}
