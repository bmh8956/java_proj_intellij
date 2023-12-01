package chap10.ex01;

public class Student extends Human{

	int sId;
	String sName;

//	--------생략되어있음-----------
	Student() {
		super();        // 부모클래스()-- 부모클래스의 기본 생성자가 호출
	}
//	-----------------------------


	public Student(int sId) {
		super("방민혁", 20);
		this.sId = sId;
		this.sName = super.name;
		super.eat();
	}

	void goTOSchool() {
		System.out.println("모든 학생은 학교를 간다.");
	}

	@Override
	public String toString() {
		return "Student{" +
				"sId=" + sId +
				'}';
	}
}
