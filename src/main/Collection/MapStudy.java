package main.Collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import main.classStudy.Generic1.Side;

public class MapStudy {
	public static void main(String[] args) {
		Map<Integer, String> numNameHMap = new HashMap<>();
		//  💡 put 메소드를 사용하여 키와 값 삽입
		numNameHMap.put(1, "홍길동");
		numNameHMap.put(2, "전우치");
		numNameHMap.put(3, "임꺽정");

		Map<String, Double> nameHeightHMap = new HashMap<>();
		nameHeightHMap.put("김철수", 176.8);
		nameHeightHMap.put("이장신", 187.4);
		nameHeightHMap.put("박숏달", 152.3);
		nameHeightHMap.put("정기준", 171.2);

		//  💡 putAll : 대상 맵으로부터 전부 가져옴
		Map<Integer, String> numNameHMapClone = new HashMap<>();
		numNameHMapClone.putAll(numNameHMap);

		//  💡 get 메소드에 키를 넣어 값 접근
		String no2 = numNameHMap.get(2);
		Double leeHeight = nameHeightHMap.get("이장신");
		//  ⚠️ 잘못된 키 입력시 null 반환
		String wrong1 = numNameHMap.get(0);
		Double wrong2 = nameHeightHMap.get(3);

		//  💡 keySet 메소드 - 키들의 Set(인터페이스) 반환
		Set<Integer> numSet = numNameHMap.keySet();
		Set<Integer> numHSet = new HashSet<>();
		numHSet.addAll(numSet);

		//  keySet을 활용한 for-each
		for (var n : numNameHMap.keySet()) {
			System.out.println(numNameHMap.get(n));
		}

		// 💡 containsKey / containsValue : 키 / 값 포함되는 쌍 있는지 확인
		boolean contains1 = nameHeightHMap.containsKey("박숏달");
		boolean contains2 = nameHeightHMap.containsKey("장롱달");
		boolean contains3 = nameHeightHMap.containsValue(171.2);

		//  💡 Entry 인터페이스 : 맵의 각 요소, 키와 값을 가짐
		//  - 클래스 살펴볼 것
		Set<Map.Entry<Integer, String>> numNameES = numNameHMap.entrySet();
		for (var entry : numNameES) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.printf("k: %d, v: %s%n", key, value);
			System.out.println(entry);
		}

		//  remove, clear, isEmpty 메소드들

		numNameHMap.remove(1); // 주어진 키가 있다면 삭제
		numNameHMap.remove(2, "황대장"); // 주어진 키와 값의 쌍이 있다면 삭제

		boolean isEmpty1 = nameHeightHMap.isEmpty();
		nameHeightHMap.clear();
		boolean isEmpty2 = nameHeightHMap.isEmpty();

		System.out.printf("\n- - - - -\n");

		Map<Attacker, Horse> atkrHrsHMap = new HashMap<>();

		Swordman kenshin = new Swordman(Side.RED);
		Knight lancelot = new Knight(Side.BLUE);

		atkrHrsHMap.put(kenshin, new Horse(40));
		atkrHrsHMap.put(lancelot, new Horse(50));
		atkrHrsHMap.put(new MagicKnight(Side.BLUE), new Horse(60));

		//  ⭐️ 키의 값이 참조형일 경우 변수 등에 저장되어 있어야 함
		Horse kenshinHorse = atkrHrsHMap.get(kenshin);
		Horse lancelotHorse = atkrHrsHMap.get(lancelot);
		//  ⚠️ 일반적인 방법으로는 꺼낼 수 없음 당연히 참조값은 다르니까
		Horse wrongHorse = atkrHrsHMap.get(new MagicKnight(Side.BLUE));

		//  이런 식으로밖에 꺼낼 수 없음 keySet으로 하나하나 돌면서 꺼내야한다 keyset으로 꺼내서 변환한다 키로 다 하나하나 까보는거
		for (var u : atkrHrsHMap.keySet()) {
			System.out.println(u + " : " + atkrHrsHMap.get(u));
		}

		//  💡 getOrDefault : 키에 해당하는 쌍이 없을 시 지정한 디폴트 값 반환
		String defName = numNameHMap.getOrDefault(10, "김대타");
		Horse defHorse = atkrHrsHMap.getOrDefault(new MagicKnight(Side.BLUE), new Horse(40));

		//  💡 Entry 인터페이스 : 맵의 각 요소, 키와 값을 가짐
		//  - 클래스 살펴볼 것
		Set<Map.Entry<Integer, String>> numName = numNameHMap.entrySet();
		for (var entry : numNameES) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.printf("k: %d, v: %s%n", key, value);
			System.out.println(entry); // 1 = 홍길동 이런식으로 나옴
		}

		//  remove, clear, isEmpty 메소드들

		numNameHMap.remove(1); // 주어진 키가 있다면 삭제
		numNameHMap.remove(2, "황대장"); // 주어진 키와 값의 쌍이 있다면 삭제

		boolean isEmpty3 = nameHeightHMap.isEmpty();
		nameHeightHMap.clear();
		boolean isEmpty4 = nameHeightHMap.isEmpty();

		// 트리맵 역시 key를 오름차순정렬해줌
	}
}
