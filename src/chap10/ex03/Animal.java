package chap10.ex03;

public class Animal {
	String name;    // 인스턴스 필드 : 객체화 해야 사용
	int age;
	static String run;  // 객체화 여부, 클래스명
	static String color;


	void cry() {        // 인스턴스 메소드 : 객체화 해서 사용가능
		System.out.println("모든 동물은 웁니다.");
	}

	static void eat() { // 객체화 여부 관계없이 호출
		System.out.println("모든 동물은 밥을 먹습니다.");
	}

}
