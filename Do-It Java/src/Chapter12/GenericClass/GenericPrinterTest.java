package Chapter12.GenericClass;

public class GenericPrinterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericPrinter<Powder> printer1 = new GenericPrinter<> (new Powder()); //�Ŀ���� ����ϴ� 3D������ ��ü
		Powder powder1 = printer1.getMaterial(); //���׸� �޼ҵ� �̿��� ��ȯ
		System.out.println(printer1.toString());
		printer1.printing();
		
		Plastic plastic = new Plastic();
		GenericPrinter<Plastic> printer2 = new GenericPrinter<> (plastic); //�ö�ƽ�� ����ϴ� 3D������ ��ü
		Plastic plastic1 = printer2.getMaterial(); //���׸� �޼ҵ� �̿��� ��ȯ
		System.out.println(printer2.toString());
		printer2.printing();
	}

}
