package main.classStudy.EnumStudy;

public class Main {
	public static void main(String[] args) {
		Button button1 = new Button();

		button1.setButtonMode(ButtonMode.DARK);
		button1.setButtonSpace(ButtonSpace.TRIPLE);

		//  ⚠️ 아래와 같은 오용이 방지됨
		// 가독성도 증가한다 무엇이 들어가야할지 한 눈에 알 수 있음
		//button1.setButtonMode(ButtonSpace.DOUBLE);
	}
}
