package chap10.ex01;


public class Inheritance01 {
	public static void main(String[] args) {
		/*
			상속 (Inheritance) : OOP의 특징
				- 자바는 하나의 부모 클래스만 상속 가능
				- 중복된 코드 방지
				- 부모 클래스의 필드, 메소드, 이너클래스가 그대로 자식 클래스에게 상속
					생성자는 상속x
				- 자식 클래스를 생성하면 자식 클래스 생성자 내부에 super()가 생략되어있음
					super() : 부모 클래스의 생성자 호출
				- 자식 클래스를 생성하면 부모 클래스가 먼저 만들어지고 자식 클래스가 생성
				- 자식 클래스명 extends 부모 클래스명
		*/

		Student s = new Student();
		s.name = "홀길동";
		s.age = 20;

		Professor p = new Professor();
		p.name = "김교수";
		p.age = 40;

		Worker w = new Worker();
		w.name = "직장인";
		w.age = 30;

		s.eat();
		s.sleep();

		System.out.println("=============================================");
//		this    :   자기 자신의 객체, this.필드, this.메소드
//		this()  :   생성자에서 사용, 반드시 첫 라인
//					다른 생성자를 호출

//		super   :   부모의 필드 메소드 호출, super.필드, super.메소드
//		super() :   생성자에서 사용, 반드시 첫 라인
//					부모의 생성자 호출
//		            자식 클래스 생성자 내부에는 실행블락 첫 라인에 super()가 생략되어있음
//		            자식 클래스를 생성하면 super()에 의해서 부모 클래스가 먼저 생성성되고 자식 클래스가 생성

		Student s2 = new Student();

		Student s3 = new Student(99);
		System.out.println(s3.name);
		System.out.println(s3.age);
		System.out.println(s3.sName);

//      Type casting
		/*
			Up casting : 자동으로 적용 자식 -> 부모
			Down casting : 부모 -> 자식 명시가 필요
				부모 자식의 모든 필드, 메소드를 사용가능
		*/

		Human ch01 = new Chird();
		ch01.eat();

		Professor pf01 = (Professor) ch01;
		pf01.eat();
		Human hh = ch01;

		Human hh01 = new Human();

		hh01.age = 30;

		Professor pp03 = (Professor) hh01;

//		객체 instanceof 타입 : 객체에 타입이 존재하면 true



	}
}
