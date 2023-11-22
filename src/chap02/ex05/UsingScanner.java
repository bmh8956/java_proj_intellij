package chap02.ex05;

import java.util.Scanner;

public class UsingScanner {

    public static void main(String[] args) {

//        외부의 라이브러리 사용 : java에서 만들어진 클래스의 묶음을 라이브러리
//        import가 필요    // java.lang 패키지의 클래스는 import없이 바로 사용가능
        System.out.println();
        String a = "";
        Integer b;
        Double c;
        Long d;

        /*  Scanner : 콘솔로부터 입력값을 받아오는 클래스(객체)
                - 외부 클래스 : java.lang 외부에 존재하는 클래스 <== import가 필요
                - 동일한 패키지에 존재하는 클래스는 import 없이 사용가능
                - 동일한 패키지에 존재하지 않는 클래스는 import
                - java.util.Scanner : 클래스의 전체 이름 (패키지.클래스명)
                - ctrl + shift + o : 자동으로 import
                - 콘솔에서 값을 넣고 Enter : 공백를 넣으면 다음 스캐너리
         */
//        Scanner 객체 생성
//        참조타이비 객체변수명 = new (Heap에 객체의 값을 저장하겠다.)
        Scanner sc = new Scanner(System.in);

//        변수 선언
        String fName;
        String mName;
        String myName;

        System.out.println("아버님 이름을 입력하세요 >>>");
        fName = sc.next();  // sc.next() : 콘솔로부터 "문자열"을 인풋받음

        System.out.println("어머님 이름을 입력하세요 >>>");
        mName = sc.next();

        System.out.println("나의 이름을 입력하세요 >>>");
        myName = sc.next();


        System.out.println("입력받은 아버님의 이름은 " + fName);
        System.out.println("입력받은 어머님의 이름은 " + mName);
        System.out.println("입력받은 나의 이름은 " + myName);

//        Scanner로 정수값 입력 받기
//        변수 선언만 값은 Scanner로
        int aa;
        int bb;
        int cc;

//        Scanner로 변수값을 할당
        System.out.println("aa bb cc 변수에 정수의 값을 공백으로 입력 하세요>>>>>>");

        aa = sc.nextInt();
        bb = sc.nextInt();
        cc = sc.nextInt();

        System.out.println("aa ; " + aa + "\nbb : " + bb + "\ncc : " + cc);



    }
}
