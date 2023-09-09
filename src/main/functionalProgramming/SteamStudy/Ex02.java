package main.functionalProgramming.SteamStudy;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Ex02 {
	public static void main(String[] args) {
		IntStream
			.range(1, 100)
			.filter(i -> i % 2 == 0) // 중간 과정이다 Predicate에 충족하는 요소만 남긴다
			//  💡 아래의 중간과정을 하나하나 주석해제해 볼 것
			//.skip(10)
			//.limit(10)
			//.map(i -> i * 10) // Function<> 사용 하나를 받아서 하나의 결과물을 내는것
			.forEach(System.out::println); // 하나하나 실행

		System.out.println("\n- - - - -\n");

		String str1 = "Hello World! Welcome to the world of Java~";

		str1.chars().forEach(System.out::println);

		System.out.println("\n- - - - -\n");

		char str1MaxChar = (char) str1.chars()
			.max() // OptionalInt 반환 - 이후 배울 것
			//.min() // 변경해 볼 것
			.getAsInt();

		//  사용되는 모든 알파벳 문자들을 정렬하여 프린트
		str1.chars()
			.sorted()
			.distinct()
			.filter(i -> (i >= 'A' && i <= 'Z') || (i >= 'a' && i <= 'z')) // == Character::isLetter
			.forEach(i -> System.out.print((char) i));

		System.out.println("\n- - - - -\n");
		// chars()는 원시값 스트림으로 변환해준다
		//  대소문자 구분 없이 중복 제거한 뒤 정렬하고 쉼표로 구분
		// 원시값 스트림은 다른 자료형의 스트림으로 바뀔 수 없다 int -> string 불가능하다는 말
		var fromStr1 = str1.chars()
			.boxed()
			// 💡 boxed를 사용하여 Stream<Integer>으로 변환
			//  요소를 다른 타입으로 바꾸려면 Stream<T>을 사용해야 함
			.map(i -> String.valueOf((char)i.intValue())) // i에서 -> intValue로 원시값을 다시 꺼내줌 여기서 Stream<String>으로 바뀐다
			.map(String::toUpperCase)
			.filter(s -> Character.isLetter(s.charAt(0))) // 얘는 문자열이 들어왔으므로 charAt해줘야함 한글자씩 들어오긴 했음
			.sorted()
			.distinct()
			.collect(Collectors.joining(", "));

		System.out.println(fromStr1);
		System.out.println("dsad");
		System.out.println("\n- - - - -\n");

		//  💡 peek으로 중간 과정 체크하기 !! 중간중간 체크 한번해보는 역할
		//  - 스트림이나 요소를 변경하지 않고 특정 작업 수행 - 디버깅에 유용
		// map의 연산이 모두 끝나야 sorted 작업이 실행된다
		var oddSquaresR = IntStream.range(0, 10).boxed()
			.peek(i -> System.out.println("초기값: " + i))
			.filter(i -> i % 2 == 1)
			.peek(i -> System.out.println("홀수만: " + i))
			.map(i -> i * i)
			.peek(i -> System.out.println("제곱: " + i))
			.sorted((i1, i2) -> i1 < i2 ? 1 : -1) //? .sorted((i1, i2) -> i1.compareTo(i2)) 오름 차순 정렬 //-1이 출력되면 순서를 바꾸도록 설걔 되어있음
			.peek(i -> System.out.println("역순: " + i))
			.map(String::valueOf)
			.collect(Collectors.joining(", "));


		Integer[] ints = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		//  💡 allMatch/anyMatch : (모든 요소가/어느 한 요소라도)
		//  - 주어진 Predicate에 부합하는가 여부 반환
		// 최종연산
		boolean intsMatch = Arrays.stream(ints)
			.allMatch(i -> i > 0);
		//.allMatch(i -> i % 2 == 0);
		//.anyMatch(i -> i < 0);
		//.anyMatch(i -> i % 2 == 0);

		System.out.println("\n- - - - -\n");

		//  💡 takeWhile/dropWhile 주어진 Predicate을 충족시킬 때까지 취함/건너뜀
		//  💡 count : 중간과정을 거친 요소들의 개수를 반환
		long afterWhileOp = Arrays.stream(ints)
			.takeWhile(i -> i < 4) // 4 보다 작은동안 통과시킨다
			//.dropWhile(i -> i < 4) // 4 부터 흘려 보내는것임 그럼 count는 6이 된다
			.peek(System.out::println)
			.count();

		//  💡 sum : IntStream, LongStream, DoubleStream 요소의 총합 반환

		int intsSum = IntStream.range(0, 100 + 1)
			//.filter(i -> i % 2 == 1) // 홀수인것
			//.filter(i -> i % 2 == 0) // 짝수인것
			//.filter(i -> i % 3 == 0) // 3의 배수
			.sum();

		System.out.println("\n- - - - -\n");

		double doubleSum = DoubleStream
			.iterate(3.14, i -> i * 2) // seed로 10번 계산
			.limit(10)
			.peek(System.out::println)
			.sum();

		System.out.println("\n- - - - -\n");

		//  💡 reduce : 주어진 BiFunction으로 값을 접어나감
		//  seed 값이 없을 때 : Optional 반환 (빈 스트림일 수 있으므로)
		int intReduce = IntStream.range(1, 10)
			//.filter(i -> i % 2 == 1) //하나의 값으로 접어나가는것임
			.reduce((prev, curr) -> {
				System.out.printf("prev: %d, cur: %d%n", prev, curr);
				return prev * curr; //값이 어떻게 접혀나갈지 람다식으로 정의해준다
			})
			.getAsInt(); // 필요함


		//  seed 값이 있을 때 : 실제 값 반환
		int intReduceWithSeed = IntStream.range(1, 10)
			.reduce(2, (prev, curr) -> prev * curr); //2를 넣어주면 2랑 1이랑 곱하는거부터 시작한다
		// 스트림이 비어있어도 초기값을 반환하므로 seed 반환 이르모 getAsInt()안 써줘도됨 optional로 처리하는게 getAsInt임


		StringStat stringStat = "Hello World! Welcome to the world of Java~"
			.chars()
			.boxed()
			.reduce(
				new StringStat(), // 이걸 초기값으로 넣어준다
				(ss, i) -> { // ss 는 StringStat이고 i는 H이
					ss.length++;
					if (i >= 'A' && i <= 'Z') { ss.upperCases++; }
					else if (i >= 'a' && i <= 'z') { ss.lowerCases++; }
					else { ss.nonLetters++; }
					return ss; //다음턴으로 ss (StringStat)을 반환한다
				},
				//  아래의 combiner 인자는 병령 연산에서만 작용 (여기서는 무의미)
				//  요소와 다른 타입을 반환하는 오버로드의 필수인자이므로 임의로 넣음
				(ss1, ss2) -> ss1
			);
	}

	//  내부 정적 클래스
	public static class StringStat {
		int length = 0;
		int upperCases = 0;
		int lowerCases = 0;
		int nonLetters = 0;
	}
}
