package main.classStudy.Modifier;

public class Main {
	SmartPhone phone = new SmartPhone();

	String pb = phone.powerButton;
	String ss = phone.sdCardSlot;
	// String cu = phone.cpu; // ⚠️ 불가
	// "감춘다고 생각하지 말기"
	//phone. 했을 때 엄청엄청 뒤에 붙을게 많으면 불편하다
	//필드에 부적절한 값이 적용되는것을 방지
}
