package Chapter12.Map.treemap;

import Chapter12.Collection.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberTreeMap treemap = new MemberTreeMap();
		
		Member memberkim = new Member(1001,"김강훈");
		Member membermoo = new Member(1004, "이무성");
		Member memberlee = new Member(1002,"이기우");
		Member memberyang = new Member(1003,"양희준");
		
		treemap.addMember(memberlee);
		treemap.addMember(memberkim);
		treemap.addMember(memberyang);
		treemap.addMember(membermoo);
		treemap.showAllMember();
		//순서대로 정렬되어 출력되는 모습
		
		
		
	}

}
