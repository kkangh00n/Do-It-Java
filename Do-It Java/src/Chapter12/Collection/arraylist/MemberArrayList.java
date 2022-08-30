package Chapter12.Collection.arraylist;

import java.util.ArrayList; //�÷��� �����ӿ�ũ�� java.util�� ����!!
import java.util.Collections;
import Chapter12.Collection.Member; //MemberŬ������ ����ϱ����� import
import java.util.Iterator; //Iterator Ŭ���� -> 28��

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
		
		Iterator<Member> ir = arrayList.iterator(); //Iterator : Collection�������̽��� ������ ��ü�� ��� ��� ���� (������ ���� Set �������̽� ������)
		while(ir.hasNext()) { //ir�� ��Ұ� �ֳ�??
			Member member = ir.next(); //���� ���
			int tmpId = member.getMemberId();
			if (tmpId == memberId) {
				arrayList.remove(member); //member�� ������ ���� ���, �ε��� ��� ��ü�� ��
				return true;
			}
		}
		
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
		
	}
	public void showAllMember() {
		for(Member member:arrayList) {
			System.out.println(member); //MemberŬ������ toString()ȣ��
		}
		System.out.println();
	}
	public void change() { 
		Collections.synchronizedList(new ArrayList<String>()); //ArrayList�� VectorŬ����ó�� ��ȯ
		//ArrayList�� Vector�� ���� : ����ȭ�� ���� ����
	}
}
