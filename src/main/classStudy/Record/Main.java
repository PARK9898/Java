package main.classStudy.Record;

public class Main {
	public static void main(String[] args) {
		Child child1 = new Child("홍길동", 2020, Gender.MALE);
		//  💡 toString 메소드 구현 (이후 배울 Object에서 상속받아 오버라이드)
		String childStr = child1.toString();
		//레코드의 정보를 보여줌 toString()은
		var children = new Child[] {
			new Child("김순이", 2021, Gender.FEMALE),
			new Child("이돌이", 2019, Gender.MALE),
			new Child("박철수", 2020, Gender.MALE),
			new Child("최영희", 2019, Gender.FEMALE),
		};

		for (var child : children) {
			System.out.printf(
				"%s %d년생 %s 어린이%n",
				child.gender().getEmoji(),
				child.birthYear(), // 자동으로 getter의 기능 사용가능
				child.name()
			);
		}
	}
}
