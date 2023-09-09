package main.functionalProgramming.javaUtilFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import main.Collection.Horse;
import main.Collection.Knight;
import main.Collection.MagicKnight;
import main.Collection.Swordman;
import main.Collection.Unit;
import main.classStudy.Generic1.Side;

public class Main {
	public static void main(String[] args) {
		Runnable dogButtonFunc = () -> System.out.println("멍멍");
		Runnable catButtonFunc = () -> System.out.println("야옹");
		Runnable cowButtonFunc = () -> System.out.println("음메");

		dogButtonFunc.run();
		catButtonFunc.run();
		cowButtonFunc.run();

		System.out.println("\n- - - - -\n");

		Button dogButton = new Button("강아지");
		dogButton.setOnClickListener(dogButtonFunc);

		Button catButton = new Button("고양이");
		catButton.setOnClickListener(() -> {
			System.out.println("- - - - -");
			System.out.println(catButton.getText() + " 울음소리: 야옹야옹");
			System.out.println("- - - - -");
		});

		dogButton.onClick();
		catButton.onClick();
		// 입력값 x 반환값 o
		Supplier<String> appName = () -> "얄코오피스";
		Supplier<Double> rand0to10 = () -> Math.random() * 10;
		Supplier<Boolean> randTF = () -> Math.random() > 0.5;

		var supp1 = appName.get();
		var supp2 = rand0to10.get();
		var supp3 = randTF.get();

		System.out.println("\n- - - - -\n");
		// 입력값 o 반환값 x
		Consumer<Integer> sayOddEven = i -> System.out.printf(
			"%d은 %c수입니다.%n", i, "짝홀".charAt(i % 2)
		);

		Consumer<Button> clickButton = b -> b.onClick();

		BiConsumer<Button, Integer> clickButtonNTimes = (b, n) -> {
			for (var i = 0; i < n; i++) { b.onClick(); }
		};

		sayOddEven.accept(3);
		sayOddEven.accept(4);
		clickButton.accept(catButton);
		clickButtonNTimes.accept(dogButton, 5);

		System.out.println("\n- - - - -\n");

		Function<Integer, Boolean> isOdd = i -> i % 2 == 1;
		Function<String, Button> getButton = s -> new Button(s);

		BiFunction<Unit, Horse, Integer> getfullHP = (u, h) -> {
			h.setRider(u);
			return u.hp;
		};

		BiFunction<String, Runnable, Button> getButtonWFunc = (s, r) -> {
			var b = new Button(s);
			b.setOnClickListener(r);
			return b;
		};

		var isOdd3 = isOdd.apply(3);
		var isOdd4 = isOdd.apply(4);

		var goatButton = getButton.apply("염소");

		var unitFullHP = getfullHP.apply(
			new MagicKnight(Side.RED), new Horse(80)
		);

		getButtonWFunc
			.apply("오리", () -> System.out.println("꽥꽥"))// 버튼이 반환
			.onClick(); // 버튼안에 Runnable을 실
		// 인자를 하나 받아서 불리언 반환
		Predicate<Integer> isOddTester = i -> i % 2 == 1;
		Predicate<String> isAllLowerCase = s -> s.equals(s.toLowerCase());
		// 인자를 두 개 받아서 불리언 반환
		BiPredicate<Character, Integer> areSameCharNum = (c, i) -> (int) c == i;
		BiPredicate<Unit, Unit> areSameSide = (u1, u2)  -> u1.getSide() == u2.getSide();

		var isOddT3 = isOddTester.test(3);
		var isOddT4 = isOddTester.test(4);
		var isAL1 = isAllLowerCase.test("Hello");
		var isAL2 = isAllLowerCase.test("world");

		var areSameCN1 = areSameCharNum.test('A', 64);
		var areSameCN2 = areSameCharNum.test('A', 65);

		var areSameSide1 = areSameSide.test(
			new Knight(Side.RED), new Knight(Side.BLUE)
		);
		var areSameSide2 = areSameSide.test(
			new Swordman(Side.BLUE), new MagicKnight(Side.BLUE)
		);
		// apply 인자를 넣는다 생각 한가지의 값은 받아서 같은 자료혀의 결과로 반환
		UnaryOperator<Integer> square = i -> i * i;
		UnaryOperator<Swordman> respawn = s -> {
			if (s instanceof MagicKnight) return new MagicKnight(s.getSide());
			if (s instanceof Knight) return  new Knight(s.getSide());
			return new Swordman(s.getSide());
		};

		var squared = square.apply(3);
		var respawned1 = respawn.apply(new Knight(Side.BLUE));
		var respawned2 = respawn.apply(new MagicKnight(Side.RED));
		// 이긴놈을 가져오는것
		BinaryOperator<Double> addTwo = (i, j) -> i + j;
		BinaryOperator<Swordman> getWinner = (s1, s2) -> {
			while (s1.hp > 0 && s2.hp > 0) {
				s1.defaultAttack(s2);
				s2.defaultAttack(s1);
				if (s1 instanceof MagicKnight) {
					((MagicKnight) s1).lighteningAttack(new Swordman[] {s2});
				}
				if (s2 instanceof MagicKnight) {
					((MagicKnight) s2).lighteningAttack(new Swordman[] {s1});
				}
			}
			if (s1.hp > 0) return s1;
			if (s2.hp > 0) return s2;
			return null; // if문에 안들어가면 뭐든 반환은 해야하기 때문에
		};

		var added = addTwo.apply(12.34, 23.45);

		var winner1 = getWinner.apply(new Swordman(Side.RED), new Knight(Side.BLUE));
		var winner2 = getWinner.apply(new MagicKnight(Side.RED), new Knight(Side.BLUE));
		var winner3 = getWinner.apply(new Swordman(Side.RED), new MagicKnight(Side.BLUE));
		var winner4 = getWinner.apply(new MagicKnight(Side.RED), new MagicKnight(Side.BLUE));

		System.out.println("\n- - - - -\n");

		// 💡 Iterable 인터페이스의  forEach 메소드
		// - 곧 배울 스트림의 forEach 와는 다름 (기능은 같음)
		// - Consumer를 인자로 받아 실행
		// - 이터레이터를 쓸 수 있는 클래스에서 사용 가능
		// forEach는 가서보면 Consumer<>를 인자로 받는다
		new ArrayList<>(
			Arrays.asList("하나", "둘", "셋", "넷", "댜섯")
		).forEach(s -> System.out.println(s)); // Consumer 인터페이스 자체가 안에 함수인거임 이름을 꼭 정해줘야하는것은 아니
		System.out.println("\n- - - - -\n");

		HashMap<String, Character> subjectGradeHM = new HashMap<>();
		subjectGradeHM.put("English", 'B');
		subjectGradeHM.put("Math", 'C');
		subjectGradeHM.put("Programming", 'A');

		//  💡 BiConsumer를 받음
		subjectGradeHM.forEach(
			(s, g) -> System.out.println(
				"%s : %c".formatted(s, g)
			)
		);
	}
}
