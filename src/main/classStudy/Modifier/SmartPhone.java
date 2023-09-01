package main.classStudy.Modifier;

public class SmartPhone {
		String powerButton = "OnOff"; // public이 안붙어있기 때문에 다른 패키지에서 사용불가
		public String sdCardSlot = "SD Card";
		private String cpu = "Yalcom";

		//public -> 다 가능
		//protected -> 해당 클래스 , 동일 패키지 , 자손 클래스 가능
		//default -> 해당 클래스 , 동일 패키지 내
		//private -> 해당 클래스 내

}
