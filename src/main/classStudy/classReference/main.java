package main.classStudy.classReference;

public class main {
	public static void main(String[] args) {
		Slime slime1 = new Slime();
		Slime slime2 = new Slime();

		slime1.attack(slime2);
		//⭐️ 객체는 참조형 - 인자로 전달될 시 내용이 변경될 수 있음 실제 슬라임의 hp 가 깍인다

		int[] ary1 = {3, 5, 9, 2, 8, 1, 4};
		int[] ary2 = {382, 194, 27, 915, 138};

		IntArrayInfo aryInf1 = new IntArrayInfo(ary1);
		IntArrayInfo aryInf2 = new IntArrayInfo(ary2);

		int ary1Max = aryInf1.max;
		double ary2Avg = aryInf2.average;
		int ary1n2Sum = aryInf1.sum + aryInf2.sum;
	}
}
