package main.classStudy.classCompare;

import java.util.Comparator;

import main.Collection.Knight;
import main.Collection.MagicKnight;
import main.Collection.Swordman;
import main.Collection.Unit;
import main.classStudy.Generic1.Side;

public class UnitSorter implements Comparator<Unit> {
	@Override
	public int compare(Unit o1, Unit o2) {
		var result = getClassPoint(o2) - getClassPoint(o1);

		//  ⚠️ 제거하고 실행해 볼 것 - 내용이 같은 인스턴스들이 있을 시
		if (result == 0) result = o1.hashCode() - o2.hashCode(); // 이거 떄문에 블루, 레드 진영 기사의 중복이 제거된다

		return result;
	}

	public int getClassPoint (Unit u) {
		int result = u.getSide() == Side.RED ? 10 : 0;

		if (u instanceof Swordman) result += 1;
		if (u instanceof Knight) result += 2;
		if (u instanceof MagicKnight) result += 3;

		return result;
	}
}
