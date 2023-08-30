package main.Type;

public class DoubleType {
	public static void main(String[] args) {
		double a = 0.1, b = 0.2;

		double c = a + b; //0.30000000000000004 원래 0.3이 나와야하는데 오류가 나옴
		//float -> 4byte
		//double -> 8byte 부동소수점 - > float보다 단순히 범위가 넓은 것이 아니라 보다 정밀하게 표현가능
		System.out.println(c);
		float fMin = -Float.MAX_VALUE; // float
		float fMax = Float.MAX_VALUE;
		double dMin = -Double.MAX_VALUE; // double
		double dMax = Double.MAX_VALUE;
		float fAbsMin = Float.MIN_VALUE;
		double dAbsMin = Double.MIN_VALUE;
		// double 의 범위도 넓고 정밀도도 높음을 확인 할 수 있음
		boolean bool1 = Float.MAX_VALUE < Double.MAX_VALUE;
		boolean bool2 = Float.MIN_VALUE > Double.MIN_VALUE;

		double dblNum = 0.123456789123456789; //정밀도 테스트
		float fltNum = 0.123456789123456789f; //f 적어줘야한다 f안적혀있으면 double로 인지하게 된다. float을 double에 담을 수 없음

		float flt01 = 0.2312f;
		float flt02 = 0.3213f;
		float flt03 = flt01 + flt02; //float끼리의 연산은 float을 반환한다
		double db04 = 0.32;
		double flt04 = flt01 +  db04; //float과 double의 연산은 double 을 반환한다
		int k = 3;
		int e = 4;
		// e = k / flt01; //오류 난다 float으로 맞춰줘야함
		int int2 = (int) flt01; // 소수 부분은 버리게 된다
	}

}

