package Chapter12.Map.treemap;

import Chapter12.Collection.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberTreeMap treemap = new MemberTreeMap();
		
		Member memberkim = new Member(1001,"�谭��");
		Member membermoo = new Member(1004, "�̹���");
		Member memberlee = new Member(1002,"�̱��");
		Member memberyang = new Member(1003,"������");
		
		treemap.addMember(memberlee);
		treemap.addMember(memberkim);
		treemap.addMember(memberyang);
		treemap.addMember(membermoo);
		treemap.showAllMember();
		//������� ���ĵǾ� ��µǴ� ���
		
		
		
	}

}
