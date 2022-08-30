package Chapter12.Collection;

import java.util.Comparator;

public class Member2 implements Comparator<Member2>{
	
	private int memberId;
	private String memberName;
	
	public Member2(int memberId, String memberName){
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
		if(obj instanceof Member2) {
			Member2 member = (Member2)obj;
			if(member.memberId == this.memberId) {
				return true;
			}
			else
				return false;
		}
		return false;
	}
	
	@Override
	public int compare(Member2 mem1, Member2 mem2) { 
		return (mem1.getMemberId()- mem2.getMemberId()); 
		//두 매개변수를 비교
		//오름차순 정렬
	}
	
}
