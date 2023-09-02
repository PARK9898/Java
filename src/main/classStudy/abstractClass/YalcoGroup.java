package main.classStudy.abstractClass;

public abstract class YalcoGroup {
	protected static final String CREED = "우리의 %s 얄팍하다";

	//  💡 클래스 메소드(static 메소드)는 abstract 불가
	//  abstract static String getCreed ();

	protected final int no;
	protected final String name; // -> 자식들이 물려받아야하기 때문에

	public YalcoGroup(int no, String name) {
		this.no = no;
		this.name = name;
	}

	public String intro () {
		return "%d호 %s점입니다.".formatted(no, name);
	}
	//  이후 다른 패키지에서의 실습을 위해 public으로
	public abstract void takeOrder (); // abstract 메소드 -> 선언만 하고 구현은 x 자식들이 구현함 무조건 자식 클래스에서 구현해줘야함
}
