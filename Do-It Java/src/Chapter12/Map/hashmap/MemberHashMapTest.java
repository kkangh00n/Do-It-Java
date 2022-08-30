package Chapter12.Map.hashmap;

import Chapter12.Collection.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberHashMap hashMap = new MemberHashMap();
		
		Member memberkim = new Member(1001, "±è°­ÈÆ");
		Member memberyang = new Member(1003, "¾çÈñÁØ");
		Member memberlee = new Member(1002, "±è°­ÈÆ");
		//Member membermoo = new Member(1001, "ÀÌ¹«¼º");
		
		hashMap.addMember(memberkim);
		hashMap.addMember(memberlee);
		hashMap.addMember(memberyang);
		//hashMap.addMember(membermoo);
		hashMap.showAllMember();
		
		hashMap.removeMember(1001);
		hashMap.showAllMember();
	}

}
