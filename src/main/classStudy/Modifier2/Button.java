package main.classStudy.Modifier2;

public class Button {
	private static String mode = "LIGHT";
	// mode를 이상한걸로 외부에서 변경하지 못하게 할 수 있음
	public static void switchMode () {
		mode = mode.equals("LIGHT") ? "DARK" : "LIGHT";
	}

	private char print;
	private int space = 1;

	public Button (char print, int space) {
		this.print = print;
		this.space = space;
	}

	public void setSpace (int space) {
		if (space < 1 || space > 4) return;
		this.space = space;
	}
	public String getButtonInfo () {
		return "%c 버튼, %d픽셀 차지"
			.formatted(print, space * 4096);
	}
}