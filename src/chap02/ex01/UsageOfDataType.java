package chap02.ex01;

public class UsageOfDataType {
    public static void main(String[] args) {
        //  변수  :   한번 선언한 변수의 값을 다른 값을 할당 할 수 있다. 소문자로 시작, 카멜케이스
        //  상수  :   변수 선언 앞에 final 키가 등록됨, 상수명은 대문자로만 지정, 한번 값을 선언하면 값 변경불가

        /*  자료형  :   변수/상수를 정의할때 반드시 자료형
            - 기본 자료형 (8개)   : 메모리의 Stack 공간에 변수와 같이 할당됨
                    -> boolean, 정수(byte, short, int, long, float, double), 문자(char)
            - 참조 자료형 (무한)   : 메모리의 Stack 공간에 변수명, 값은 Heap에 저장
                    첫자는 대문자
                    객체 / 배열 / 인터페이스
                    String : 참조자료형, 문자열
         */
//            변수 선언 방법
//                a. 변수 선언과, 값은 나중에 할당
                    int a;  // 변수 선언
                    int b;  //

                    a = 1;  //  변수의 값을 나중에 할당

//                b. 변수 선언과 동시에 값을 할당
        System.out.println(a);
//        System.out.println(b); // 오류
//             변수 선언과 동시에 값을 할당
        int c = 10;
        int d = 20;
        System.out.println(c);
        System.out.println(d);
        //  리터럴 : 변수, 상수에 들어가는 값

        //  변수에 새로운 값을 할당
        c = 55;
        d = 66;
        System.out.println(c);
        System.out.println(d);

        //  상수  :   한번 값이 할당되면 다른 값을 넣을 수 없다. final 키를 넣어서 상수 선언
            //  상수 명은 대문자로 할당
        final int ABC = 200;
        final double PI = 3.14;

        System.out.println(ABC);
//        ABC = 100;
        final int asd = 11;
        System.out.println(asd);

        System.out.println("========8가지 자료형===========");

        //  기본 자료형 8가지
        boolean abc;
        abc = true;
        System.out.println(abc);

        //  정수 값을 넣을 수 있는 자료형
/*                  byte : 1byte(8bit)      -128 ~ 127
                    short : 2byte(16bit)    -32,768 ~ 32,767
                    int : 4byte(32bit)      -2,147,483,648 ~ 2,147,483,647
                    long : 8byte(64bit)     -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
*/
        byte aa;
        aa = -128;
        System.out.println(aa);

        short bb;
        bb = 32767;
        System.out.println(bb);

        int cc;
        cc = 2147483647;
        System.out.println(cc);

        long dd;
        long ff;
        //  long 에서 int의 범위를 넘어가면 L을 뒤에 붙임
        dd = 9223372036854775807L;
        ff = 2147483647;
        System.out.println(dd);
        System.out.println(ff);

        //  실수  : float, double(기본)
/*              float : 4byte(32bit), 소수점 7자리까지 정밀도 유지, 리터럴뒤어 f, F
                double : 8byte(64bit), 소수점 15자리까지 정밀도 유지
 */
        float jj;
        jj = 3.141232132132131232133F;
        System.out.println(jj);

        double kk;
        kk = 3.1415123123321666666666666;
        System.out.println(kk);
        System.out.println("=============================================");
        // char : 1문자를 넣을 수 있음. 영문, 한글, 일본어, 중국어, String : 문자열
/*
            - char 의 값을 넣을때에는 ''
            - 1문자
            - 문자, 아스키 코드값(10진수), 유니코드로 할당(16진수)
 */
        char ll;
        ll = 'A';
        char mm = '가';
        System.out.println(ll);
        System.out.println(mm);

        ll = 97;
        System.out.println(ll);
        char nn = 'a';
        System.out.println(nn);

        char pp = '\u0061';
        System.out.println(pp);

        //  출력 내용 : 나의 이름은 방 민혁 입니다.
        char lastName = '\uBC29';
        char la = '\uBC29';
        char firstName1 = '\uBBFC';
        char fi1 = '\uBBFC';
        char firstName2 = '\uD601';
        char fi2 = '\uD601';

        System.out.println("나의 이름은 " + la + " " + fi1 + fi2 + "입니다.");
        System.out.printf("나의 이름은 %s %s%s입니다.", la, fi1, fi2);

    }
}
