package Chapter12.GenericMethod;

public class GenericMethod {

	//제네릭 클래스와는 달리 제네릭 메소드는 static을 사용 가능
	//<T,V>는 메소드 내에서만 유효하다!
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
		System.out.println("두 점으로 만들어진 사갹형의 넓이는" + value + "입니다");
	}

}
