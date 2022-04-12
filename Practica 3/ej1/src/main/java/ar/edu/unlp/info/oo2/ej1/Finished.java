package ar.edu.unlp.info.oo2.ej1;

import java.time.LocalDateTime;

public class Finished extends State{

	public Finished(ToDoItem t) {
		super("Finished");
		t.setEnd(LocalDateTime.now());
	}

}
