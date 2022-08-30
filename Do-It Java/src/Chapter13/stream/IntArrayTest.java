package Chapter13.stream;

// 정수 배열에 대한 스트림 활용

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class IntArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {5,7,3,1,4,2,8,0}; //정수 배열
		IntStream stream = Arrays.stream(arr); //정수 스트림 객체 생성
		stream.sorted().forEach(x -> System.out.println(x)); //스트림 정렬하여 출력
		System.out.println(arr[0]);
		
		String[] arr2 = {"이무성", "김강훈", "양희준", "이기우"}; //문자열 배열
		Stream<String> stream2 = Arrays.stream(arr2); //문자열 스트림 객체 생성
		stream2.forEach(x -> System.out.println(x));  //스트림 출력
		
		
		int sumVal = Arrays.stream(arr).sum(); //스트림 새로 생성.스트림의 합
		int count = (int)Arrays.stream(arr).count(); //스트림 새로 생성.배열의 수
		
		System.out.println(sumVal);
		System.out.println(count);
	}

}
