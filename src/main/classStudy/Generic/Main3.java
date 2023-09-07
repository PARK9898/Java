package main.classStudy.Generic;

public class Main3 {
	public static void main(String[] args) {
		FormClicker<Button> fc1 = new FormClicker<>(new Button());
		FormClicker<Switch> fc2 = new FormClicker<>(new Switch(true));
		// 버튼과 스위치는 인터페이스 두 조건 만족하기 때문에 들어온다
		fc1.printElemMode();
		fc2.clickElem();

		//  ⚠️ 조건에 부합하지 않는 클래스 사용 불가
		// 	FormClicker<TextInput> fc3 = new FormClicker<>(new TextInput());
		// 	FormClicker<HyperLink> fc4 = new FormClicker<>(new HyperLink());
		// }
	}}
