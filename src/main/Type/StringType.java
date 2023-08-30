package main.Type;

public class StringType {
	public static void main(String[] args) {
		// String은 참조 자료형임
		// 그러나 특별히 원시형 자료값 사용된다
		String str1 = "Hello World!";
		// 인스턴스 생성 방식
		String str4 = new String("나중에 자세히 배웁시다" );
		// == -> 같은 종이에 적혀있는가? 주소가 같은가?
		// .equals -> 같은 글이 적혀있는가?
		// 리터럴 방식 같은 종이에 쓰여있는가? Heap 영역에 String constant pool 에 Hello 가 적히고 hl2는 그것을 가르킨다 -> 주소가 같다
		String hl1 = "Hello";
		String hl2 = "Hello";
		String wld = "World";
		//리터럴 끼리는 == 을 사용하여 비교가 가능하다
		boolean bool1 = hl1 == hl2;
		// 인스턴스 방식 -> 내용이 같은가?
		String hl3 = new String("Hello");
		String hl4 = new String("Hello");
		String hl5 = hl4;
		boolean bool2 = hl3 == hl4; // 위와 다르게 false 가 나옴
		boolean bool3 = hl3.equals(hl4); // 왠만하면 equals를 사용
		//대소문자 구분하지 않고 비교하는법
		boolean bool4 = hl3.equalsIgnoreCase(hl4);
		// 각각의 메모리상 주소 식별자 비교
		int hl1hash = System.identityHashCode(hl1);
		int hl2hash = System.identityHashCode(hl2);// 이 둘은 리터럴 방식이기 때문에 주소가 같다
		int hl3hash = System.identityHashCode(hl3);
		int hl4hash = System.identityHashCode(hl4);
		int hl5hash = System.identityHashCode(hl5);
	}
}

