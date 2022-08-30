package Chapter11.String;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String javaStr = new String("java"); //힙 메모리에 저장
		String androidStr1 = "android"; //상수풀에 저장
		
		System.out.println(javaStr);
		System.out.println("연결 전 javaStr의 메모리 주소 값 : " + System.identityHashCode(javaStr));
		javaStr = javaStr.concat(androidStr1); //문자형 연결
		System.out.println(javaStr);
		System.out.println("연결 후 javaStr의 메모리 주소 값 : " + System.identityHashCode(javaStr)); //주소 값이 변함 -> 인스턴스 새로 생성 Because String class is final
		
		System.out.println("\n==========\n");
		
		StringBuilder javaStrbuilder = new StringBuilder("java");
		System.out.println(javaStrbuilder);
		System.out.println("연결 전 javaStrbuilder의 메모리 주소 값 : " + System.identityHashCode(javaStrbuilder));
		javaStrbuilder.append(" is fun");
		System.out.println(javaStrbuilder);
		System.out.println("연결 후 javaStrbuilder의 메모리 주소 값 : " + System.identityHashCode(javaStrbuilder));
		
	}
}
