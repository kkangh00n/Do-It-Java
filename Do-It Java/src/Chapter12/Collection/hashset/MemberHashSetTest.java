package Chapter12.Collection.hashset;

import Chapter12.Collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberlee = new Member(1001, "�̱��");
		Member memberkim = new Member(1002, "�谭��");
		Member memberyang = new Member(1003, "������");
		
		memberHashSet.addMember(memberlee);
		memberHashSet.addMember(memberkim);
		memberHashSet.addMember(memberyang);
		memberHashSet.showAllMember();
		
		Member memberlee2 = new Member(1003, "�̹���");
		
		memberHashSet.addMember(memberlee2);
		memberHashSet.showAllMember();
		
	}

}
