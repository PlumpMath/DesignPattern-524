package creationalPatterns.BuilderPattern.TemplateMethodExtension;

import java.util.ArrayList;

public abstract class CarModel {
	private ArrayList<String> sequence=new ArrayList<String>();
	
	protected abstract void start();
	protected abstract void stop();
	protected abstract void alarm();
	protected abstract void engineBoom();
	
	public void run(){
		for(String cmd:this.sequence){
			if(cmd.equalsIgnoreCase("start")){
				this.start();
			}else if(cmd.equalsIgnoreCase("stop")){
				this.stop();
			}else if(cmd.equalsIgnoreCase("alarm")){
				this.alarm();
			}else if(cmd.equalsIgnoreCase("engineBoom")){
				this.engineBoom();
			}
		}
	}
	
	public void setSequence(ArrayList<String> sequence){
		this.sequence=sequence;
	}
}
