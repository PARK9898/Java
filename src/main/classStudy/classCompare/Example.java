package main.classStudy.classCompare;

import java.util.Arrays;

// - 둘 모두 인터페이스
// 	- `Comparable` *(비교의 대상)* : 자신과 다른 객체를 비교
// 	- 숫자 클래스들, 불리언, 문자열
// 자기자신이 비교
// 	- 이후 배울 `Date`, `BigDecimal`, `BigInteger` 등
// 	- `Comparator` *(비교의 주체)* : 주어진 두 객체를 비교
// 	- 컬렉션에서는 정렬의 기준으로 사용
// -심판
// 	- `Arrays`의 정렬 메소드, `TreeSet`이나 `TreeMap`등의  생성자에 활용
public class Example {
	public static void main(String[] args) {
		Integer int1 = Integer.valueOf(1); // 객체로 반환
		Integer int2 = Integer.valueOf(2);
		Integer int3 = Integer.valueOf(3);

		//  대상보다 작을 때: 음수, 같거나 클 때: 양수
		int _1_comp_3 = int1.compareTo(3); // 자기 객관화가 된다 자기가 크면 양수 자기가 작으면 음수 반환
		int _2_comp_1 =  int2.compareTo(1);
		int _3_comp_3 =  int2.compareTo(1);
		int _t_comp_f = Boolean.valueOf(true).compareTo(Boolean.valueOf(false)); // 자신과 다른 불리언을 비교
		int _abc_comp_def = "ABC".compareTo("DEF"); // 자기가 앞에 오니까 양수 반환
		int _def_comp_abc = "efgh".compareTo("abcd");

		Integer[] nums = {3, 8, 1, 7, 4, 9, 2, 6, 5};
		String[] strs = {
			"Fox", "Banana", "Elephant", "Car", "Apple", "Game", "Dice"
		};

		//  ⭐️ Arrays 클래스의 sort 메소드
		//  - 기본적으로 compareTo에 의거하여 정렬
		//  - 인자가 없는 생성자로 생성된 TreeSet, TreeMap도 마찬가지
		Arrays.sort(nums);
		Arrays.sort(strs);
	}
}
