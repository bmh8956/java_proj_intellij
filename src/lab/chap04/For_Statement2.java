package lab.chap04;

public class For_Statement2 {
    public static void main(String[] args) {
    /*
        실습 : 2중 for문을 사용해서 1~19단까지 옆으로 출력
            -- 6단, 7단, 12단 제외하고 출력
    */

        for(int i = 0;i<20;i++) {
            for(int j = 1;j<20;j++) {
                if(j == 6 || j == 7|| j== 12) continue;
                if(i == 0) {
                    if(j <10 ) {
                        System.out.printf("\t%d단\t\t\t\t", j);
                    } else {
                        System.out.printf("\t%d단\t\t\t", j);
                    }
                    continue;
                }
                System.out.printf("%d * %d = %d", j, i, j*i);
                if(i*j >= 100) {
                    System.out.printf("\t\t");
                } else {
                    System.out.printf("\t\t\t");
                }
            }
            System.out.println();
        }
    }
}
