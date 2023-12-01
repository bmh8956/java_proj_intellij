package chap10.ex01;

public class Human {

	String name;
	int age;

	public Human() {
		super();    // Object 클래스
	}

	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void eat() {
		System.out.println("모든 사람은 먹는다.");
	}

	void sleep() {
		System.out.println("모든 사람은 잠을 잔다.");
	}

	@Override
	public String toString() {
		return "Human{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
