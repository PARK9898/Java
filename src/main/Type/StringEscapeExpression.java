package main.Type;

public class StringEscapeExpression {
	public static void main(String[] args) {
		//String st1 = "문자열에 "큰따옴표가" 안들어가짐" // 엔터도 안들어감
		// 이스케이프 표현
		// 큰따옴표 ->  \"
		// 작은따옴표 -> \'
		// 줄바꿈->\n
		// 탭->\t
		// 백슬레시 하나 -> \\
		String str2 = "문자열에 \"큰따옴표도\" \n엔터도 넣을 수 있다고?";

	}
}
