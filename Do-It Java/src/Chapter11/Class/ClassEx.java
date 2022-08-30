package Chapter11.Class;

//Person.java������ ������ �Ǹ鼭 Person.class���� ����
//Class Ŭ������ ������ class������ ����� ������ �������µ� ���

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Field;

public class ClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		
		Class pClass = person.getClass(); //person ��ü�� Ŭ���� ������ pClass�� ���� (ù��° ���)
		Class pClass2 = Person.class; //Person�� Ŭ���� ������ ���� ���� (�ι�° ���)
		
		Constructor[] cons = pClass.getConstructors();
		Method[] method = pClass.getMethods();
		Field[] field = pClass.getFields();
		
		System.out.println("=====������=====");
		for (Constructor c:cons) {
			System.out.println(c);
		}
		System.out.println("=====�޼ҵ�=====");
		for (Method m:method) {
			System.out.println(m);
		}
		
		System.out.println("=====����=====");
		for (Field f:field) {
			System.out.println(f);
		}
		
		
	}

}
