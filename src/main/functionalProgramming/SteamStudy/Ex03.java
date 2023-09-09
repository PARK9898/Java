package main.functionalProgramming.SteamStudy;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex03 {
	public static void main(String[] args) {
		String[] names = {
			"강백호", "서태웅", "채치수", "송태섭", "정대만",
			"윤대협", "변덕규", "황태산", "안영수", "허태환",
			"이정환", "전호장", "신준섭", "고민구 ", "홍익현",
			"정우성", "신현철", "이명헌", "최동오", "정성구"
		};

		Stream<String> nameStream = Arrays.stream(names);

		Random random = new Random();
		random.setSeed(4); // 균일한 결과를 위해 지정된 시드값
		var people = nameStream
			.map(name -> new Person(
				name,
				random.nextInt(18, 35),
				random.nextDouble(160, 190),
				random.nextBoolean()
			))
			.sorted()
			.toList(); // 스트림을 리스트로 반환할때는 toList()를 사용한다

		//  💡 collect, Collectors의 기능들
		//  - 이미 다룬 joining도 이들 중 하나

		var peopleLastNameSet = people.stream()
			.map(p -> p.getName().charAt(0))
			//  💡 아래 중 원하는 컬렉션으로 택일
			// 각 사람의 성이 뽑힌다
			.collect(Collectors.toList());
			//.collect(Collectors.toSet());
			//.collect(Collectors.toCollection(ArrayList::new));
			//.collect(Collectors.toCollection(LinkedList::new));
			//.collect(Collectors.toCollection(TreeSet::new));

		var nameAgeMap = people.stream()
			//  💡 의미 없는 작업(해시맵이 될 스트림의 정렬)은 IDE가 제거 권유
			.sorted((p1, p2) -> p1.getAge() > p2.getAge() ? 1 : -1)
			.collect(Collectors.toMap(Person::getName, Person::getAge));
		//스트림을 특정 기준으로 해쉬맵으로 분
		var peopleHMapByMarried = people.stream()
			.collect(Collectors.groupingBy(Person::isMarried)); //p -> p.isMarried() 이거랑 똑가틈
		var marrieds = peopleHMapByMarried.get(true); //결혼한 11명이 나

		var peopleHMapByHeight = people.stream()
			.collect(Collectors.groupingBy(
				p -> ((int) p.getHeight() / 10) * 10) // 180대인 사람끼리 170대 사람끼리 그런식으로 groupby된다
			);
		var over180s = peopleHMapByHeight.get(180);
	}
}
