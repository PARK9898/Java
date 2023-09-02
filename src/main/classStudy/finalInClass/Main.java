package main.classStudy.finalInClass;

public class Main {
	public static void main(String[] args) {
		String ycCreed = YalcoChicken.CREED;
		//YalcoChicken.CREED = "우리의 튀김옷은 바삭하다"; // ⚠️ 불가 final이기 떄문에

		final YalcoChicken store1 = new YalcoChicken(3, "판교");

		//  ⚠️ 불가 store1 자체가 final로 생성되었기 떄문에
		//store1 = new YalcoChicken(17, "강남");
		//  💡 요소 변경은 가능
		store1.name = "선릉";

	}
}
