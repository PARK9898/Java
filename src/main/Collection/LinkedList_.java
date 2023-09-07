package main.Collection;

import java.util.LinkedList;

public class LinkedList_ {
	public static void main(String[] args) {
		//  ⭐️ 둘의 차이와 연관지어 생각해 볼 것

		//  💡 ArrayList에만 있는 메소드들 중...
		// ArrayList<Attacker> attackers = new ArrayList<>();
		// //  자주 쓰이지는 않음
		// attackers.ensureCapacity(5); // 자리수 미리 확보
		// attackers.trimToSize(); // 남는 자리 없애기 (메모리 회수)

		//  💡 LinkedList에만 있는 메소드들 중...
		LinkedList<Integer> intNums = new LinkedList<>();
		for (var intNum : new int[] {2, 3, 4}) { intNums.add(intNum); };

		intNums.addFirst(1);
		intNums.addFirst(0);
		intNums.addLast(5); // add와 반환값만 다름. 코드에서 확인해 볼 것
		intNums.addLast(6); // 줄줄이 달아

		//  💡 앞에서/뒤에서 꺼내지 않고 반환
		//  - peek~ : 비어있을 경우 null 반환
		//  - get~ : 비어있을 경우 익셉션
		int peekedFirst = intNums.peekFirst();
		int gottenFirst = intNums.getFirst();
		int peekedLast = intNums.peekLast();
		int gottenLast = intNums.getLast();

		//  💡 앞에서/뒤에서 꺼내어 반환
		//  - poll~ : 비어있을 경우 null 반환
		//  - remove~ : 비어있을 경우 익셉션
		int polledFirst = intNums.pollFirst();
		int removedSecond = intNums.removeFirst();
		int polledLast = intNums.pollLast();
		int removedLast = intNums.removeLast();

		//  ⭐️ 위의 기능들 활용하여 Stack/Queue 구현

		LinkedList<Character> charLList = new LinkedList<>();

		//  💡 push & pop : 스택 간편하게 구현
		//  - 클래스 코드에서 살펴볼 것

		charLList.push('A');
		charLList.push('B');
		charLList.push('C');
		charLList.push('D');
		charLList.push('E');

		char pop1 = charLList.pop();
		char pop2 = charLList.pop();
		char pop3 = charLList.pop();
	}
}
// - 각 요소들이 메모리 이곳 저곳에 산재
// 	- 각각 이전/다음 요소들로의 링크가 있음
// 	- 비상연락망 체계…
// 	- 요소 추가시 해당 요소의 메모리만 확보 후 링크
// 	- 요소 제거시 그 이전 요소와 다음 요소 연결
// 	- 용도
// 	- 장점 : 요소의 추가와 제거가 빠름, 메모리 절약
// 	- 단점 : 요소 접근이 느림
// 	- 요소들의 추가/제거가 잦은 곳에 적합

