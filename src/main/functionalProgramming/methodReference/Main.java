package main.functionalProgramming.methodReference;

import java.util.TreeSet;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {
	public static void main(String[] args) {
		//  클래스의 클래스 메소드에 인자 적용하여 실행
		// i를 가지고 다시 String.valueOf(i); 이 메소드를 실행시키는 것이므로 사실상 똑같다 생각한다
		Function<Integer, String> intToStrLD = (i) -> String.valueOf(i);
		Function<Integer, String> intToStrMR = String::valueOf;
		var intToStr = intToStrMR.apply(123);

		//  인자로 받은 인스턴스의 메소드 실행
		UnaryOperator<String> toLCaseLD = s -> s.toLowerCase();
		UnaryOperator<String> toLCaseMR = String::toLowerCase; // String에서 가지고 있는 메서드
		var toLCase = toLCaseMR.apply("HELLO");

		//  클래스의 생성자 실행
		Function<String, Button> strToButtonLD = s -> new Button(s);
		Function<String, Button> strToButtonMR = Button::new;
		Button button1 = strToButtonMR.apply("Dog");

		BiFunction<String, String, Button> twoStrToButtonLD = (s1, s2) -> new Button(s1, s2);
		BiFunction<String, String, Button> twoStrToButtonMR = Button::new;
		Button button2 = twoStrToButtonMR.apply("고양이", "야옹");
		button2.onClick();

		System.out.println("\n- - - - -\n");

		//  현존하는 인스턴스의 메소드 실행
		Runnable catCryLD = () -> button2.onClick();
		Runnable catCryMR = button2::onClick; //onClick 메서드는 Runnable로 정의 되어있으므로 가능하다
		catCryMR.run();

		//  💡 임의의 인스턴스의 메소드 참조
		// TreeSet은 인자로 Comparator을 받을 수 있다
		TreeSet<String> treeSetLD = new TreeSet<>((s1, s2) -> s1.compareTo(s2));
		TreeSet<String> treeSetMD = new TreeSet<>(String::compareTo);
	}
}
