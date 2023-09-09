package main.functionalProgramming.SteamStudy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import main.Collection.Knight;
import main.Collection.MagicKnight;
import main.Collection.Swordman;
import main.Collection.Unit;
import main.classStudy.Generic1.Side;

public class Ex01 {
	public static void main(String[] args) {
		List<Integer> int0To9 = new ArrayList<>(
			Arrays.asList(5, 2, 0, 8, 4, 1, 7, 9, 3, 6)
		);

		//  홀수만 골라낸 다음 정렬하여 "1, 3, 5..."와 같은 문자열로 만들어보기
		//  기존의 방식
		List<Integer> odds = new ArrayList<>();
		for (var i : int0To9) {
			if (i % 2 == 1) odds.add(i);
		}
		odds.sort(Integer::compare);

		List<String> oddsStrs = new ArrayList<>();
		for (var i : odds) {
			oddsStrs.add(String.valueOf(i));
		}
		var oddsStr = String.join(", ", oddsStrs);

		String c = "asdjdsa";
		// c.chars() 는 c의 문자를 IntStream으로 반환한다
		Stream<Character> cStream = c.chars().mapToObj(a -> (char)a);
		// 일반 스트링에서 바로 stream을 붙히지 못한다ㅋ
		//  ⭐ 스트림을 사용한 방식
		//  각 라인이 무엇을 반환하는지 확인할 것
		// .stream() -> 스트림으로 만들어준다
		var oddsStrStreamed = int0To9
			.stream()
			.filter(i -> i % 2 == 1)
			.sorted(Integer::compare)
			.map(String::valueOf)// 반환형 스트링임 String에 있는 valueOf 씀 반환형과 .함수 가 일치
			.collect(Collectors.joining(", "));

		//  💡 배열로부터 생성 -> 문법은 Arrays.stream(integerAry)
		Integer[] integerAry = {1, 2, 3, 4, 5};
		Stream<Integer> fromArray = Arrays.stream(integerAry);
		var fromArray_Arr = fromArray.toArray();

		//  ⚠️ 런타임 에러
		//  - 스트림은 한 번 사용하면 끝 (흘러가버린 물)
		//var ifReuse = fromArray.toArray();

		//  원시값의 배열로부터는 스트림의 클래스가 달라짐
		int[] intAry = {1, 2, 3, 4, 5};
		IntStream fromIntAry = Arrays.stream(intAry);
		var fromIntAry_Arr = fromIntAry.toArray();

		double[] dblAry = {1.1, 2.2, 3.3};
		DoubleStream fromDblAry = Arrays.stream(dblAry);
		var fromDblAry_Arr = fromDblAry.toArray();

		//  💡 값들로 직접 생성
		IntStream withInts = IntStream.of(1, 2, 3, 4, 5);
		Stream<Integer> withIntegers = Stream.of(1, 2, 3, 4, 5);
		Stream<Unit> withUnits = Stream.of(
			new Swordman(Side.BLUE),
			new Knight(Side.BLUE),
			new MagicKnight(Side.BLUE)
		);
		var withUnits_Arr = withUnits.toArray();

		//  💡 컬렉션으로부터 생성
		List<Integer> intAryList = new ArrayList<>(Arrays.asList(integerAry));
		Stream fromColl1 = intAryList.stream();
		var fromColl1_Arr = fromColl1.toArray();

		//  맵의 경우 엔트리의 스트림으로 생성
		Map<String, Character> subjectGradeHM = new HashMap<>();
		subjectGradeHM.put("English", 'B');
		subjectGradeHM.put("Math", 'C');
		subjectGradeHM.put("Programming", 'A');
		var fromHashMap_Arr = subjectGradeHM.entrySet().stream().toArray();

		//  💡 빌더로 생성
		Stream.Builder<Character> builder = Stream.builder();
		builder.accept('스');
		builder.accept('트');
		builder.accept('림');
		builder.accept('빌');
		builder.accept('더');
		Stream<Character> withBuilder = builder.build();
		var withBuilder_Arr = withBuilder.toArray();

		//  💡 concat 메소드로 생성
		Stream<Integer> toConcat1 = Stream.of(11, 22, 33);
		Stream<Integer> toConcat2 = Stream.of(44, 55, 66);
		Stream<Integer> withConcatMethod = Stream.concat(toConcat1, toConcat2);
		var withConcatMethod_Arr = withConcatMethod.toArray();

		//  💡 이터레이터로 생성
		//  - 인자: 초기값, 다음 값을 구하는 람다 함수
		//  - limit으로 횟수를 지정해야 함
		Stream<Integer> withIter1 = Stream
			.iterate(0, i -> i + 2) // 시드는 첫 값
			.limit(10);
		var withIter1_Arr = withIter1.toArray();
		// 바로 스트림으로 생성 할 수도 있음
		Stream<String> withIter2 = Stream
			.iterate("홀", s -> s + (s.endsWith("홀") ? "짝" : "홀"))
			.limit(8);
		var withIter2_Arr = withIter2.toArray();

		//  💡 원시자료형 스트림의 기능들로 생성
		IntStream fromRange1 = IntStream.range(10, 20); // 20 미포함
		IntStream fromRange2 = IntStream.rangeClosed(10, 20); // 20 포함
		// stream의 자료형을 바꾸는것임 원시자료형에서 참조 자료형으로
		Stream<Integer> fromRangeBox = fromRange1.boxed();
		var fromRangeBox_Arr = fromRangeBox.toArray();

		//  💡 Random 클래스의 스트림 생성 메소드들
		IntStream randomInts = new Random().ints(5, 0, 100);
		var randomInts_Arr = randomInts.toArray();

		DoubleStream randomDbls = new Random().doubles(5, 2, 3);
		var randomDbls_Arr = randomDbls.toArray();

		//  문자열을 각 문자에 해당하는 정수의 스트림으로
		IntStream fromString = "Hello World".chars();
		var fromString_Arr = fromString.toArray();

		//  💡 파일로부터 생성
		//  - File I/O : 이후 배울 것
		Stream<String> fromFile;
		Path path = Paths.get("./src/sec09/chap04/turtle.txt");
		try {
			fromFile = Files.lines(path);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		var fromFile_Arr = fromFile.toArray();

		//  💡 빈 스트림 생성
		//  - 스트림을 받는 메소드 등에서 종종 사용
		Stream<Double> emptyDblStream = Stream.empty();
	}
}
