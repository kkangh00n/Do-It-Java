package Chapter7;
//배열의 복사  *질문 : 주소복사인가 값 복사인가?*
public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = new int[] {10,20,30,40,50};
		int[] array2 = new int[] {1,2,3,4,5};
		
		System.arraycopy(array1,2,array2,2,3); //*array1의 인덱스 2부터 길이 3만큼, array2의 인덱스 3에 복사*
		
		System.out.println("===== array1 ===== ");
		for (int lang:array1)
		{
			System.out.println(lang);
		}
		
		System.out.println("===== array2 ===== ");
		for (int lang:array2) // => array2의 배열을 lang의 차례대로 저장하여 출력
		{
			System.out.println(lang);
		}
	}

}
