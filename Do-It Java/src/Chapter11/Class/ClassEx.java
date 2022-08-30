package Chapter11.Class;

//Person.java파일이 컴파일 되면서 Person.class파일 생성
//Class 클래스는 생성된 class파일의 저장된 정보를 가져오는데 사용

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Field;

public class ClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		
		Class pClass = person.getClass(); //person 객체의 클래스 정보를 pClass의 저장 (첫번째 방법)
		Class pClass2 = Person.class; //Person의 클래스 정보를 직접 저장 (두번째 방법)
		
		Constructor[] cons = pClass.getConstructors();
		Method[] method = pClass.getMethods();
		Field[] field = pClass.getFields();
		
		System.out.println("=====생성자=====");
		for (Constructor c:cons) {
			System.out.println(c);
		}
		System.out.println("=====메소드=====");
		for (Method m:method) {
			System.out.println(m);
		}
		
		System.out.println("=====변수=====");
		for (Field f:field) {
			System.out.println(f);
		}
		
		
	}

}
