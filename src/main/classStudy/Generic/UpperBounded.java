package main.classStudy.Generic;

import main.classStudy.Interface.Flyer;
import main.classStudy.Interface.Hunter;
import main.classStudy.Interface.Mamal;
import main.classStudy.Interface.Swimmer;

public class UpperBounded {
	public static void main(String[] args) {
		var sum1 = add2Num(12, 34.56); // 묵시 변환이 된다
		//var sum2 = add2Num("1" + true); // ⚠️ 불가
	}
	//  💡 T는 Number를 상속한 클래스이어야 한다는 조건
	public static <T extends Number> double add2Num(T a, T b) {
		return a.doubleValue() + b.doubleValue();
	}
	//  ❓ 그냥 Number를 인자 자료형으로 하면 되지 않을까?
	//  ⭐ 상속받는 클래스와 구현하는 인터페이스(들)을 함께 조건으로
	//  여기서는 클래스와 인터페이스 모두 extends 뒤에 &로 나열
	public static <T extends Mamal & Hunter & Swimmer>
	void descHuntingMamal (T animal)  {
		//  ⭐️ 조건에 해당하는 필드와 메소드 사용 가능
		System.out.printf("겨울잠 %s%n", animal.hibernation ? "잠" : "자지 않음");
		animal.hunt();
	} // animal 중에 인터페이스의 조건을 모두 충족하는 조건들만 넣을 수 있음

	public static <T extends Flyer & Hunter>
	void descFlyingHunter (T animal) {
		animal.fly();
		animal.hunt();
	}
}
