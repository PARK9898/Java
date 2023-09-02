package main.classStudy.interface2;

public interface FoodSafety {
	//  ⭐️
	//  static 제거해 볼 것
	//  static abstract는 역시 불가 (추상 클래스처럼)
	// 일단 인터페이스는 메서드를 가질 수 있음
	// 인터페이스는 인스턴스를 가질 수 없다!!!
	// 자바 8 이전에는 추상 메서드만을 가질 수 있었음
	static void announcement () {
		System.out.println("식품안전 관련 공지");
	}

	//  ⭐️
	//  default 제거해 볼 것
	// 💡`default` 로 구상 메소드를 넣을 수 있도록 한 이유
	// 	-구상 메서드는 메서드의 실제 구현이 있는 메서드를 나타냄 하위 클래스에서 오버라이딩 하지 않아도 된다
	// - 사용되던 인터페이스에 새로운 기능을 추가해야 한다면?
	// 	- 새로운 자바 버전의 라이브러리 인터페이스에 새 기능이 추가되어야 한다면?
	// 	- 이를 적용하여 사용하던 클래스가 매우 많을 경우…
	// 	- 해당 인터페이스의 하위 클래스들을 일일이 수정하지 않아도 되도록
    // - **하위호환성**
	// 사용되던 인터페이스에 새로운 기능을 추가 해줘야하는데 이 인터페이스를 적용하는 클래스가 많은 경우
	// 하위 클래스들을 일일이 수정하지 않도록 하게함 (하위호환성)
	default void regularInspection () {
		System.out.println("정기 체크");
	}
	// 무조건 오버라이딩 해줘야함
	void cleanKitchen ();
	void employeeEducation ();
}
