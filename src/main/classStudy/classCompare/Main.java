package main.classStudy.classCompare;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

import main.Collection.Knight;
import main.Collection.MagicKnight;
import main.Collection.Swordman;
import main.Collection.Unit;
import main.classStudy.Generic1.Side;

public class Main {
	public static void main(String[] args) {
		Integer[] nums = {3, 8, 1, 7, 4, 9, 2, 6, 5};
		Arrays.sort(nums, new IntDescComp()); // 내림차순 정지
		Arrays.sort(nums, new CloseToInt(5)); // 가까운 순 정렬

		String[] strs = {
			"Fox", "Banana", "Elephant", "Car", "Apple", "Game", "Dice"
		};
		//  ⭐️ 익명 클래스, 이후 배울 람다로 더 간편하게
		Arrays.sort(strs, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
		});

		TreeSet<Unit> unitTSet = new TreeSet<>(new UnitSorter()); // 비교해주는 기준이 없었기 떄문에 TreeSet에 생성자 못 만들었다 생성자만 못만드는것임 넣는것은 할 수있었음
		for (var u : new Unit[] { // 트리셋은 비교하는 기준이 있어야 다른 인스턴스라도 넣어줄 수 있다
			new Knight(Side.BLUE),
			new Knight(Side.BLUE), // 중복
			new Swordman(Side.RED),
			new Swordman(Side.RED), // 중복
			new MagicKnight(Side.BLUE),
			new Swordman(Side.BLUE),
			new MagicKnight(Side.RED),
			new Knight(Side.RED)
		}) {
			unitTSet.add(u);
		} //  💡 구분되는 기준이 없는 인스턴스는 같은 것으로 인식되어 삽입 안 됨 (셋이므로)
	}
}
