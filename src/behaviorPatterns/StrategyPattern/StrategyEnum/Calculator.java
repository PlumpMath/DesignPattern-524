package behaviorPatterns.StrategyPattern.StrategyEnum;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

enum Calculator {

	ADD("+"){
		public int exec(int a, int b){
			return a+b;
		}
	},
	
	SUB("-"){

		@Override
		public int exec(int a, int b) {
			return a-b;
		}
		
	};
	
	String value="";

	private Calculator(String value){
		this.value=value;
	}
	
	public String getValue(){
		return this.value;
	}
	
	public abstract int exec(int a,int b);
	
}
