package main.classStudy.classReference2;

public class main {
	ChickenMenu[] menus = {
		new ChickenMenu("후라이드", 10000),
		new ChickenMenu("양념치킨", 12000),
		new ChickenMenu("화덕구이", 15000, "bake")
	};
	YalcoChicken store1 = new YalcoChicken(3, "판교", menus);

	ChickenMenu order1 = store1.orderMenu("양념치킨");
	ChickenMenu order2 = store1.orderMenu("오븐구이");

	public static void main(String[] args) {
		int int1 = 1;
		int int2 = int1;
		int1 = 2;

		String str1 = "헬로";
		String str2 = str1;
		str2 = "월드";

		ChickenMenu menu1 = new ChickenMenu("후라이드", 1000);
		ChickenMenu menu2 = menu1; //같은 객체를 바라본다
		menu1.price = 1200; //menu2 의 price도 1200으로 바뀐다

		int avgChickenPrice = 12000;
		ChickenMenu chickenMenu1 = new ChickenMenu("양념치킨", 12000);

		raisePrice(avgChickenPrice, chickenMenu1, 1000);
	}

	public static void raisePrice (int avg, ChickenMenu menu, int amount) {
		avg += amount; // 원문에 변경 x
		menu.price += amount; // 변경이 일어난다
	}
}

