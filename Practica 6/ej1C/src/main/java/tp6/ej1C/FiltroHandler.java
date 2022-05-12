package tp6.ej1C;

import java.util.Arrays;
import java.util.List;
import java.util.logging.ConsoleHandler;
import java.util.logging.LogRecord;

public class FiltroHandler extends ConsoleHandler{
	private List<String> filtro;
	
	public FiltroHandler(List<String> filtro) {
		this.filtro = filtro;
	}
	
	public void publish(LogRecord record) {
		List<String> msg = Arrays.asList(record.getMessage().split(" "));
        for(int i=0;i<msg.size();i++){
            if (this.filtro.contains(msg.get(i).trim())){
                msg.set(i, "***");
            }
        }
        record.setMessage(String.join(" ", msg) + "\n");
        System.err.println(getFormatter().format(record));
		
	}

	public void flush() {
		// TODO Auto-generated method stub
		
	}

	public void close() throws SecurityException {
		// TODO Auto-generated method stub
		
	}

}
