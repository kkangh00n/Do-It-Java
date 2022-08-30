package Chapter12.Collection.arraylist;
import Chapter12.Collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberArrayList memberArrayList = new MemberArrayList();
		memberArrayList.change(); //MemberArrayList의 배열을 Vector로 변환
		
		
		Member memberlee = new Member(1001, "이기우");
		Member memberkim = new Member(1002, "김강훈");
		Member memberyang = new Member(1003, "양희준");
		
		memberArrayList.addMember(memberlee);
		memberArrayList.addMember(memberkim);
		memberArrayList.addMember(memberyang);
		
		memberArrayList.showAllMember();
		
		memberArrayList.removeMember(memberlee.getMemberId());
		memberArrayList.showAllMember();
	}

}
