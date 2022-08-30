package Chapter12.GenericMethod;

public class GenericMethod {

	//���׸� Ŭ�����ʹ� �޸� ���׸� �޼ҵ�� static�� ��� ����
	//<T,V>�� �޼ҵ� �������� ��ȿ�ϴ�!
	public static <T,V> double makeRect(Point<T,V> p1, Point<T,V> p2){
		double left = ((Number)p1.getX()).doubleValue();
		double top = ((Number)p1.getY()).doubleValue();
		double right = ((Number)p2.getX()).doubleValue();
		double bottom = ((Number)p2.getY()).doubleValue();
		
		return (right-left)*(bottom-top);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point<Integer, Double> p1 = new Point<>(0,0.0);
		Point<Integer, Double> p2 = new Point<> (10, 10.0);
		
		double value = GenericMethod.makeRect(p1, p2);
		System.out.println("�� ������ ������� �簽���� ���̴�" + value + "�Դϴ�");
	}

}
