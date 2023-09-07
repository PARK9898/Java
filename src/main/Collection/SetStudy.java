package main.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import main.classStudy.Generic1.Side;

public class SetStudy {
	public static void main(String[] args) {
		Set<Integer> intHSet1 = new HashSet<>();
		intHSet1.add(1);
		intHSet1.add(1);
		intHSet1.add(2);
		intHSet1.add(3);

		List<Integer> ints1 = new ArrayList<Integer>(Arrays.asList(1,1,2,2,3,3,4,5,6,7));
		Set<Integer> intHSet2 = new HashSet<>(ints1);

		//  💡 for-each문 사용 가능
		for (var i :intHSet1) {
			System.out.println(i);
		}

		//  ⭐️ 아래와 같이 응용 가능
		//  - 중복을 제거한 ArrayList
		// 이렇게 깔끔하게 중복을 없앨 수 있다
		// 해쉬 -> 동일한 입력 값 동일한 출력값
		ints1.clear();
		ints1.addAll(intHSet2);

		//  포함 여부
		boolean has2 = intHSet1.contains(2);
		boolean has4 = intHSet1.contains(4);

		//  요소 삭제, 있었는지 여부 반환
		boolean rm3 = intHSet1.remove(3);
		boolean rm4 = intHSet1.remove(4);


		//  다른 콜렉션 기준으로 내용 삭제
		intHSet2.removeAll(intHSet1);

		//  💡 그 외 size, isEmpty, clear, clone 등의 메소드들 확인

		//  참조형 관련
		Set<Swordman> swordmenSet = new HashSet<>();
		Swordman swordman = new Swordman(Side.RED);
		swordmenSet.add(swordman);
		swordmenSet.add(swordman);
		swordmenSet.add(new Swordman(Side.RED));
		swordmenSet.add(new Swordman(Side.RED));
		//  swordmenSet.remove(swordman); // 실행해보기

		HashSet<Integer> intHashSet = new HashSet<>();
		LinkedHashSet<Integer> intLinkedHashSet = new LinkedHashSet<>();
		TreeSet<Integer> intTreeSet = new TreeSet<>();

		for (int i : new int[] { 3, 1, 8, 5, 4, 7, 2, 9, 6}) {
			intHashSet.add(i);
			intLinkedHashSet.add(i);
			intTreeSet.add(i);
		}
		for (var s : new Set[] {intHashSet, intLinkedHashSet, intTreeSet}) {
			System.out.println(s);
		}
		//  ⭐️ LinkedHashSet : 입력된 순서대로 / TreeSet : 오름차순
		//  ⚠️ HashSet이 정렬된 것처럼 보이지만 보장된 것이 아님
		//  - Hash 방식에 의한 특정 조건에서의 정렬일 뿐
	}
}


//HashSet
// 성능이 빠르고 메모리 적게 사용
// 순서 관련 기능 없음 (보장하지 않음)
// LinkedHashSet
// 요소들을 입력 순서대로 정렬 (내부적으로 링크 사용)
// HashSet보다는 성능 떨어짐
// TreeSet
// 요소들을 특정 기준대로 정렬 (기본 오름차순)
// 데이터 추가/삭제에 시간 더 소모