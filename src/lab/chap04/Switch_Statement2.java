package lab.chap04;

import java.util.Calendar;
import java.util.Scanner;

public class Switch_Statement2 {
    public static void main(String[] args) {
        /*
          월을 입력해서 해당 월은 00일 입니다.
          31이 출력되는 달 : 1,3,5,7,8,10,12
          30이 출력되는 달 : 4,6,9,11
          28이 출력되는 달 : 2
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("달을 입력하세요");
        String s = sc.next();
        Calendar c = Calendar.getInstance();
        int m = Integer.parseInt(s.replace("[^0-9]", "0"));
        c.set(2023, m - 1, 1);
        int day = c.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.printf("해당 월은 %d월이고 %d일까지 존재합니다.", m, day);
        System.out.println();
        System.out.println("===============================================");

        int mon = sc.nextInt();
        int d;

        switch (mon) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                d = 31;
                System.out.printf("해당 월은 %d월이고 %d일까지 존재합니다.", mon, d);
                break;
            case 2:
                d = 28;
                System.out.printf("해당 월은 %d월이고 %d일까지 존재합니다.", mon, d);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                d = 30;
                System.out.printf("해당 월은 %d월이고 %d일까지 존재합니다.", mon, d);
                break;
            default:
                System.out.println();
        }
    }
}
