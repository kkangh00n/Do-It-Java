package Chapter11.String;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String javaStr = new String("java"); //�� �޸𸮿� ����
		String androidStr1 = "android"; //���Ǯ�� ����
		
		System.out.println(javaStr);
		System.out.println("���� �� javaStr�� �޸� �ּ� �� : " + System.identityHashCode(javaStr));
		javaStr = javaStr.concat(androidStr1); //������ ����
		System.out.println(javaStr);
		System.out.println("���� �� javaStr�� �޸� �ּ� �� : " + System.identityHashCode(javaStr)); //�ּ� ���� ���� -> �ν��Ͻ� ���� ���� Because String class is final
		
		System.out.println("\n==========\n");
		
		StringBuilder javaStrbuilder = new StringBuilder("java");
		System.out.println(javaStrbuilder);
		System.out.println("���� �� javaStrbuilder�� �޸� �ּ� �� : " + System.identityHashCode(javaStrbuilder));
		javaStrbuilder.append(" is fun");
		System.out.println(javaStrbuilder);
		System.out.println("���� �� javaStrbuilder�� �޸� �ּ� �� : " + System.identityHashCode(javaStrbuilder));
		
	}
}
