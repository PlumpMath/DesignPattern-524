package structurePatterns.BridgePattern.Example;

class CopyCorp extends Corp {

	public CopyCorp(Product product) {
		super(product);
	}

	public void makeMoney(){
		super.makeMoney();
		System.out.println("山寨赚钱了");
	}
}
