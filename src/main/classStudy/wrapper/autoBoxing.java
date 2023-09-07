package main.classStudy.wrapper;

public class autoBoxing {
	public static void main(String[] args) {
		//static int add(Integer a, Integer b) { return a + b; }

		//  💡 오토박싱
		Integer intInst2 = 234;
		Double dblInst2 = 1.414213;

		//  💡 오토언박싱
		char chrPrim2 = Character.valueOf('B');
		boolean blnPrim2 = Boolean.valueOf(false);

		//  원시값과 래핑 클래스 인스턴스끼리의 연산
		//int intPrim2 = intPrim1 + intInst2;
		//Integer intInst3 = intPrim2 + intInst2;

		//  메소드 등 사용처들에 혼용 가능
		//Integer intInst4 = add(3, 5);
	}
}
