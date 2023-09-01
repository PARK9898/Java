package main.classStudy.ExtendMethodOverriding;

public class ToggleButton extends Button {
	private boolean on;

	public ToggleButton(String print, boolean on) {
		super(print); // 부모의 생성자 호출
		this.on = on;
		//순서는 무조건 슈퍼 (부모)가 먼저오고 다음 자식의 생성자가 나중에 와야한다
	}

	@Override
	public void func () {
		super.func(); // 💡 부모에서 정의한 메소드 호출
		this.on = !this.on;
		System.out.println(
			"대문자입력: " + (this.on ? "ON" : "OFF")
		);
	}
}
