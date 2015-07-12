package structurePatterns.ProxyPattern.CommanProxy;

class GamePlayer implements IGamePlayer {

	private String name="";
	
	public GamePlayer(IGamePlayer gamePlayer,String name) throws Exception {
		if(gamePlayer==null){
			throw new Exception("Unable to create a true character ...");
		}else{
			this.name=name;
		}
	}

	@Override
	public void login(String user, String password) {
		System.out.println(name+" has logged in as "+user);
	}

	@Override
	public void killBoss() {
		System.out.println(this.name+" is killing bosses ...");
	}

	@Override
	public void upgrade() {
		System.out.println(this.name+" has upgraded ...");
	}
}
