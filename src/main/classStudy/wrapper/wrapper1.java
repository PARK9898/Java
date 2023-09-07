package main.classStudy.wrapper;

public class wrapper1 {
	public static void main(String[] args) {
		//  원시 자료형
		int int1 = 123;
		double dbl1 = 3.14;
		char chr1 = 'A';
		boolean bln1 = true;

		//  ⭐ 해당 래퍼 클래스의 인스턴스
		//  기존의 생성자 방식
		//  ⚠️ 오늘날에는 deprecated - 성능상 좋지 않음
		Integer int2 = new Integer(123);
		Double dbl2 = new Double(3.14);
		Character chr2 = new Character('A');
		Boolean bln2 = new Boolean(true);

		//  💡 아래의 클래스 메소드들이 권장됨
		Integer int3 = Integer.valueOf(123);
		Double dbl3 = Double.valueOf(3.14);
		Character chr3 = Character.valueOf('A');
		Boolean bln3 = Boolean.valueOf(true);

		Number num1 = int1;
		Number num2 = dbl1;

		//  💡 박싱 : 원시값을 래퍼 클래스의 인스턴스로
		//  ⭐ 과거에는 생성자를 사용했으나 deprecated
		int intPrim1 = 123;
		Integer intInst1 = Integer.valueOf(intPrim1);

		char chrPrim1 = 'A';
		Character chrInst1 = Character.valueOf(chrPrim1);

		//  💡 언박싱 : 래퍼 클래스의 인스턴스를 원시값으로
		Double dblInst1 = Double.valueOf(3.14);
		double dblPrim1 = dblInst1.doubleValue();

		Boolean blnInst1 = Boolean.valueOf(true);
		boolean blnPrim1 = blnInst1.booleanValue();
	}
}
