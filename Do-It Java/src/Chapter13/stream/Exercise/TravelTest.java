package Chapter13.stream.Exercise;

import java.util.ArrayList;

public class TravelTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TravelCustomer lee = new TravelCustomer("이기우", 25, 100);
		TravelCustomer kim = new TravelCustomer("김강훈", 26, 100);
		TravelCustomer yang = new TravelCustomer("양희준", 24, 50);
		ArrayList<TravelCustomer> list = new ArrayList<>();
		list.add(lee);
		list.add(kim);
		list.add(yang);
		
		//1. 고객명단출력
		list.stream().sorted().map(c -> c.getName()).forEach(c -> System.out.println(c));
		System.out.println();
		//2. 여행 총 비용 계산
		int total = list.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println(total);
		System.out.println();
		//3. 25세 이상인 사람의 이름 정렬
		list.stream().filter(c -> c.getAge() >= 25).map(c -> c.getName()).forEach(System.out::println);
		System.out.println();
	}

}
