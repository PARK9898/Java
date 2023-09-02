package main.classStudy.ClassExtend;

public class Main {
	public static void main(String[] args) {
		YalcoChickenDT dtStore1 = new YalcoChickenDT(108, "철원");

		dtStore1.takeHallOrder();

		dtStore1.takeDTOrder();
		dtStore1.setDriveThruOpen(false);
		dtStore1.takeDTOrder();


		System.out.println("\n- - - - -\n");

		YalcoChicken ycStores[] = {
			new YalcoChicken(3, "판교"),
			new YalcoChicken(17, "강남"),
			new YalcoChickenDT(108, "철원"),

		};
		// 그냥 얄코치킨 형으로 들어가있음
		// 자식과 부모를 묶어서 부모로 쓸 때 이렇게 기능별로 따로 처리해줄 수 있다
		for (YalcoChicken store : ycStores) {
			if (store instanceof YalcoChickenDT) {
				//  ⭐️ 자식 클래스의 기능을 사용하려면 명시적 타입 변환
				((YalcoChickenDT) store).takeDTOrder();
				//store.takeDTOrder() -> 이렇게 하면 오류가난다 이 store는 얄코치킨으로  자기떄문이다
			} else {
				store.takeHallOrder();
			}
		}
	}
}
