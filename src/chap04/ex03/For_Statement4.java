package chap04.ex03;

public class For_Statement4 {
    public static void main(String[] args) {
        /*
            이중 for : for 내의 for문
        */

        for (int i = 0; i < 10; i++) {
            System.out.println("바깥쪽 for문 : " + i);
            for (int j = 0; j < 10; j++) {
                System.out.println("i 변수 : " + i + " j 변수의 값 : " + j);
            }
            System.out.println("========================================");
        }
        
        System.out.println("==========구구단 아래방향==============");

        for (int i = 1; i < 10; i++) {
            System.out.println("====" + i + "단 출력=====");
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
            System.out.println("");
        }
        
        System.out.println("==========구구단 옆으로=============");

        for (int i = 0; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                if(i ==0) {
                    System.out.printf("\t%d단\t\t\t", j);
                } else {
                    System.out.printf("%d * %d = %d\t|\t", j, i, i * j);
                }
            }
            System.out.println();
        }


    }
}
