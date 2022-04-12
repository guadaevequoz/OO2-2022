package ar.edu.unlp.info.oo2.ej1;

public abstract class State {
	protected String name;
	
	public State(String n) {
		this.name = n;
	}
	
	protected void start(ToDoItem t) {};
	protected void togglePause(ToDoItem t) {
		throw new RuntimeException("Actual state is "+ this.name +", can't pause.");
	};
	protected void finish(ToDoItem t) {};
	
	public String getName() {
		return name;
	}
}
