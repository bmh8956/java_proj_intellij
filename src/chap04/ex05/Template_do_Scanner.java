package chap04.ex05;

import java.util.Scanner;

public class Template_do_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        do {
            System.out.println("============================================================");
            System.out.println("1. 평균 출력 || 2. 합계 출력 || 3. 이름 출력 || 4. 프로그램 종료");
            System.out.println("============================================================");
            System.out.println("위 내용을 선택하세요.");
            a = sc.nextInt();
            if(a == 1) {
                System.out.println("1. 평균 출력");
            } else if(a == 2) {
                System.out.println("2. 합계 출력");
            } else if(a == 3) {
                System.out.println("3. 이름 출력");
            } else if(a == 4) {
                System.out.println("4. 프로그램 종료");
                break;
            } else {
                System.out.println("잘못된 입력");
            }
        } while (true);

        sc.close();
    }
}
