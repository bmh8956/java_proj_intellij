package chap04.ex05;

public class DoWhile_Statement {
    public static void main(String[] args) {
        /*
            while 문 : 조건이 true일떄 실행문이 실행됨
            ===================================================
            초기값
            while(조건) {
                true일때 실행문
                증감식
            }

            do ~ while 문 :
            ===================================================
            초기값
            do {
                실행문
                증감식
            } while (조건);
            ===================================================

        */
        int a = 0;
        while (a < 0) {
            System.out.println("a : " + a);
        }

        int b = 0;
        do {
            System.out.println("b : " + b);
        } while (b < 0);

//        do ~ while문에서 반복처리
        int c = 0;
        do {
            System.out.println("c : " + c);
            c++;
        } while (c < 100);

        System.out.println("=============================================================");
//        반복 횟수가 100번의 경우 while문과 do ~ while문의 비교
        System.out.println("==============  while  =======================");
        a = 0;
        while (a < 10) {
            System.out.println("a : " + a);
            a++;
        }

        System.out.println("==============  do ~ while  =======================");
        b = 0;
        do {
            System.out.println("b : " + b);
            b++;
        } while (b < 10);

    }
}
