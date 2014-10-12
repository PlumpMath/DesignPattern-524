package behaviorPatterns.MementoPattern.MultiBackup;

import java.util.HashMap;

class Caretaker {
	private HashMap<String, Memento> mementos=new HashMap<String, Memento>();

	public Memento getMemento(String id) {
		return this.mementos.get(id);
	}

	public void setMemento(String id, Memento memento) {
		this.mementos.put(id, memento);
	}	
}
