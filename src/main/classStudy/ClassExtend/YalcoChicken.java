package main.classStudy.ClassExtend;

public class YalcoChicken {
	protected int no;
	protected String name; // protected 는 자손 클래스에서 사용가능 private은 물려는 주지만 자식 클래스에서 사용 불가!

	public YalcoChicken (int no, String name) {
		this.no = no;
		this.name = name;
	}

	public void takeHallOrder () {
		System.out.printf("%d호 %s점 홀 주문 받음%n", no, name);
	}
}
