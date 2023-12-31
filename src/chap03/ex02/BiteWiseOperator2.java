package chap03.ex02;

public class BiteWiseOperator2 {
    public static void main(String[] args) {
//        비트 연산자 : &, |, ^, ~

//        & 연산 : 0 & 0 = 0, 0 & 1 = 0, 1 & 0 = 0, 1 & 1 = 1
        System.out.println(3 & 10); // 2

        /*
            3   -- 0011
            10  -- 1010
        AND =====================
                   0010 = 2
        */

//        | 연산 : 0 | 0 = 0, 0 | 1 = 1, 1 | 0 = 1, 1 | 1 = 1
//        하나라도 1이 있으면 1

        System.out.println(3 | 10); // 11
        /*
            3   -- 0011
            10  -- 1010
        OR =====================
                   1011 = 11
        */

//        ^ 연산 : 0 XOR 0 = 0, 0 XOR 1 = 1, 1 XOR 0 = 1, 1 XOR 1 = 0
        System.out.println(3 ^ 10);
        /*
            3   -- 0011
            10  -- 1010
        XOR =====================
                   1001 = 9
        */

//        ~ 연산 : 0일때 1, 1일때 0
        System.out.println(~3);
        /*
            3   -- 0011     10011 <== (맨앞에 부호) 3
        NOT=================
                   1100     01100 <== (맨앞에 부호) -4

            10  -- 1010
        NOT=================
                   0101
        */
    }
}
