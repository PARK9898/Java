package main.classStudy.classBasic;

public class YalcoChicken {
	//  인스턴스가 가질 필드(field)들
	int no;
	String name;
	public YalcoChicken(int no, String name) {
		this.no = no;
		this.name = name;
	}
	// 이름이 겹칠때는 꼭 this를 사용해줘야한다! 매개변수로 no와 name이 정확히 들어오기 때문에 this가 필요하다
	// ⭐️⭐️⭐️ this -> 만들어질 인스턴스를 가르킨다
	//  인스턴스가 가질 필드(field)들

	//  인스턴스가 가질 메소드 - 💡 static을 붙이지 않음
	String intro () {
		String name = "몽고반";
		// no와 name 앞에 this를 붙인 것과 같음
		return "안녕하세요, %d호 %s점입니다."
			.formatted(no, this.name); //this 안붙히면 봉고반이 출력됨을 알 수 있다
	}
}