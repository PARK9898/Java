package main.functionalProgramming.SteamStudy;

public class Person implements Comparable<Person> {
	private static int lastNo = 0;
	private int no;
	private String name;
	private int age;
	private double height;
	private boolean married;

	public Person(String name, int age, double height, boolean married) {
		this.no = ++lastNo;
		this.name = name;
		this.age = age;
		this.height = height;
		this.married = married;
	}

	public int getNo() { return no; }
	public String getName() { return name; }
	public int getAge() { return age; }
	public double getHeight() { return height; }

	public boolean isMarried() {return married;}

	@Override
	public int compareTo(Person p) {
		return this.getName().compareTo(p.getName());
	} // 가나다 순으로 비교하도록 해놓았음

	@Override
	public String toString() {
		return "no: %d, name: %s, age: %d, height: %f, married: %b"
			.formatted(no, name, age, height, married);
	}
}
