package main.classStudy.staticClass2;

public class YalcoChicken {

	static String brand = "얄코치킨";
	static String contact () {
		return "%s입니다. 무엇을 도와드릴까요?".formatted(brand);
	}
	static int lastNo = 0; // ⭐️

	int no;
	//int no = ++lastNo; // 이렇게 해도 됨

	String name;

	YalcoChicken(String name) {
		// 클래스 변수를 활용하여 생성마다 새 번호 부여 (또는 위처럼)
		no = ++lastNo; // 정적필드를 1씩 늘려주면서 지점 번호를 부여해준다
		this.name = name;
	}

	String intro () {
		return "안녕하세요, %s %d호 %s호점입니다." // 🔴
			.formatted(brand, no, name);
	}
}
