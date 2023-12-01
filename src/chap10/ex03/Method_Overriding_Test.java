package chap10.ex03;

import java.lang.reflect.Field;

public class Method_Overriding_Test {
	public static void main(String[] args) {
		/*
			Method Overriding : 인스턴스 메소드만 Overriding
				- 정적 메소드 : static 메소드명, 객체 생성없이 클래스명, 메소드명으로 호출
				- 인스턴스 메소드 : 메소드명 앞에 static 키가 붙지 않는 메소드
					객체화해서 호출 가능
				- 상속 관계에서만 적용
				- 부모에서 선언된 인스턴스 메소드를 자식에서 재정의해서 사용
				- 다형성 : 자식을 객체화해서 부모타입으로 선언 후 부모의 메소드를 호출했을때 자식의 overriding된 메소드가 작동
		*/

		Animal a = new Animal();
		Animal a1 = new Animal();
		a.name = "동물";
		a.age = 11;
		a.cry();

		a.color = "red";
		a.cry();
		a.eat();

		Animal.eat();
		Animal.color = "blue";

		System.out.println(Animal.color);

		Lion l = new Lion();
		l.cry();
		System.out.println(Lion.color);

		Animal a3 = new Dog();
		a3.cry();

		Animal a4 = new Egle();
		a4.cry();

		Object obj = new Object();
		Class<?> c = obj.getClass();
		Field[] fields = c.getDeclaredFields();




	}
}
