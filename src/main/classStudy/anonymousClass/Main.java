package main.classStudy.anonymousClass;

import main.classStudy.abstractClass.YalcoCafe;
import main.classStudy.abstractClass.YalcoChicken;
import main.classStudy.abstractClass.YalcoGroup;

public class Main {
	public static void main(String[] args) {
		//  💡 와일드카드로 임포트 - import sec05.chap08.ex01.*;
		// 익명 클래스는 다른 클래스나 인터페이스로부터 상속받아 만들어짐
		// 한 번만 사용되고 버려질 클래스스
		YalcoGroup store1 = new YalcoChicken("울산");
		YalcoGroup store2 = new YalcoCafe("창원", true);
		// 얄코 과메기 매장은 하나만 있으면 된다 그래서 부모 추상 클래스로부터 만들고 메소드를 오버라이딩 한다
		YalcoGroup store3 = new YalcoGroup (1, "포항") {
			//  원본 메소드에 public 추가
			@Override
			public void takeOrder() {
				System.out.printf(
					"유일한 얄코과메기 %s 과메기를 주문해주세요.%n",
					super.intro()
				);
			}
			// 자기 메서드는 독자적으로 만들 수 없다
			public void dryFish () {
				System.out.println("과메기 말리기");
			}
		};

		var store3Intro = store3.intro();
		store3.takeOrder();
		//store3.dryFish // ⚠️ 불가능

		System.out.println("\n- - - - -\n");

		for (var store : new YalcoGroup[] {store1, store2, store3}) {
			store.takeOrder();
		}

		Button button1 = new Button("Enter");
		Button button2 = new Button("CapsLock");
		Button button3 = new Button("ShutDown");

		//  ⭐️ IDE에서 회색으로 표시 : 이후 배울 람다로 대체
		button1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("줄바꿈");
				System.out.println("커서를 다음 줄에 위치");
			}
			// 익명으로 {} 이렇게 들어가있고 onClick을 오버라이딩 하고 있음
		});

		button2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("기본입력 대소문자 전환");
			}
		});

		button3.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("작업 자동 저장");
				System.out.println("프로그램 종료");
			}
		});

		for (var button : new Button[] {button1, button2, button3}) {
			button.func();
		}
	}
	// 결론 : 익명 클래스는 추상 클래스나 인터페이스를 상속받아서 사용한다 시작은 {} 이고 안에 메서드를 오버라이딩 하여
	// 독자적으로 클래스를 하나 만들어준다 -> 굳이 많이 사용되지 않을거 같은데 클래스로 만들기 좀 그런 객체들을 익명 클래스로 설정하면
	// 유용할거 같음 람다식 이전에 많이 사용되었음
}
