package main.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import main.classStudy.Generic1.Knight;
import main.classStudy.Generic1.MagicKnight;

public class ListStudy {
	public static void main(String[] args) {
		//  ⭐️ 제네릭을 사용하여 타입 지정
		//  - 붙이지 않을 시 <Object>와 동일
		ArrayList<Integer> ints1 = new ArrayList<>();
		ArrayList<String> strings = new ArrayList<>();
		ArrayList<Number> numbers = new ArrayList<>();
		ArrayList<Knight> knights = new ArrayList<>();

		ints1.set(2, 444); // 위치의 요소 수정
		ints1.add(0, 11); // 위치에 요소 추가 (다음 요소들 밀어냄)
		//  ⭐️ 간략한 생성 및 초기화 방법들
		ArrayList<Integer> ints2A = new ArrayList<>(
			Arrays.asList(1, 2, 3, 4, 5)
		); // 💡 Arrays 클래스 : 배열 관련 각종 기능 제공

		int ints1Size = ints1.size(); // 요소 개수
		boolean ints1IsEmpty = ints1.isEmpty(); // size가 0인지 여부 반환
		int ints12nd = ints1.get(1); // 인덱스로 요소 접근
		boolean ints1Con3 = ints1.contains(33); // 포함 여부
		boolean ints1Con6 = ints1.contains(66);

		//  요소 중복 허용
		for (var str : "바니 바니 바니 바니 당근 당근".split(" ")) {
			strings.add(str);
		}
		//
		// 이렇게 바로 사용가능하다


		ArrayList<Integer> ints2C = new ArrayList<>();
		Collections.addAll(ints2C, 1, 2, 3, 4, 5);

		ArrayList<Integer> ints2c = new ArrayList<>();
		Collections.addAll(ints2C, 1, 2, 3, 4, 5);

		//  💡 다른 Collection 인스턴스를 사용하여 생성
		ArrayList<Integer> ints3 = new ArrayList<>(ints1);

		//  스스로를 복제하여 반환 (⚠️ 얕은 복사)
		ArrayList<Integer> ints4 = (ArrayList<Integer>) ints3.clone();

		ints3.remove(4); // int: 인덱스로 지우기
		ints3.remove((Integer) 55); // 클래스 자료형: 요소로 지우기 // 해당 숫자를 지워라!! 명시적 변환을 해주면 55인덱스를  지우는게아니라 55 그 자체르 삭
		ints1.removeAll(ints3); // 주어진 콜렉션에 있는 요소들 지우기
		ints1.addAll(ints3); // 콜렉션 이어붙이기


		//  💡 toArray - Object 배열 반환
		Object[] intsAry2_Obj = ints1.toArray();

		//  ⭐️ 특정 타입의 배열로 반환하려면?
		//  Integer[] ints1Ary1 = (Integer[]) ints1.toArray(); // ⚠️ 이렇게는 불가
		//  💡 인자로 해당 타입 배열의 생성자를 넣어줌
		//  - 다음 섹션에 배울 메소드 참조 사용 (9-3강 수강 후 다시 볼 것)
		Integer[] ints1Ary2 = ints1.toArray(Integer[]::new);
		// 배열로 반환할 수 있음

		ints1.clear(); // 리스트 비움

		//  제네릭 적용
		numbers.add(Integer.valueOf(123));
		numbers.add(3.14);
		// numbers.add("Hello"); // ⚠️ 불가
		//
		// knights.add(new Swordman(Side.BLUE)); // ⚠️ 불가
		// knights.add(new Knight(Side.BLUE));
		// knights.add(new MagicKnight(Side.RED));

		//  와일드카드 적용
		//  기사 이상의 그룹으로만 편성될 수 있는 정예분대
		ArrayList<? extends Knight> eliteSquad;
		// Knight 자식들은 다 받을 수 있게 설정
		//eliteSquad = new ArrayList<Swordman>(); // ⚠️ 불가
		eliteSquad = new ArrayList<Knight>();
		eliteSquad = new ArrayList<MagicKnight>();
	}
}
