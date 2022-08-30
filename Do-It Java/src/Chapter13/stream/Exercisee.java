package Chapter13.stream;

import Chapter12.Collection.Member;
import java.util.LinkedList;

public class Exercisee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Member> sList = new LinkedList<>();
		
		Member mem1 = new Member(1003, "이무성");
		Member mem2 = new Member(1001, "양희준");
		Member mem3 = new Member(1002, "이기우");
		
		sList.add(mem1);
		sList.add(mem2);
		sList.add(mem3);
		
		sList.stream().sorted().forEach(s -> System.out.println(s.getMemberId() + s.getMemberName()));
	}

}
