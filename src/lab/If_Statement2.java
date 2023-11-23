package lab;

import java.util.Scanner;

public class If_Statement2 {
    public static void main(String[] args) {
        /* if ~ esle if,
           스캐너로 정수 값을 입력 받으세요. 자신 자산을 입력받습니다.

           0~1000만원 : "버스, 지하철 이용"
           1000만원~1억 : "택시를 타고 다닙니다."
           1억 ~ : "비행기를 타고 다닙니다."
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("자산을 입력해주세요");
        int a = sc.nextInt();

        if(a >= 0 && a < 1000) {
            System.out.println("버스, 지하철 이용");
        } else if (a>=1000 && a<10000) {
            System.out.println("택시를 타고 다닙니다.");
        } else if(a>=10000) {
            System.out.println("비행기를 타고 다닙니다.");
        }


    }
}
