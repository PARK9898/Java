package main.classStudy.abstractClass1;

public class Button extends FormElement {
	private String print; // 추가적인 글씨가 있음

	public Button(int space, String print) {
		super(space);
		this.print = print;
	}

	@Override
	void func() {
		System.out.println(print + "입력 적용");
	}
}