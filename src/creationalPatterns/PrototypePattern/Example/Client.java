package creationalPatterns.PrototypePattern.Example;

import org.omg.CORBA.PRIVATE_MEMBER;

class Client {

	private static int Max_COUNT = 6;

	public static void main(String[] args) {
		int i=0;
		Mail mail=new Mail(new AdvTemplate());
		mail.setTail("本人版权所有");
		while(i<Max_COUNT){
			Mail cloneMail=mail.clone();
			cloneMail.setAppellation(i+" 先生（女士）");
			cloneMail.setReceiver(i+"@"+"i"+".com");
			System.out.println(cloneMail);
			i++;
		}
	}

}
