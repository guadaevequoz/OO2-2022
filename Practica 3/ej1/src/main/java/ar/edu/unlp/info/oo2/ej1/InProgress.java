package ar.edu.unlp.info.oo2.ej1;

public class InProgress extends State{

	public InProgress(){
		super("InProgress");
	}

	protected void pause(ToDoItem t) {
		t.setState(new Paused());
	}
	protected void finish(ToDoItem t) {
		t.setState(new Finished(t));
	}

}
