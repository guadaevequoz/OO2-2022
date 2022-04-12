package ar.edu.unlp.info.oo2.ej1;


public class Paused extends State{

	public Paused() {
		super("Paused");
	}
	
	protected void pause(ToDoItem t) {
		t.setState(new InProgress());
	}
	protected void finish(ToDoItem t) {
		t.setState(new Finished(t));
	}


}
