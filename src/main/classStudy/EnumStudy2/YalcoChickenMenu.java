package main.classStudy.EnumStudy2;

public enum YalcoChickenMenu {

	//메뉴가 작성되어있음음
	FR("후라이드", 10000, 0),
	YN("양념치킨", 12000, 1),
	GJ("간장치킨", 12000, 0),
	RS("로제치킨", 14000, 0),
	PP("땡초치킨", 13000, 2),
	XX("폭렬치킨", 13000, 3);
	// 얄코치킨 메뉴에서 사용될 필드들
	// 치킨메뉴 하나당 필드를 가지고 있음
	// 메뉴판 하나랑 진짜 시킬 메뉴가 뭔지 고르는거라고 생각하자
	private String name;
	private int price;
	private int spicyLevel;

	YalcoChickenMenu(String name, int price, int spicyLevel) {
		this.name = name;
		this.price = price;
		this.spicyLevel = spicyLevel;
	}

	public String getName() { return name; }
	public int getPrice() { return price; }
	// setter 도 사용가능
	public void setPrice(int price) {
		this.price = price;
	}

	public String getDesc () {
		String peppers = "";
		if (spicyLevel > 0) {
			peppers = "🌶️".repeat(spicyLevel);
		}

		return "%s %s원 %s"
			.formatted(name, price, peppers);
	}
}
