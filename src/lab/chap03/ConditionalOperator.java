package lab.chap03;

import java.util.Scanner;

public class ConditionalOperator {
    public static void main(String[] args) {
//        스캐너, 정수, %
//        스캐너로 정수 값을 인풋받아서 : 출력 내용 : 인풋받은 값은 00이고 짝수(홀수) 입니다.
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 입력 : ");
        a = sc.nextInt();
        String t;
        t = (a % 2 == 0) ? "짝수" : "홀수";
        System.out.printf("입력받은 값은 %d이고 %s입니다.%n", a, t);
//        스캐너로 값을 인풋받아서 : 출력 내용 : 인풋받은 값은 00이고 3의 배수입니다(배수가 아닙니다).
        System.out.println("=========================================");
        System.out.println("정수 입력 : ");
        int b;
        b = sc.nextInt();
        t = (b % 3 == 0) ? "배수입니다." : "배수가 아닙니다.";
        System.out.printf("입력받은 값은 %d이고 3의 %s", b, t);

    }
}
