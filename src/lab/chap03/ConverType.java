package lab.chap03;

import java.util.Scanner;

public class ConverType {
    public static void main(String[] args) {
//        String 으로 인풋받은 값을 정수나 실수 타입으로 변환해서 출력
//          Integer.parseInt, Double.parseDouble

        String kor;
        String eng;
        String math;
        int hap;
        double avg;

        System.out.println("국어 영어 수학 점수를 공백으로 구분해서 입력>>>>>>>>>>");
        Scanner sc = new Scanner(System.in);
        kor = sc.next().replaceAll("[^0-9]", "");
        eng = sc.next().replaceAll("[^0-9]", "");
        math = sc.next().replaceAll("[^0-9]", "");

        kor = (kor.equals("") | kor == null)? "0" : kor;
        eng = (eng.equals("") | eng == null)? "0" : eng;
        math = (math.equals("") | math == null)? "0" : math;

        hap = Integer.parseInt(kor) + Integer.parseInt(eng) + Integer.parseInt(math);
        avg = (double)hap/3;

        System.out.println("모든 점수의 함 : " + hap);
        System.out.println("모든 과목의 평균 : " + avg);

    }
}
