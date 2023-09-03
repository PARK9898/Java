package main.classStudy.EnumStudy2;

public class YalcoChicken {
	static YalcoChickenMenu[] menus = YalcoChickenMenu.values();
	// 열거형의 메뉴들을 갖고있음
	// enum 인자로 이름 가격 맵기가 들어있음
	public void takeOrder (String menuName) {
		YalcoChickenMenu ordered = null;

		for (var menu : menus) {
			if (menu.getName().equals(menuName)) {
				ordered = menu;
			}
		}

		if (ordered == null) {
			System.out.println("해당 메뉴가 없습니다.");
			return;
		}

		System.out.println(
			ordered.getPrice() + "원입니다."
		);
	}
}