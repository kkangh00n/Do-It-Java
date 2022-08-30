package Chapter12.Map.hashmap;
import java.util.HashMap;
import java.util.Iterator;

import Chapter12.Collection.Member;

public class MemberHashMap {
	private HashMap<Integer, Member> hashMap; //���׸� ���� �ڷ����� 2���� ��
	
	public MemberHashMap () {
		hashMap = new HashMap<>();
	}
	
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member); //key = memberId, value = member
	}
	
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) { //hashMap�� memberId�� Ű�� �ִٸ�
			hashMap.remove(memberId);
			return true;
		}
		System.out.println(memberId + "�� �������� �ʽ��ϴ�");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator(); //Map�� key�� Set���� ��ȯ�ϰ� Iterator������ ��ȯ
		while (ir.hasNext()) { //key���� ��� �����ϸ�
			int key = ir.next();
			Member member = hashMap.get(key); //key�� �ش��ϴ� value�� member�� ��ȯ!
			System.out.println(member);
			
		}
		System.out.println();
	}
}
