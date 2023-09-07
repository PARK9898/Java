package main.classStudy.classCompare;

import java.util.Comparator;

public class CloseToInt implements Comparator<Integer> {
	int closeTo;
	public CloseToInt(int closeTo) {
		this.closeTo = closeTo;
	} // 기준이 될 숫자

	@Override
	public int compare(Integer o1, Integer o2) {
		return (Math.abs(o1 - closeTo) - Math.abs(o2 - closeTo));
	}
	// 기준이 될 숫자와 얼마나 가까운지
}
