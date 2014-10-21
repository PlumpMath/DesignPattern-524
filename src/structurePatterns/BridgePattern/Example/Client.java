package structurePatterns.BridgePattern.Example;

class Client {

	public static void main(String[] args) {
		House house=new House();
		HouseCorp houseCorp=new HouseCorp(house);
		houseCorp.makeMoney();
		System.out.println();
		
		IPod iPod=new IPod();
		CopyCorp copyCorp=new CopyCorp(iPod);
		copyCorp.makeMoney();
	}

}
