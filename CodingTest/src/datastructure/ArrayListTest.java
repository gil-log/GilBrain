package datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		
		// 생성시에 매개값으로 용량 20 설정
		List<String> arrayList = new ArrayList<String>(20);
		
		// data 삽입
		arrayList.add("A");
		
		// 삽입하고 싶은 인덱스에 데이터 삽입
		arrayList.add(1,"B");
		
		// 사이즈 얻기
		int size = arrayList.size();
		
		// 해당 인덱스의 객체 가져오기
		String getStr = arrayList.get(1);
		
		// 해당 인덱스의 객체 삭제
		arrayList.remove(1);
		
		// 인덱스 1의 객체를 "AA"로 변경
		arrayList.set(1, "AA");
		
		// 해당 객체가 존재하면 true를 return
		boolean tr = arrayList.contains("A");
		
		// list가 비었으면 true를 return
		boolean fa = arrayList.isEmpty();
		
		// list 비우기
		arrayList.clear();
		
		//제너릭 타입에 맞게 asList()의 매개값을 순차적으로 입력하거나,
		List<String> list = Arrays.asList("가", "나");
		
		//제너릭 타입의 배열을 매개값으로 주면 데이터를 삽입하며 생성 할 수 있다.
		Integer [] intgerArray = {1,2,3};
		List<Integer> list2 = Arrays.asList(intgerArray);
		
		System.out.println(list.get(0));
		
	}
}
