package lab.chap04;

public class For_Statement {
    public static void main(String[] args) {
        /*
            구구단 중에 7단만 출력
        */

        for (int i = 1; i <= 9; i++) {
            System.out.printf("7 * %d = %d", i, 7 * i);
            System.out.println();
        }

        System.out.println("=============================================================");

        for (int i = 1, j = 7; i < 10; i++) {
            System.out.printf("%d * %d = %d\t", j, i, j * i);
        }
        System.out.println();
        System.out.println("=============================================================");

//        for (int i = 1; i <= 9; i++) {
//            for (int j = 2; j <= 9; j++) {
//                System.out.printf("%d * %d = %d\t|\t", j, i, i * j);
//            }
//            System.out.println();
//        }
//
//        System.out.println("=============================================================");

    }
}
