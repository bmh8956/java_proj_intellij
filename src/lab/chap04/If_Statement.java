package lab.chap04;

import java.util.Scanner;

public class If_Statement {
    public static void main(String[] args) {

//        System.out.println("월요일은 자바를 공부합니다.");
//        System.out.println("화요일은 데이터베이스를 공부합니다.");
//        System.out.println("수요일은 html javascript를 공부합니다.");
//        System.out.println("목요일은 jsp.fmf 공부합니다..");
//        System.out.println("금요일은 spring을 공부합니다..");
//        System.out.println("토요일은 운동을 합니다.");
//        System.out.println("일요일은 tv를 시청합니다.");

        Scanner sc = new Scanner(System.in);
        String d;
        System.out.println("요일을 입력하세요>>>>>>>>>>>>>>>>>>>>>>");
        d = sc.next();

        if (d.equals("월요일")) {
            System.out.println("월요일은 자바를 공부합니다.");
        } else if (d.equals("화요일")) {
            System.out.println("화요일은 데이터베이스를 공부합니다.");
        } else if (d.equals("수요일")) {
            System.out.println("수요일은 html javascript를 공부합니다.");
        } else if (d.equals("목요일")) {
            System.out.println("목요일은 jsp를 공부합니다..");
        } else if (d.equals("금요일")) {
            System.out.println("금요일은 spring을 공부합니다..");
        } else if (d.equals("토요일")) {
            System.out.println("토요일은 운동을 합니다.");
        } else if (d.equals("일요일")){
            System.out.println("일요일은 tv를 시청합니다.");
        } else {
            System.out.println("잘못입력되었습니다.");
        }
    }
}
