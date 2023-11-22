package chap03.ex02;

import java.util.Scanner;

public class BitWiseOperator {
    public static void main(String[] args) {
//        다양한 진법 표현, 비트연산자
//        1.다양한 진법 표현 : 2진수, 10진수, 8진수 16빈수
        int data = 13;
//        정수를 2진수로 변환 : Integer.toBinaryString(정수)
        System.out.println(Integer.toBinaryString(data)); // 1101
//        정수를 16진수로 변환 : Integer.toHexString(정수)
        System.out.println(Integer.toHexString(data)); // d
//        정수를 8진수로 변환 : Integer.toOctalString(정수)
        System.out.println(Integer.toOctalString(data)); // 15
//        문자열로된 수를 정수로 변환 : Integer.pareInt()
        System.out.println("3" + "5"); // 35
        System.out.println(Integer.parseInt("3") + Integer.parseInt("5")); // 8
//        문자열로된 실수를 실수 타입으로 : Double.parseDouble()
        System.out.println("3.14" +"21.65"); // 3.1421.65
        System.out.println(Double.parseDouble("3.14") + Double.parseDouble("21.65")); // 24.79

        System.out.println("========================================");

//        스캐너에서 숫자가 문자별로 들어왔을때 정수로 변환. 실수로 변환 후 연산

        String kor;
        String eng;
        String avg;
        int hap;

        Scanner sc = new Scanner(System.in);


        System.out.println("국어점수(정수) 영어점수(정수) 평균(실수) 로 입력");
        kor = sc.next();
        eng = sc.next();
        hap = Integer.parseInt(kor) + Integer.parseInt(eng);
        avg = String.valueOf((double)hap/2);
        System.out.println("국어 : " + kor + "\t영어 : " + eng + "\t평균 : " + avg);

    }
}
