package ar.edu.unlp.info.oo2.ejercicio_1;

import java.time.LocalDate;

public abstract class Tweet {
	private LocalDate fecha;
	
	Tweet(){
		this.fecha =  LocalDate.now();
	}

	protected abstract Object getScreenName();
}
