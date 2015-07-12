package structurePatterns.ProxyPattern.ForcedProxy;

class GamePlayer implements IGamePlayer {
	
	private String name="";
	private IGamePlayer proxy=null;
	
	public GamePlayer(String name) {
		this.name=name;
	}

	@Override
	public IGamePlayer getProxy() {
		this.proxy=new GamePlayerProxy(this);
		return this.proxy;
	}
	
	private boolean isProxy(){
		if(this.proxy==null){
			return false;
		}else{
			return true;
		}
	}

	@Override
	public void login(String user, String password) {
		if(isProxy()){
			System.out.println(this.name+" has logged as "+user);
		}else {
			System.out.println("Please visit using specified proxy ...");
		}
	}

	@Override
	public void killBoss() {
		if(isProxy()){
			System.out.println(this.name+" is killing bosses ...");
		}else {
			System.out.println("Please visit using specified proxy ...");
		}
	}

	@Override
	public void upgrade() {
		if(isProxy()){
			System.out.println(this.name+" has upgraded ...");
		}else {
			System.out.println("Please visit using specified proxy ...");
		}
	}
}
