package main.classStudy.polymorphism;

public class Main {
	public static void main(String[] args) {
		//  💡 가능 - 자식 클래스는 부모 클래스에 속함
		Button button1 = new Button("Enter");
		Button button2 = new ShutDownButton();
		Button button3 = new ToggleButton("CapsLock", true);
		// 위에 두 개 다 되는건데 이상하게 컴파일 오류가 남 ;
		// 자식 클래스의 인스턴스는 부모 클래스의 자료형에 속한다
		//  ⚠️ 불가
		//ShutDownButton button4 = new Button("Enter");
		//ToggleButton button5 = new ShutDownButton();

		//  ⭐️ 편의 : 모두 Button이란 범주로 묶어 배열 등에서 사용 가능
		Button[] buttons = {
			new Button("Space"),
			new ToggleButton("NumLock", false),
			new ShutDownButton()
		};

		for (Button button : buttons) {
			//  ⭐️ 모든 Button들은 func 메소드를 가지므로
			button.func();
		}

		Button button = new Button("버튼");
		ToggleButton toggleButton = new ToggleButton("토글", true);
		ShutDownButton shutDownButton = new ShutDownButton();

		//  true
		boolean typeCheck1 = button instanceof Button;
		boolean typeCheck2 = toggleButton instanceof Button;
		boolean typeCheck3 = shutDownButton instanceof Button;

		//  false
		boolean typeCheck4 = button instanceof ShutDownButton;
		boolean typeCheck5 = button instanceof ToggleButton;

		//  ⚠️ 컴파일 에러 토클 버튼과 셧다운 버튼은 아예 상속 관계가 아니기 때문에 컴파일 오류가난다
		// boolean typeCheck6 = toggleButton instanceof ShutDownButton;
		// boolean typeCheck7 = shutDownButton instanceof ToggleButton;

		Button[] buttons1 = {
			new Button("Space"),
			new ToggleButton("NumLock", false),
			new ShutDownButton()
		};
		//이런 코드 맛있다! 만약 그 버튼이 셧다운 버튼의 인스턴스이면 기능을 실행하지 않는다
		for (Button btn : buttons1) {
			if (btn instanceof ShutDownButton) continue; // ⭐️
			btn.func();
		}
	}


}
