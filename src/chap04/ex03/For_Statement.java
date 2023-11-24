package chap04.ex03;

import java.util.ArrayList;

public class For_Statement {
    public static void main(String[] args) {
        /*
            제어문 : 프로그램의 조건에 따라서 순서를 바꾸어줌, if, switch
            반복문 : 프로그램을 계속 반복하도록 하는 구문
                주의 : 조건이 무한루프에 빠지지 않도록 처리
                for. while, do while
            for (변수의 초기값;조건;증감식) {

            }
        */

        for (int i = 0; i <= 10; i++) {
            System.out.println("오늘 날씨는 춥습니다. :" + i);
        }
        System.out.println("==========================");
        int a;
//        for (a = 0; a >= 0; a++) {
        for (a = 0; a < 100; a++) {
            System.out.println(a);
        }
        System.out.println(a);

        //for문 블락 밖에서 선언, for문 블락 내에서 선언 (변수를 새로 사용 가능하다)
        for (a = 10; a <= 100; a += 2) {
            System.out.println(a);
        }

        System.out.println("마지막 a의 값 : " + a);      // 102
//        System.out.println("마지막 i의 값 : " + i);    // for블락 내에서 선언됨

//        for (int i = 0; i >= 0; i++) {        // 무한 루프
        for (int i = 0; i < 100; i++) {         // 정상 루프
            System.out.println("무한루프 : " + i);
        }

//        for (int i = 0; true; i++) {            // 무한 루프2
        for (int i = 0; i < 100; i++) {
            System.out.println("무한루프2 : " + i);
        }

        for (int i = 0; ; i++) {                    // 무한 루프3
            System.out.println("무한루프3 : " + i);
        }

//        도달 할 수없는 코드
//        for (int i = 0; false; i++) {
//            System.out.println("false");
//        }


    }
}
