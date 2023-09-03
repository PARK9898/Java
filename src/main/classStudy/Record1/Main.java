package main.classStudy.Record1;

public class Main {
	public static void main(String[] args) {
		Button button = new Button();
		// 버튼의 안에 레코드를 담고 있기 때문에 이렇게 . 으로 사용해주는것이 맞다
		// 하나의 데이터 묶음으로 봐주는게 맞는거 같음 .. 약간 맵보다 상위호화? 그냥 뭔가 제이슨 느낌이랄까?
		Button.ClickInfo click1 = button.func(123, 456, Button.ClickedBy.LEFT);
		Button.ClickInfo click2 = button.func(492, 97, Button.ClickedBy.LEFT);
		Button.ClickInfo click3 = button.func(12, 36, Button.ClickedBy.RIGHT);

		for (var click : new Button.ClickInfo [] { click1, click2, click3 }) {
			click.printInfo();
		}
		System.out.println("\n- - - - -\n");

		Button.ClickInfo click4 = button.func(111, 222, Button.ClickedBy.LEFT);
		Button.ClickInfo click5 = button.func(111, 222, Button.ClickedBy.LEFT);

			//  ⭐️  레코드 역시 참조형
			//  내용이 같은지 여부는 equals 메소드로 확인
			boolean click4n5Same = click4 == click5;
			// 값들이 같은지는 참조형으로 equals을 사용하는게 맞음		boolean click4n5Equal = click4.equals(click5);
		boolean click4n1Equal = click4.equals(click1);
	}
}
