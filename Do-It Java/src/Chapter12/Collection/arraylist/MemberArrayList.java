package Chapter12.Collection.arraylist;

import java.util.ArrayList; //컬렉션 프레임워크는 java.util의 포함!!
import java.util.Collections;
import Chapter12.Collection.Member; //Member클래스를 사용하기위해 import
import java.util.Iterator; //Iterator 클래스 -> 28행

public class MemberArrayList {
	private ArrayList<Member> arrayList; //ArrayList <-> Vector
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>(); //ArrayList <-> Vector
	}
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) {
		/*
		for(int i=0; i<arrayList.size(); i++) {
			Member member = arrayList.get(i);
			int tempId = member.getMemberId();
			if (tempId == memberId) {
				arrayList.remove(i);
				return true;
			}
		}*/
		
		Iterator<Member> ir = arrayList.iterator(); //Iterator : Collection인터페이스를 구현한 객체의 모든 요소 참조 (순서가 없는 Set 인터페이스 때문에)
		while(ir.hasNext()) { //ir의 요소가 있나??
			Member member = ir.next(); //다음 요소
			int tmpId = member.getMemberId();
			if (tmpId == memberId) {
				arrayList.remove(member); //member는 순서가 없는 요소, 인덱스 대신 객체가 들어감
				return true;
			}
		}
		
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
		
	}
	public void showAllMember() {
		for(Member member:arrayList) {
			System.out.println(member); //Member클래스의 toString()호출
		}
		System.out.println();
	}
	public void change() { 
		Collections.synchronizedList(new ArrayList<String>()); //ArrayList를 Vector클래스처럼 변환
		//ArrayList와 Vector의 차이 : 동기화의 지원 여부
	}
}
