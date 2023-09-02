package main.classStudy.finalInClass;

public class YalcoChicken {
	protected static final String CREED = "우리의 튀김옷은 얄팍하다.";

	private final int no;
	public String name;

	//  ⭐️ 필수 - no가 final이고 초기화되지 않았으므로 생성자 필수
	public YalcoChicken(int no, String name) {
		this.no = no;
		this.name = name;
	}
	// 자식쪽에서 오버라이딩 되지 못하도록함
	public void changeFinalFields () {
		// ⚠️ 불가
		//this.no++; -> final로 설정되어있기 때문에 값 변경이 불가능함
	}

	public final void fryChicken () {
		System.out.println("염지, 반죽입히기, 튀김");
	}
}