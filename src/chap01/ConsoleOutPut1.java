package chap01;
//	패키지 : 클래스를 관리하는 폴더

public class ConsoleOutPut1 {	//	class
    public static void main(String[] args) {	// 	main method(main -> ctrl + space)
        //	메인 메소드 내부에서 코드 작성
        //	1. System.out.println(); 	: 	콘솔에 출력, 라인을 개행
        //	문자열 출력 : "출력할 문자열"
        System.out.println("Hi");

        //  문자열을 연결해서 출력 :
            // + : 정수, 실수에서는 덧셈
            // + : 문자열에서는 연결
        System.out.println("문자열 " + "연결");
        System.out.println(10.5 + 95.1023);

        //  문아열, 정수, 실수
        System.out.println("문자열 + 정수, 실수 " + 10.5+95.123);
        System.out.println(2.22+3.33 + " 정수, 실수 + 문자열 " + 2.22+3.33);
        System.out.println("문자열 + (정수, 실수) " + (10.55 + 56.55));

        //  변수에 값을 할당 후 출력
            //  변수      :   메모리에서 변화하는 값을 담을 수 있다.
            //  변수 선언   :   자료형 변수명 = 값;
        //  =   :   우측의 값을 좌측의 변수에 할당
        //  ==  :   같다. boolean 값 return

        //  문자열
        String str = "Hi";
        //  정수형
        int a = 33;
        //  실수
        int b = 22;

        System.out.println(str);
        System.out.println(a);
        System.out.println(b);
        System.out.println(str + a + b);
        System.out.println(str + (a + b));
        System.out.println("=======================================");

        //  문자열과 변수를 연결해서 출력
        System.out.println("str 변수에 담긴 값 : " + str);

        System.out.println("a + b = " + (a + b));

        System.out.println("====================================");
        //	2. System.out.print();		: 	콘솔 출력, 라인 개행x
        //	\n	:	라인 개행
        //	\t	:	탭

        System.out.println("오늘");
        System.out.println("날씨");
        System.out.println("맑음");

        System.out.println("==============");
        System.out.print("오늘");
        System.out.print("날씨");
        System.out.print("맑음");

        System.out.println("=====\\n=======");
        System.out.print("오늘\n");
        System.out.print("날씨\n");
        System.out.print("맑음\n");

        System.out.println("=====\\t=======");
        System.out.print("오늘\t");
        System.out.print("날씨\t");
        System.out.print("맑음\t");
        System.out.println();
        System.out.println("============printf=================");

        //	3. System.out.printf();		:	콘솔 출력, 출력 문자열 라인의 변수 값을 불러옴
        // 	%s	:	문자열을 불러들임
        //	%d	:	정수를 불러들임
        //  %4.2f : 실수의 값 출력, 전체 4자리리 소수점 이하 2자리
        //  double : 실수값 넣을수있음
        double c = 44.445;
        System.out.printf("a(%d) + b(%d) = %d /// str+a+b \\ %s \\ a+b+c = %4.2f \n", a, b, a + b, str+a+b, a + b + c);
        str = "날씨";
        String str2 = "흐림";
        System.out.printf("강수확률 %4.2f%s로 오늘의 %s는 %s", a+b+c - 11, "%", str, str2);
        System.out.println();

        //  printf    문자열과 변수를 출력시 간결하게 출력
        System.out.printf("오늘 %s : %s \n변수 a + b = %d \n실수 c = %.3f", str, str2, a + b, c);
        System.out.println();
        //  println     문자열과 별수를 출력시 코드가 길어짐
        System.out.println("오늘 " + str + " : " + str2 + "\n변수 a + b = " + (a + b) + " \n실수 c = " + c);

        //  변수 선언
        String st1 = "오늘 ";
        String st2 = "날씨는 ";
        String st3 = "맑습니다.";

        //  printf();
        System.out.printf("%s%s%s", st1, st2, st3);

        System.out.println();
        //  println();
        System.out.println(st1 + st2 + st3);



    }
    //	System.out.println("Hello World!); <== 오류
}
