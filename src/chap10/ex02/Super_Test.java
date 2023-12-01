package chap10.ex02;

class A {

	A() {
		System.out.println("A class의 기본 생성자1");
	}

	A(int a) {
		System.out.println("A class의 인풋(int a) 생성자");
	}

	A(String a, int b) {
		System.out.println("A class의 인풋(String a, int b) 생성자");
	}
}

class B extends A {
	B() {
		System.out.println("B class의 기본 생성자");
	}

	B(int a) {
		super(1);
		System.out.println("B class의 인풋(int a) 생성자");
	}

	B(String a, int b) {
		System.out.println("B class의 인풋(String a, int b) 생성자");
	}
}

class C extends B {
	C() {
		System.out.println("C class의 기본 생성자");
	}

	C(int a) {
		super(1);
		System.out.println("C class의 인풋(int a) 생성자");
	}

	C(String a) {
		System.out.println("C class의 인풋(String a) 생성자");
	}

	int a = 11;
	int b = 22;
}



public class Super_Test {
	public static void main(String[] args) {
		C c1 = new C("오늘");

		System.out.println(c1.a);
		System.out.println(c1.b);
	}
}


