package structurePatterns.ProxyPattern.MultiInterface;

import java.util.Date;

class Client {

	public static void main(String[] args) {
		
		IGamePlayer proxy=new GamePlayerProxy("张三");
		System.out.println("Start time: "+new Date().toString());
		proxy.login("zhangSan", "password");
		proxy.killBoss();
		proxy.upgrade();
		System.out.println("End time: "+new Date().toString());
	}

}
