package lab.chap04;

public class While_Statement {
    public static void main(String[] args) {

        for (int i = 1000; i > 0; i -= 5) {
            System.out.println(i);
        }
        int a = 1000;
        while (a > 0) {
            System.out.println(a);
            a -= 5;
        }
    }
}
