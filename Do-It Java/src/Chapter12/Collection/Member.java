package Chapter12.Collection;

public class Member implements Comparable<Member> {
	
	private int memberId;
	private String memberName;
	
	public Member(int memberId, String memberName){
		this.memberId = memberId;
		this.memberName = memberName;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	@Override
	public String toString() {
		return memberName + " 회원님의 아이디는" + memberId + "입니다.";
	}
	
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return memberId;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(member.memberId == this.memberId) {
				return true;
			}
			else
				return false;
		}
		return false;
	}
	
	
	@Override
	public int compareTo(Member member) { //추가한 회원아이디(this)와 기존 멤버(member)를 비교
		return (this.memberId - member.memberId); 
		//this : 추가하는 회원, member : 매개변수로 받은 기존의 회원
		//오름차순 정렬
	}
	
}
