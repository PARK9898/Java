package main.Type;

public class StringType2 {
	public static void main(String[] args) {
		String str_a1 = "안녕";

		boolean bool_a1 = str_a1.equals("안녕");

		boolean bool_a2 = "안녕".equals("안녕");
		boolean bool_d3 = "안녕".equals(str_a1);

		String str_b1 = "Hello, ";
		String str_b2 = "world!" ;

		String str_b3 = str_b1 + str_b2; // 이어붙힌 결과를 반환한다.

		String str_c1 = "나는 아무 생각이 없다. ";
		str_c1 += "왜냐하면 ";

		String str_c2 = str_c1 += "아무 생각이 없기 때문이다";

		boolean bool_c = (str_c1).equals(str_c2);

	}
}
