package behaviorPatterns.MementoPattern.Clone;

class Originator implements Cloneable {
	private Originator backup;
	private String state="";

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public void createMemento(){
		this.backup=this.clone();
	}
	
	public void restoreMemento(){
		this.setState(this.backup.getState());
	}

	@Override
	protected Originator clone() {
		try {
			return (Originator)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}
