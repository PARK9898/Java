package main.classStudy.Generic1;

public class Main {
	public static void main(String[] args) {
		//  아무 유닛이나 태우는 말
		Horse<Unit> avante = new Horse<>(); // ⭐️ Horse<Unit>에서 Unit 생략
		avante.setRider(new Unit());
		avante.setRider(new Knight());
		avante.setRider(new MagicKnight()); //상속 받은 것들은 자식이므로 가능

		//  기사 계급 이상을 태우는 말
		Horse<Knight> sonata = new Horse<>(); // Knight 생략
		//sonata.setRider(new Unit()); // ⚠️ 불가 부모를 자식에게 못 넣는다다		sonata.setRider(new Knight());
		sonata.setRider(new MagicKnight());

		//  마법기사만 태우는 말
		Horse<MagicKnight> grandeur = new Horse<>();
		//grandeur.setRider(new Unit()); // ⚠️ 불가
		//grandeur.setRider(new Knight()); // ⚠️ 불가
		grandeur.setRider(new MagicKnight());


		//  ⚠️ 자료형과 제네릭 타입이 일치하지 않으면 대입 불가
		//  - 제네릭 타입이 상속관계에 있어도 마찬가지
		//Horse<Unit> wrongHorse1 = new Horse<Knight>(); // 아무나 태울수 있는 말에 기사만 태울수 있는 말을 넣으면 대입이 안된다 // 이건 될 것 같은데?
		// 이미 결정되어 버렸다 ;; 말 자체에 대한 다형성 문제 wrongHorse
		//Horse<Knight> wrongHorse2 = new Horse<Unit>(); // 상속 관계라도 안된다 이거임
		//avante = sonata;
		//sonata = grandeur;

		//  ⭐️ 와일드카드 - 제네릭 타입의 다형성을 위함

		//  💡 Knight과 그 자식 클래스만 받을 수 있음
		//  기사 계급 이상을 태우는 말 이상만 대입할 받을 수 있는 변수
		Horse<? extends Knight> knightHorse; // Knight이하로는 다 대입이 가능해진다 객체 자체를 넣는 행위이
		//knightHorse = new Horse<Unit>(); // ⚠️ 불가
		knightHorse = new Horse<Knight>(); // 지정이 안되어있기 때문에 탈 수 있음
		knightHorse = new Horse<MagicKnight>();
		//knightHorse = avante; // ⚠️ 불가
		knightHorse = sonata;
		knightHorse = grandeur;

		//  💡 Knight과 그 조상 클래스만 받을 수 있음
		//  마법기사만 태우는 말은 받지 않는 변수
		Horse <? super Knight> nonLuxuryHorse;
		nonLuxuryHorse = avante;
		nonLuxuryHorse = sonata;
		//nonLuxuryHorse = grandeur; // 불가 (하한제한)

		//  💡 제한 없음 - <? extends Object>와 동일
		//  어떤 말이든 받는 변수
		Horse<?> anyHorse; // Unit 자식이면 아무거나 태울 수 있다 와일드카드는 선언할때 사용하는것임
		anyHorse = avante;
		anyHorse = sonata;
		anyHorse = grandeur;

		//  ⭐️ 제네릭은 변수에 들어올 값에 대한 제한
		//  - 데이터 그 자체에 대함이 아님
		Horse[] horses = { avante, sonata, grandeur };
		for (Horse horse : horses) {
			horse.setRider(new Unit());
		} // ⁉️ 에러 발생하지 않음 넘겨도 /
		 	}
}
