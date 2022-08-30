package Chapter12.Collection.treeset;

import Chapter12.Collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member memberyang = new Member(1003, "양희준");
		Member memberkim = new Member(1001, "김강훈");
		Member memberlee = new Member(1002, "이기우");
		memberTreeSet.addMember(memberyang);
		memberTreeSet.addMember(memberkim);
		memberTreeSet.addMember(memberlee);
		memberTreeSet.showAllMember();
		
		Member membermu = new Member(1003, "이무성");
		memberTreeSet.addMember(membermu);
		memberTreeSet.showAllMember();
		
	
	}
	//실행 안될거임!! 왜냐면 Member클래스의 정렬기준을 제공하지 않았기 떄문
	//->Member클래스로
}
