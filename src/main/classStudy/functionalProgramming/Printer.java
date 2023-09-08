package main.classStudy.functionalProgramming;


// - 조건 : 추상 메소드가 **하나(만)** 있어야 함
// 	- 람다식과 1:1로 대응될 수 있어야 하므로
// 	- `@FunctionalInterface` 로 강제
// 	- 클레스 메소드와 `default` 메소드는 여럿 있을 수 있음
// 	- 예외 있음 *(하단에서 다룰 것)*
@FunctionalInterface // 람다식 형태로 익명 클래스가 만들어질 수 있는 인터페이
public interface Printer {
	void print ();

	//  void say (); // ⚠️ 둘 이상의 메소드는 불가
}
