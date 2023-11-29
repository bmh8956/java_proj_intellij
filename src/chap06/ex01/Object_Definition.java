package chap06.ex01;

public class Object_Definition {
//	클래스 블락 : 필드, 메소드, 생성자

	//	필드 : Heap 공간에 변수와 값이 저장, 클래스 블락 내에 선언된 변수를 필드라 호칭
//		변수 : 메소드 블락 내에 선언, Stack에 변수명, 값 저장
	String name;
	int age;
	double weight;
	String addr;
	
//	생성자 : 클래스 이름과 동일하고 리턴이 없는 메소드, 책체 생성시 필드의 값을 초기롸 할때 사용
	Object_Definition(){    //  기본 생성자, 생략 가능, 객체 생성시 생성자 호출해서 필드의 값을 초기화

	}

//	인풋 값이 있는 생성자
	Object_Definition(String name, int age, double weight, String addr) {
//		this : 자신 객체의 필드
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.addr = addr;
	}

	//	메소드(함수) : 리턴타입 메소드명(입력매개변수) {호출시 실행 코드}
	void print() {
		int a = 10;  // 변수 : Stack에 변수명, 값
		System.out.println("필드에 등록된 이름 : " + name);
	}

//	메소드 : 
	int pringAge() {
		return age;
	}

	void printName() {
		System.out.println(name);
	}

	@Override
	public String toString() {
		return "Object_Definition{" +
				"name='" + name + '\'' +
				", age=" + age +
				", weight=" + weight +
				", addr='" + addr + '\'' +
				'}';
	}

	void printAll() {
		System.out.println(this.toString());
	}

	//	메소드 블락
	public static void main(String[] args) {
		/*
			절차적 지향 프로그래맹(POP) : 시간의 순서에 따라 프로그래밍 - C
				- 성능 우수, 유지 보수가 어렵다
				- 개발 난이도가 높다, 반복 코드가 적용될 수 있다.
				-
			객체 지향 프로그래밍(OOP) : 객체, 객체 프로그래밍 - JAVA, C++
				- 유지 보수, 개발 난이도
				- 반복 코드를 줄일 수 있다.

			클래스 : 객체를 생성하는 틀
			객체(인스턴스) : 클래스를 기반으로 메모리에 로드
				- 하나의 클래스로 여러개의 객체를 생성할 수 있다.
		*/

//		변수
		String abc;

//		객체 생성
		Object_Definition test = new Object_Definition();
		test.name = "test";
		test.age = 29;
		test.weight = 66.6;
		test.addr = "서울";

		test.printName();
//		System.out.println(test.toString());
		test.printAll();

		Object_Definition bang = new Object_Definition("bang", 29, 67.7, "서울 강북구");

//		bang.name = "bang";
//		bang.age = 29;
//		bang.weight = 67.7;
//		bang.addr = "서울 강북구";

		bang.printAll();

		Object_Definition min = new Object_Definition("방민혁", 29, 68.8, "수유동");

//		객체 메소드 호출
		min.printAll();

	}
}
