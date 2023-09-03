package main.classStudy.EnumStudy1;

public class Button {
	// Enum을 자료형으로 바로 설정할 수 있다
	enum Mode { LIGHT, DARK }
	enum Space { SINGLE, DOUBLE, TRIPLE }

	private Mode mode = Mode.LIGHT;
	private Space space = Space.SINGLE;

	public void setMode(Mode mode) {
		this.mode = mode;
	}

	public void setSpace(Space space) {
		this.space = space;
	}
}
