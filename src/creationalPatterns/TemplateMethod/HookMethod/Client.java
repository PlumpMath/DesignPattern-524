package creationalPatterns.TemplateMethod.HookMethod;

public class Client {

	public static void main(String[] args) {
		HummerH1Model h1=new HummerH1Model();
		h1.setAlarm(true);
		h1.run();
		
		System.out.println("=============================");
		
		h1.setAlarm(false);
		h1.run();
		
		System.out.println("=============================");
		
		HummerModel h2=new HummerH2Model();
		h2.run();
	}

}
