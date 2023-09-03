package main.classStudy.BlockScope;

public class Example {
	public static void main(String[] args) {
		//System.out.println(a);
		// 바깥쪽 이름을 안쪽에서 재선언 불가
		String str = "바깥쪽";
		{
		//	String str = "안쪽"; // ⚠️ 불가
		}

		while (true) {
		//	String str = "안쪽"; // ⚠️ 불가
		}
	}

	//private String y = x; // ⚠️ 클래스 내 필드의 스코프 : 해당 클래스 안
	private int a = 1;
	private int b = a + 1;
	//private int c = d + 1; // ⚠️ 메소드 내 변수의 스코프 : 해당 메소드 안

	public void func1 () {
		System.out.println(a + b);
		int d = 2;
	}

	//public void func2 () {
		//System.out.println(d); // ⚠️
	}

