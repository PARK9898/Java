package main.classStudy.staticClass3;

public class main {
	public static void main(String[] args) {
		Button button1 = new Button('1', 1);
		Button buttonPlus = new Button('+', 3);
		Button buttonClear = new Button('C', 2);

		Button[] buttons = {button1, buttonPlus, buttonClear};

		System.out.println(Button.mode);
		for (Button button : buttons) { button.place(); }

		//  연속으로 붙여넣어 실행해볼 것
		Button.switchMode(); // 모든 모드가 Dark로 바뀐다 (한번에 바꾸기 위해서) // 객체 생성 없이 바로 사용이 가능하다
		// 바탕화면의 모든 것을 한번에 바꿔야하니까 이런 부분에서 나중에 서비스 할 때 유용하게 쓰일 수 있겠네

		System.out.println(Button.mode);
		for (Button button : buttons) { button.place(); }
	}
}