package main.classStudy.Generic;

public class FormClicker<T extends FormElement & Clickable> {
	private T formElem;

	public FormClicker(T formElem) {
		this.formElem = formElem;
	}

	//  ⭐️ 조건의 클래스와 인터페이스의 기능 사용 가능
	//  - 자료형의 범위를 특정해주므로
	// 두 메서드를 가지고 있기 때문에 T라는 놈은 둘다 사용 가능하다
	public void printElemMode () {
		formElem.printMode();
	}

	public void clickElem () {
		formElem.onClick();
	}
}