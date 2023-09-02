package main.classStudy.finalInClass;

//상속 불가(정관 수술 했다고 생각)
public final class YalcoChickenDT extends YalcoChicken {
	public YalcoChickenDT(int no, String name) {
		super(no, name);
	}

	//  ⚠️ 불가 부모 클래스의 메소드에서 final로 설정 되어있기 때문임
	// public void fryChicken () {
	// 	System.out.println("염지, 반죽입히기, 미원, 튀김");
	// }

	// 생성자 추가할 것
}