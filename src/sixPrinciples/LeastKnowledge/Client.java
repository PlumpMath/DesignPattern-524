package sixPrinciples.LeastKnowledge;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		List<Girl> girls=new ArrayList<Girl>();
		for(int i=0;i<20;i++){
			girls.add(new Girl());
		}
		
		GroupLeader leader=new GroupLeader(girls);
		Teacher teacher=new Teacher();
		teacher.command(leader);
	}

}
