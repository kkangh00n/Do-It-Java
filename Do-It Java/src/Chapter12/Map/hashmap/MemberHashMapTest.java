package Chapter12.Map.hashmap;

import Chapter12.Collection.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberHashMap hashMap = new MemberHashMap();
		
		Member memberkim = new Member(1001, "�谭��");
		Member memberyang = new Member(1003, "������");
		Member memberlee = new Member(1002, "�谭��");
		//Member membermoo = new Member(1001, "�̹���");
		
		hashMap.addMember(memberkim);
		hashMap.addMember(memberlee);
		hashMap.addMember(memberyang);
		//hashMap.addMember(membermoo);
		hashMap.showAllMember();
		
		hashMap.removeMember(1001);
		hashMap.showAllMember();
	}

}
