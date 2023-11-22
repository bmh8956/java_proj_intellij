package chap03.ex01;

public class ArithmeticOperator {

    public static void main(String[] args) {

        /*
            산술 연산자 : +, -, *, /, %
            증강 연산자 : ++, --

         */
        int a = 5;
        int b = 10;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b); // 몫
        System.out.println(a % b); // 나머지

        // 캐스팅해서 연산
        System.out.println(2 + (double)3);

        //
        System.out.println(8 % 5);  // 나머지만 출력
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


    }
}
