package Chapter12.Collection.treeset;

import Chapter12.Collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member memberyang = new Member(1003, "������");
		Member memberkim = new Member(1001, "�谭��");
		Member memberlee = new Member(1002, "�̱��");
		memberTreeSet.addMember(memberyang);
		memberTreeSet.addMember(memberkim);
		memberTreeSet.addMember(memberlee);
		memberTreeSet.showAllMember();
		
		Member membermu = new Member(1003, "�̹���");
		memberTreeSet.addMember(membermu);
		memberTreeSet.showAllMember();
		
	
	}
	//���� �ȵɰ���!! �ֳĸ� MemberŬ������ ���ı����� �������� �ʾұ� ����
	//->MemberŬ������
}
