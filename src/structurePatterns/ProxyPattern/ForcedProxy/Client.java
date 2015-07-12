package structurePatterns.ProxyPattern.ForcedProxy;

import java.util.Date;

class Client {

	public static void main(String[] args) {
		IGamePlayer player=new GamePlayer("张三");
		IGamePlayer proxy=player.getProxy();
		System.out.println("Start time: "+new Date().toString());
		proxy.login("zhangSan", "password");
		proxy.killBoss();
		proxy.upgrade();
		System.out.println("End time: "+new Date().toString());
	}
}
