package chap04.ex04;

public class While_Statement {
    public static void main(String[] args) {
        /*
            반복문 : for, while, do while
            for(초기값:조건:증감식) {}
            
            초기값
            while(조건) {
                조건이 true일때 구문;
                증감식
            }
            
        */

        System.out.println("==== for문 ======");

        for (int i = 0; i < 10; i++) {
            System.out.println("for 결과 : " + i);
        }

        System.out.println();

        System.out.println("==== while문 ======");

        int i = 0;
        while (i < 10) {
            System.out.println("while 결과 : " + i);
            i++;
        }


    }
}
