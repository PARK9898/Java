package main.classStudy.BlockScope;

public class Example2 {

	public static void main(String[] args) {
		new Example2().printKings();
	}
	String king = "사자"; // 이건 클래스의 필드

	void printKings () {
		String king = "여우"; // 💡 이건 메서드 안에서 사용된 변수수
		//  ⭐️ 인스턴스의 필드는 다른 영역으로 간주
		System.out.printf(
			"인스턴스의 왕은 %s, 블록의 왕은 %s%n", // 이 클래스 필드의 값이 들어감
			this.king, king
		);
	}
}
