package main.classStudy.Generic;

public abstract class FormElement {
	public enum MODE { LIGHT, DARK }

	private static MODE mode = MODE.LIGHT;

	public void printMode () {
		System.out.println(mode);
	}

	abstract void func ();
}
