package chap06.ex02;

import java.util.Scanner;

class Student {
	String name;
	int num;
	int kor;
	int eng;
	int math;

	//	기본 생성자 : 다른 생성자가 없을때 생성 가능
	public Student() {
	}

	public Student(String name, int num, int kor, int eng, int math) {
		this.name = name;
		this.num = num;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	void printAll() {
		System.out.println(this.toString());
	}

	double avg() {
		double avgAll = 0.0;

		avgAll = (kor + eng + math) / 3.0;

		return avgAll;
	}

	int plus(int a, int b) {
		int hap = a + b;
		return hap;
	}
	

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", num=" + num +
				", kor=" + kor +
				", eng=" + eng +
				", math=" + math +
				'}';
	}
}


class Car {
	String carName;
	String carColor;
	double carSpeed;
	int carDoor;

	public Car(String carName, String carColor, double carSpeed, int carDoor) {
		this.carName = carName;
		this.carColor = carColor;
		this.carSpeed = carSpeed;
		this.carDoor = carDoor;
	}


}

public class Object_Definition2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student st = new Student();

		do {
			int a;
			System.out.println("1.이름 2.학번 3.국어 4.영어 5.수학 6.평균 7.정보 8.종료");
			String str = sc.next();
			a = Integer.parseInt(str.replaceAll("[^0-9]", ""));
			if (a == 0 || a > 8) {
				break;
			}

			if(a == 1) {
				System.out.print("이름 입력 : ");
				String name = sc.next();
				st.name = name;
				st.printAll();
				System.out.println();
			} else if(a == 2){
				System.out.print("학번 입력 : ");
				int num = sc.nextInt();
				st.num = num;
				st.printAll();
				System.out.println();
			} else if(a == 3) {
				System.out.print("국어성적 입력 : ");
				int kor = sc.nextInt();
				System.out.println();
				st.kor = kor;
				st.printAll();
			} else if(a == 4) {
				System.out.print("영어성적 입력 : ");
				int eng = sc.nextInt();
				st.eng = eng;
				st.printAll();
				System.out.println();
			} else if(a == 5) {
				System.out.print("수학성적 입력 : ");
				int math = sc.nextInt();
				st.math = math;
				st.printAll();
				System.out.println();
			} else if(a == 6) {
				System.out.print("평균 점수 : ");
				System.out.println(st.avg());
				st.printAll();
				System.out.println();
			} else if(a == 7) {
				st.printAll();
			}


		} while (true);

	}
}
