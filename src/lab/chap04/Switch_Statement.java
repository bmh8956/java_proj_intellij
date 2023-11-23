package lab.chap04;

import java.util.Scanner;

public class Switch_Statement {
    public static void main(String[] args) {
        /*
          Scanner로 정수를 입력 받으세요 - if/switch
          1."당신은 금매달을 획득했습니다."
          2."당신은 은매달을 획득했습니다."
          3."당신은 동매달을 획득했습니다."
          "정수 1~3 중 하나의 값을 넣으세요."
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력해주세요========>>>>>>>>>>>>");
        String t = sc.next();
        int i = Integer.parseInt(t.replaceAll("[^0-9]", "0"));
        System.out.println(i);
        
        if(i == 1) {
            System.out.println("당신은 금매달을 획득했습니다");
        } else if(i == 2) {
            System.out.println("당신은 은매달을 획득했습니다");
        } else if(i == 3) {
            System.out.println("당신은 동매달을 획득했습니다");
        } else {
            System.out.println("정수 1~3 중 하나의 값을 넣으세요");
        }
        System.out.println("========switch==================");

        System.out.println("정수를 입력해주세요========>>>>>>>>>>>>");
        t = sc.next();
        i = Integer.parseInt(t.replaceAll("[^0-9]", "0"));
        System.out.println(i);

        switch (i) {
            case 1 :
                System.out.println("당신은 금매달을 획득했습니다");
                break;
            case 2 :
                System.out.println("당신은 은매달을 획득했습니다");
                break;
            case 3 :
                System.out.println("당신은 동매달을 획득했습니다");
                break;
            default:
                System.out.println("정수 1~3 중 하나의 값을 넣으세요");
        }
        

    }
}
