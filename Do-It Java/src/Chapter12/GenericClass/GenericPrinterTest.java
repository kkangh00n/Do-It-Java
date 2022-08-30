package Chapter12.GenericClass;

public class GenericPrinterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericPrinter<Powder> printer1 = new GenericPrinter<> (new Powder()); //파우더를 사용하는 3D프린터 객체
		Powder powder1 = printer1.getMaterial(); //제네릭 메소드 이용한 반환
		System.out.println(printer1.toString());
		printer1.printing();
		
		Plastic plastic = new Plastic();
		GenericPrinter<Plastic> printer2 = new GenericPrinter<> (plastic); //플라스틱을 사용하는 3D프린터 객체
		Plastic plastic1 = printer2.getMaterial(); //제네릭 메소드 이용한 반환
		System.out.println(printer2.toString());
		printer2.printing();
	}

}
