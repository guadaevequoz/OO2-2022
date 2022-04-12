package ar.edu.unlp.info.oo2.ej1;

import java.time.LocalDateTime;

public class Pending extends State{

	
	public Pending() {
		super("Pending");
	}
	
	protected void resume() {
		
	}
	
	@Override
	public void start(ToDoItem toDo) {
		toDo.setStart(LocalDateTime.now());
		toDo.setState(new InProgress());
	}

}
