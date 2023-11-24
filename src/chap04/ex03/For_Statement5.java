package chap04.ex03;

public class For_Statement5 {
    public static void main(String[] args) {
        /*
            반복문(for, while, do while) 내에서 continue, break  <== if 조건을 넣어서 사용
                -continue; : 아래 코드는 실행하지 않고 증감식으로 이동
                -break; : 루프 구문을 빠져나옴
        */

        for (int i = 0; i < 10; i++) {
            if(i % 2 == 0) {
                continue;
            }

            if(i > 7) {
                break;
            }
            System.out.println(i);
        }

    }
}
