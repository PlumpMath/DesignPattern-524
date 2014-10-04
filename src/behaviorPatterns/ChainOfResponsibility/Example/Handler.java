package behaviorPatterns.ChainOfResponsibility.Example;

abstract class Handler {
	public final static int FATHER_LEVEL_REQUEST=1;
	public final static int HUSBAND_LEVEL_REQUEST=2;
	public final static int SON_LEVEL_REQUEST=3;
	
	private int level=0;
	private Handler nextHandler;
	
	public Handler(int level) {
		this.level=level;
	}
	
	public final void HandleMessage(IWoman woman){
		if(woman.getType()==this.level){
			this.response(woman);
		}else {
			if(this.nextHandler!=null){
				this.nextHandler.HandleMessage(woman);
			}else{
				System.out.println("There is no one to request.");
			}
		}
	}
	
	public void setNext(Handler handler){
		this.nextHandler=handler;
	}
	
	protected abstract void response(IWoman woman);
	
}
