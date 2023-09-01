package main.classStudy.ClassExtend;

public class YalcoChickenDT extends YalcoChicken {
	private boolean driveThruOpen = true;

	public YalcoChickenDT(int no, String name) {
		super(no, name); // 다음 예제에서 다룰 것
	}

	public void setDriveThruOpen(boolean driveThruOpen) {
		this.driveThruOpen = driveThruOpen;
	}
	// 얄코치킨들의 기능과 필드들을 기입하지 않아도 다 가지고 있
	public void takeDTOrder () {
		System.out.printf(
			"%d호 %s점 드라이브스루 주문 %s%n",
			no, name,
			(driveThruOpen ? "받음" : "불가")
		);
	}
}