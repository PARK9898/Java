package main.classStudy.date_time;
import java.time.*;

public class DateAndTime {
	public static void main(String[] args) {

		//  ⭐️ java.time의 클래스들은 생성자 대신
		//  - 필요에 따라 적합한 클래스 메소드로 인스턴스 생성

		//  💡 현재 날짜
		LocalDate today = LocalDate.now();
		System.out.println(today);

		//  💡 현재 시간
		LocalTime thisTime = LocalTime.now();
		System.out.println(thisTime);

		//  💡 현재 시간과 날짜
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);

		//  ⭐️ now 메서드 : 현재의 시간/날짜 정보를 가진
		//  해당 클래스의 인스턴스를 반환
		//  시스템(컴퓨터)의 시계를 기준으로 함

		System.out.println("\n- - - - -\n");

		LocalDate christmas23 = LocalDate.of(2023, 12, 25);
		System.out.println(christmas23);

		LocalTime lunchTime = LocalTime.of(12, 30);
		LocalTime lunchTimeDetailed = LocalTime.of(
			12, 30, 0, 0
		); // 초, 나노초까지 더할 수 있음
		System.out.println(lunchTime);

		LocalDateTime familyDinner = LocalDateTime.of(
			2023, 12, 25, 18, 00
		);
		System.out.println(familyDinner);
		//  LocalDateTime 인스턴스는 LocalDate와 LocalTime 인스턴스의 조합으로
		//  만들어짐 클래스 코드에서 확인 (of 메소드)

		System.out.println("\n- - - - -\n");

		//  ⭐️ java.time의  Local... 클래스 인스턴스들은 불변
		//  - 생성자 사용이 금지된 것은 인스턴스 생성을 제한하기 위함
		//  - of 메소드를 사용하여, 적절할 때만 생성된 것을 받도록

		//  💡 주어진 차이만큼의 시간이나 날짜를 '새로 만들어' 반환
		today.plusDays(1); // ⭐️ 기존 인스턴스는 변하지 않음
		var tomorrow = today.plusDays(1);
		var yesterday = today.minusDays(1);

		for (var day : new LocalDate[] {today, tomorrow, yesterday}) {
			System.out.println(day);
		}
	}
}
