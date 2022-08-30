package Chapter12.Collection.hashset;

import Chapter12.Collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberlee = new Member(1001, "ÀÌ±â¿ì");
		Member memberkim = new Member(1002, "±è°­ÈÆ");
		Member memberyang = new Member(1003, "¾çÈñÁØ");
		
		memberHashSet.addMember(memberlee);
		memberHashSet.addMember(memberkim);
		memberHashSet.addMember(memberyang);
		memberHashSet.showAllMember();
		
		Member memberlee2 = new Member(1003, "ÀÌ¹«¼º");
		
		memberHashSet.addMember(memberlee2);
		memberHashSet.showAllMember();
		
	}

}
