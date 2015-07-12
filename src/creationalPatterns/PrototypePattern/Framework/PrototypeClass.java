package creationalPatterns.PrototypePattern.Framework;

class PrototypeClass implements Cloneable {

	public PrototypeClass clone(){
		PrototypeClass prototypeClass=null;
		try {
			prototypeClass=(PrototypeClass)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prototypeClass;
	}
}
