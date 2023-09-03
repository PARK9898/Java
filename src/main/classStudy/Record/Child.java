package main.classStudy.Record;

// ⭐️  레코드로 작성
// 레코드는 final이기 떄문에 상속이나 abstract로 선언 불가
// 레코드의 각 항목은 private. final 임
// 각각 같은 이름의 getter 가 자동으로 만들어
// 인스턴스 필드를 가질 수 없다
// 클래스 필드는 가능하다
public record Child(
	String name,
	int birthYear,
	Gender gender
) {}
