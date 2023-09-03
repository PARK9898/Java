package main.classStudy.innerClass2;

public class Main {
	public static void main(String[] args) {
		YalcoChicken.LaunchTF launchTF1 = new YalcoChicken.LaunchTF("마산", "김영희");
		YalcoChicken.LaunchTF launchTF2 = new YalcoChicken.LaunchTF("영월", "이철수");
		// 클래스가 정적요소인것이지 생성되는 launchTF1 과 2는 다른 주소값을 가진다
		YalcoChicken store1 = launchTF1.launch();
		YalcoChicken store2 = launchTF2.launch();
		//애는 얄코치킨 매장을 반환한다
		YalcoChicken.Gift [] gifts = {
			store1.getGift("홍길동"),
			store1.getGift("전우치"),
			store2.getGift("옥동자")
		};
	}
}
