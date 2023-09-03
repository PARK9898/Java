package main.classStudy.EnumStudy2;

public class Main {
	public static void main(String[] args) {
		YalcoChickenMenu menu1 = YalcoChickenMenu.YN;
		YalcoChickenMenu menu2 = YalcoChickenMenu.RS;
		YalcoChickenMenu menu3 = YalcoChickenMenu.XX;
		//메서드도 사용가능
		var menu1Name = menu1.getName();
		var menu2Price = menu2.getPrice();
		var menu1Desc = menu3.getDesc();
		menu1.setPrice(20000);
		//set 메소드도 가능
		//  ⭐️ 열거형의 메소드들
		// eNUM임
		var byNames = new YalcoChickenMenu[] {
			YalcoChickenMenu.valueOf("FR"),
			// 여기서 FR의 열거형을 내놓는다
			YalcoChickenMenu.valueOf("PP"),
			YalcoChickenMenu.valueOf("GJ"),
			//  YalcoChickenMenu.valueOf("NN"), // ⚠️ 런다임 에러
		};

		//  💡 name 메소드 : 각 항목의 이름 반환
		var names = new String[] {
			// enum 자체의 기능들임
			menu1.name(), menu2.name(), menu3.name()
		};

		//  💡 ordinal 메소드 : 순번 반환
		var orders = new int[] {
			// enum자체의 기능들임 몇 번째에 정의되어있는가를 반환
			menu1.ordinal(), menu2.ordinal(), menu3.ordinal()
		};

		//  💡 values 메소드 : 전체 포함된 배열 반환
		//  YalcoChickenMenu[] 자료형
		var menus = YalcoChickenMenu.values();
		// 메뉴 값들 전체를 받는것임
		for (var menu : menus) {
			System.out.println(menu.getDesc());
		}
	}
}
