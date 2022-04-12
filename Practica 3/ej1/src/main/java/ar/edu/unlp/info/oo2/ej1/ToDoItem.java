package ar.edu.unlp.info.oo2.ej1;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class ToDoItem {
	private String name;
	private List<String> comments;
	private State state;
	private LocalDateTime start;
	private LocalDateTime end;
	
	
	public ToDoItem(String name) {
		this.name = name;
		this.state = new Pending();
		this.comments = new ArrayList<String>();
	}
	
	public void start() {
		this.state.start(this);
	}
	
	public void togglePause() {
		this.state.togglePause(this);
	}
	
	public void finish() {
		this.state.finish(this);
	}
	
	public void setState(State s) {
		this.state = s;
	}
	
	public State getState() {
		return this.state;
	}
	
	public Duration workedTime() {
		if(this.getStart() == null) {
			throw new RuntimeException("Actual State Pending.");
		}
		if(this.getEnd() != null) {
			return Duration.between(this.getStart(), this.getEnd());
		}
		return Duration.between(this.getStart(), LocalDateTime.now());
	}
	
	//está mal, tendria que chequearse en los estados
	public void addComment(String comment) {
		if(this.end == null)
			this.comments.add(comment);
	}

	public void setStart(LocalDateTime start) {
		this.start = start;
	}

	public void setEnd(LocalDateTime end) {
		this.end = end;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getStart() {
		return start;
	}
	
	public LocalDateTime getEnd() {
		return end;
	}

	public List<String> getComments() {
		return this.comments;
	}
	
	
}
