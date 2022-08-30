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
		return memberName + " ȸ������ ���̵��" + memberId + "�Դϴ�.";
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
	public int compareTo(Member member) { //�߰��� ȸ�����̵�(this)�� ���� ���(member)�� ��
		return (this.memberId - member.memberId); 
		//this : �߰��ϴ� ȸ��, member : �Ű������� ���� ������ ȸ��
		//�������� ����
	}
	
}
