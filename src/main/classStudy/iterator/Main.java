package main.classStudy.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import main.Collection.Knight;
import main.Collection.MagicKnight;
import main.Collection.Swordman;
import main.Collection.Unit;
import main.classStudy.Generic1.Side;

public class Main {
	public static void main(String[] args) {
		Set<Integer> intHSet = new HashSet<>(
			Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9)
		);

		//  💡 이터레이터 반환 및 초기화
		//  - 기타 Collection 인터페이스를 구현한 클래스들에도 존재
		// 내부적으로 iterator 구현하고 있음
		Iterator<Integer> intItor = intHSet.iterator();

		// 💡 next : 자리를 옮기며 다음 요소 반환
		Integer int1 = intItor.next();
		Integer int2 = intItor.next();
		Integer int3 = intItor.next();

		//  💡 hasNext : 순회가 끝났는지 여부 반환
		boolean hasNext = intItor.hasNext();

		//  ⭐️ 순회 초기화
		intItor = intHSet.iterator();

		//  💡 remove : 현 위치의 요소 삭제
		while (intItor.hasNext()) {
			if (intItor.next() % 3 == 0) {
				intItor.remove();
			}
		}

		//  ⚠️ foreach 문으로 시도하면 오류
		for (Integer num : intHSet) {
			if (num % 3 == 0) intHSet.remove(num);
		} // for each 문제서 어떤 컬랙선의 요소 삭제하는 것은 금지 순회 중간에 길이 변화가 일어나기 때문에

		List<Unit> enemies = new ArrayList<>(
			Arrays.asList(
				new Swordman(Side.RED),
				new Knight(Side.RED),
				new Swordman(Side.RED),
				new Swordman(Side.RED),
				new Knight(Side.RED),
				new Knight(Side.RED),
				new Swordman(Side.RED),
				new MagicKnight(Side.RED),
				new Swordman(Side.RED),
				new MagicKnight(Side.RED),
				new Knight(Side.RED),
				new MagicKnight(Side.RED))
		);

		Iterator<Unit> enemyItor = enemies.iterator();

		var thunderBolts = 3;
		var fireBalls = 4;

		while (enemyItor.hasNext() && thunderBolts-- > 0) {
			var enemy = enemyItor.next();
			System.out.printf("%s 벼락 공격%n", enemy);
			enemy.hp -= 50;
		} // 다음 적이 죽지 않거나 썬더볼트가 남아있을떄까지 전체 공격
		while (enemyItor.hasNext() && fireBalls-- > 0) {
			var enemy = enemyItor.next();
			System.out.printf("%s 파이어볼 공격%n", enemy);
			enemy.hp -= 30;
		}
		while (enemyItor.hasNext()) {
			var enemy = enemyItor.next();
			System.out.printf("%s 화살 공격%n", enemy);
			enemy.hp -= 10;
		}

		System.out.println("\n- - - - -\n");

		Map<Integer, Double> hashMap = new HashMap<>();
		for (var i = 0; i < 10; i++) {
			hashMap.put(i + 1, Math.random() * 10);
		}

		//  ⭐️ 맵의 경우는 아래와 같이 이터레이션
		//  - 키, 값 또는 엔트리의 컬렉션을 반환받아 이터레이트
		// 맵은 약간 다름 왜냐면 키와 value가 존재 엔트리에는 키와 벨류 둘다 존재
		Iterator<Integer> hmKeyItor = hashMap.keySet().iterator();
		Iterator<Double> hmValueItor = hashMap.values().iterator();
		Iterator<Map.Entry<Integer, Double>> hmEntryItor = hashMap.entrySet().iterator();
		//맵을 직접 다루는것은 아니다!!!
		while (hmKeyItor.hasNext()) {
			System.out.println(hmKeyItor.next());
		}
		System.out.println("\n- - - - -\n");

		while (hmValueItor.hasNext()) {
			System.out.println(hmValueItor.next());
		}
		System.out.println("\n- - - - -\n");

		while (hmEntryItor.hasNext()) {
			System.out.println(hmEntryItor.next());
		}
	}
}
