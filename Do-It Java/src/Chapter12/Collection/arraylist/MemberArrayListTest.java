package Chapter12.Collection.arraylist;
import Chapter12.Collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberArrayList memberArrayList = new MemberArrayList();
		memberArrayList.change(); //MemberArrayList�� �迭�� Vector�� ��ȯ
		
		
		Member memberlee = new Member(1001, "�̱��");
		Member memberkim = new Member(1002, "�谭��");
		Member memberyang = new Member(1003, "������");
		
		memberArrayList.addMember(memberlee);
		memberArrayList.addMember(memberkim);
		memberArrayList.addMember(memberyang);
		
		memberArrayList.showAllMember();
		
		memberArrayList.removeMember(memberlee.getMemberId());
		memberArrayList.showAllMember();
	}

}
