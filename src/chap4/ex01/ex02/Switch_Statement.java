package chap4.ex01.ex02;

public class Switch_Statement {
    public static void main(String[] args) {
        /*
          switch : 기본적으로 case문 내에서 break;
            -default 에서는 break;없이 빠져나옴
        */
        int v1 = 5;
        switch (v1) {
            case 1 :
                System.out.println("A");
                break;
            case 2 :
                System.out.println("B");
                break;
            case 3 :
                System.out.println("C");
                break;
            case 4 :
                System.out.println("D");
                break;
            case 5 :
                System.out.println("E");
                break;
            default:
                System.out.println("F");
        }

        char ch = 'a';

        switch (ch) {
            case 'a' :
                System.out.println("A 학점입니다.");
                break;
            case 'b' :
                System.out.println("B 학점입니다.");
                break;
            case 'c' :
                System.out.println("C 학점입니다.");
                break;
            case 'd' :
                System.out.println("D 학점입니다.");
                break;
            case 'e' :
                System.out.println("E 학점입니다.");
                break;
            default:
                System.out.println("F 학점입니다.");
        }

        String s = "월요일";
        switch (s) {
            case "월요일" :
                System.out.println("월요일은 자바를 공부합니다.");
                break;
            case "화요일" :
                System.out.println("화요일은 데이터베이스를 공부합니다.");
                break;
            case "수요일" :
                System.out.println("수요일은 html javascript를 공부합니다.");
                break;
            case "목요일" :
                System.out.println("목요일은 jsp를 공부합니다..");
                break;
            case "금요일" :
                System.out.println("금요일은 spring을 공부합니다..");
                break;
            case "토요일" :
                System.out.println("토요일은 운동을 합니다.");
                break;
            case "일요일" :
                System.out.println("일요일은 tv를 시청합니다.");
                break;
            default:
                System.out.println("잘못입력되었습니다.");
        }

    }
}
