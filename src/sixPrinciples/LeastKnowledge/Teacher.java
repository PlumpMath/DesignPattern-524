package sixPrinciples.LeastKnowledge;

public class Teacher {

	void command(GroupLeader leader){
		System.out.println("Teacher让GroupLeader清点人数。");
		leader.countGirls();
	}
}
