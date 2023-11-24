package chap04.ex03;

public class For_Statement3 {
    public static void main(String[] args) {
//        무한루프에서 break;를 사용해서 빠져나오기
//            반복문에서 특정시점에 break; if문 내에 break;

        for (int i = 0; i >= 0; i += 10) {
            System.out.println(i);
            if (i == 10000) {
                break;
            }
        }

        System.out.println("====================================");

        for (int i = 0; i >= 0; i += 10) {
            System.out.println(i);
            if (i == 10000) break;
            System.out.println("오늘");
        }

    }
}
