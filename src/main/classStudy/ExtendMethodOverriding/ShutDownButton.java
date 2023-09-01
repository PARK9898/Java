package main.classStudy.ExtendMethodOverriding;

public class ShutDownButton extends Button {
	public ShutDownButton () {
		super("ShutDown"); // 💡 부모의 생성자 호출
		// 부모의 생성자를 먼저 호출하고 자식을 추가
	}

	//  💡 부모의 메소드를 override 부모가 가진 같은 이름의 메소드를 자식이무저다르게 정의
	@Override
	public void func () {
		System.out.println("프로그램 종료");
	}
}