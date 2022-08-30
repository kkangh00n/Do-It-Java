package Chapter12.Map.hashmap;
import java.util.HashMap;
import java.util.Iterator;

import Chapter12.Collection.Member;

public class MemberHashMap {
	private HashMap<Integer, Member> hashMap; //제네릭 대입 자료형이 2개가 들어감
	
	public MemberHashMap () {
		hashMap = new HashMap<>();
	}
	
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member); //key = memberId, value = member
	}
	
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) { //hashMap에 memberId인 키가 있다면
			hashMap.remove(memberId);
			return true;
		}
		System.out.println(memberId + "가 존재하지 않습니다");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator(); //Map의 key를 Set으로 변환하고 Iterator형으로 변환
		while (ir.hasNext()) { //key값이 계속 존재하면
			int key = ir.next();
			Member member = hashMap.get(key); //key의 해당하는 value를 member의 반환!
			System.out.println(member);
			
		}
		System.out.println();
	}
}
