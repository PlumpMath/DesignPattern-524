package sixPrinciples.LeastKnowledge;

import java.util.List;

public class GroupLeader {
	private List<Girl> girls;

	public GroupLeader(List<Girl> girls) {
		this.girls=girls;
	}
	
	public void countGirls(){
		System.out.println("GroupLeader开始清点女生个数。");
		System.out.println("一共有"+girls.size()+"个女孩。");
	}
}
