package main.classStudy.EnumStudy1;

public class Main {
	public static void main(String[] args) {
		Button button1 = new Button();
		//활용도 높을 수 있다
		// 이 열거형은 이 버튼에 소속되어있구나 !
		button1.setMode(Button.Mode.DARK);
		button1.setSpace(Button.Space.DOUBLE);
	}
}
