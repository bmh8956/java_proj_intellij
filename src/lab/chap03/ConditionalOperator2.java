package lab.chap03;

import java.util.Scanner;

public class ConditionalOperator2 {
    public static void main(String[] args) {
//        Scanner로 "안녕" 문자열을 입력, "안녕" -> "안녕하세요" 출력, 아닐시에 "안녕 못합니다."
        String hi;
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열 입력 : ");
        hi = sc.next();
        hi = (hi.equals("안녕"))? "안녕하세요." : "안녕 못합니다.";
        System.out.println(hi);

//        참조 자료형일때 변수의 값은 Heap 공간에 저장됨, stack에는 변수명과 Heap에 저장된 값의 주소가 저장

    }
}
