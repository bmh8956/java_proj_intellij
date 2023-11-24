package chap04.ex01;

public class If_Statement {
    public static void main(String[] args) {
        /* 클래스 이름 : 첫자는 반드시 영문 대문자
           변수명 : 첫자로 소문자(권장), 카멜케이스
           상수 : 대문자(권장)
           
                특수문자 : _, % 만 사용가능
                숫자가 처음에 오면 오류
        */
        /* 제어문 : 프로그램의 순서를 바꿔서 처리함, if, switch
           if : break;가 내장
           switch : break;

           if   -   3가지

           조건이 1개일때
           if(조건) {
                조건이 true일때 실행
           } else {
                조건이 false일때 실행
           }

           조건이 여러개일때
           if(조건1) {
                조건1이 true일때 실행
           } else if(조건2) {
                조건2이 true일때 실행
           } else if(조건3) {
                조건3이 true일때 실행
           } else {
                위 조건이 다 false일때
           }

           한 라인으로 사용
           if(조건) {조건이 true일때}
           if(조건) 조건이 true일때;
        */
        int a = 10;
        if (a < 30) {
            System.out.println("참입니다.");
            System.out.println("참일떄 또 실행됩니다.");
        } else {
            System.out.println("거짓입니다.");
        }
        System.out.println("프로그램 종료");

//        조건이 여러개인 경우 : 점수가 90점 A, 80점 B, 70점 C
        int scr = 95;

        if (scr >= 90) {
            System.out.println("A 학점입니다.");
        } else if (scr >= 80) {
            System.out.println("B 학점입니다.");
        } else if (scr >= 70) {
            System.out.println("C 학점입니다.");
        } else {
            System.out.println("F 학점입니다.");
        }


    }
}
