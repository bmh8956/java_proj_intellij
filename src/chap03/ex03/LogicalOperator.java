package chap03.ex03;

public class LogicalOperator {
    public static void main(String[] args) {
        /*
            논리 연산자 : 결과값으로 true/false 를 리턴
                && : true && true = true, true && false = false, false && false = false
                || : true || true = true, true || false = true, false || false = false
                ^(NOT) : ^ 연산 : 앞 뒤가 같을 때 false, 다를때 true
                        - true ^ true = false
                        - false ^ true = true
                        - false ^ false = false
                        - true ^ false = true
                ! : 반대
                    - !true = false
                    - !false = true

         */
//        && 연산 : 모두 true 일때 true
        System.out.println(true && true);   // true
        System.out.println(true && false);  // false
        System.out.println(false && false); // false
        System.out.println(false && true); // false
        System.out.println("=====================================");

//        || 연산 : 하나라도 true이면 true
        System.out.println(true || true);   // true
        System.out.println(true || false);  // true
        System.out.println(false || false); // false
        System.out.println(false || true); // true
        System.out.println("=====================================");

//        ^ 연산 : 앞 뒤가 같을 때 false, 다를때 true
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ false);
        System.out.println(false ^ true);
        System.out.println("=====================================");


//        ! 연산 : 반대
        System.out.println(!true);  // false
        System.out.println(!false); // true
        System.out.println("=====================================");

        System.out.println("====short circuit 발생 예문===============");
//        논리 연산자는 쇼트 서킷이 발생할 수 있다. 쇼트 서킷을 방지하기 위해서 비트 연산자를 사용해서 방지 할 수있다.
            //  AND연산에서 앞에 false가 올 경우 쇼트 서킷이 발생
            //  OR연산에서 앞에 true가 올 경우 쇼트 서킷이 발생
//        쇼트 서킷이 발생되지 않는 경우 : && 연산에서 앞에 true 뒤에 값을 확인 후 결과를 리턴
//                                    || 연산에서 앞에 true 뒤에 값을 무시라고 결과를 리턴
        int val10 = 3;

        System.out.println(false && ++val10 > 6);   // 쇼트 서킷 발생
        System.out.println(val10);

        int val11 = 3;

        System.out.println(false || ++val11 > 6);   // or 앞에 true일때 , 뒤 값은 실행하지 않는다.
        System.out.println(val11);

        System.out.println("=============================");

//        비트 연산자를 사용해서 쇼트 서킷방지, - &, |
//            비트 연산, 논리 연산(쇼트 서킷을 방지할때 사용)

        int val12 = 3;

        System.out.println(false & ++val12> 6);
        System.out.println(val12);

    }
}
