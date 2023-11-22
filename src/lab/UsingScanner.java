package lab;

import java.util.Scanner;

public class UsingScanner {
    public static void main(String[] args) {
        String stu1;
        String stu2;
        String stu3;

        int kor;   // 국어 점수
        int eng;   // 영어 점수
        int math;  // 수학 점수

        int hap;
        double avg;

        Scanner sc = new Scanner(System.in);

        System.out.println("학생1의 이름 국어점수 영어점수 수학점수를 입력하세요>>>>>");
        stu1 = sc.next();
        kor = sc.nextInt();
        eng = sc.nextInt();
        math = sc.nextInt();

        hap = kor + eng + math;
        avg = (double)hap/3;

        System.out.println(stu1 + "의 모든 점수의 합계는 " + hap + "이고 평균은 " + avg + "입니다.");

        System.out.println("학생2의 이름 국어점수 영어점수 수학점수를 입력하세요>>>>>");
        stu1 = sc.next();
        kor = sc.nextInt();
        eng = sc.nextInt();
        math = sc.nextInt();

        hap = kor + eng + math;
        avg = (double)hap/3;

        System.out.println(stu1 + "의 모든 점수의 합계는 " + hap + "이고 평균은 " + avg + "입니다.");

        System.out.println("학생3의 이름 국어점수 영어점수 수학점수를 입력하세요>>>>>");
        stu1 = sc.next();
        kor = sc.nextInt();
        eng = sc.nextInt();
        math = sc.nextInt();

        hap = kor + eng + math;
        avg = (double)hap/3;

        System.out.println(stu1 + "의 모든 점수의 합계는 " + hap + "이고 평균은 " + avg + "입니다.");



    }
}
