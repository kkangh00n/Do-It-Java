package Chapter7;
//�迭�� ����  *���� : �ּҺ����ΰ� �� �����ΰ�?*
public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = new int[] {10,20,30,40,50};
		int[] array2 = new int[] {1,2,3,4,5};
		
		System.arraycopy(array1,2,array2,2,3); //*array1�� �ε��� 2���� ���� 3��ŭ, array2�� �ε��� 3�� ����*
		
		System.out.println("===== array1 ===== ");
		for (int lang:array1)
		{
			System.out.println(lang);
		}
		
		System.out.println("===== array2 ===== ");
		for (int lang:array2) // => array2�� �迭�� lang�� ���ʴ�� �����Ͽ� ���
		{
			System.out.println(lang);
		}
	}

}
