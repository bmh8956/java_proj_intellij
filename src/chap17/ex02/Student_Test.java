package chap17.ex02;

import java.util.ArrayList;
import java.util.List;

public class Student_Test {
	public static void main(String[] args) {
		Student stu = new Student();

		stu.setName("minhyeok");
		stu.setAddr("서울");
		stu.setNum(11);
		stu.setKor(26);
		stu.setEng(35);
		stu.setMath(84);
		Student stu1 = new Student(stu);
		Student stu2 = new Student(stu);
		Student stu3 = new Student(stu);
		Student stu4 = new Student(stu);

//		System.out.println(stu1);

		List<Student> alist = new ArrayList<>();
		alist.add(stu1);
		alist.add(stu2);
		alist.add(stu3);
		alist.add(stu4);

		Method m = new Method();
		m.createList(10, alist);
		m.arrayListOut(alist);
		m.findNameAddr(alist);
		m.totalAvg(alist);
		for(Student s : alist) {
			m.sMethod(s);
		}

	}
}
