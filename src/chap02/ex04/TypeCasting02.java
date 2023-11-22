package chap02.ex04;

import java.util.ArrayList;

public class TypeCasting02 {

    public static void main(String[] args) {
//

        int kor = 77;   // 국어 점수
        int eng = 87;   // 영어 점수
        int math = 99;  // 수학 점수

        System.out.println((double)(kor + eng + math)/3);

        System.out.println("합계 : " + (kor + eng + math));
        System.out.println("캐스팅x 평균 : " + (kor + eng + math)/3);
        System.out.println("평균 : " + ((double)(kor + eng + math))/3);

        System.out.println("====================================");

        int hap = kor + eng + math;
        double avg = ((double)hap)/3;   // hap : int ==> double로 업캐스팅 후 /3
        double avg1 = hap/3;        // 정수 / 정수 = 정수 => 더블
        double avg2 = hap/3.0;      // 정수 / 정수(더블) = 더블 => 더블

        System.out.println("합계 : " + hap);
        System.out.println("평균 : " + avg);

        System.out.println("=========================");

        System.out.println("평균1 : " + avg1);
        System.out.println("평균2 : " + avg2);
        
    }
}
