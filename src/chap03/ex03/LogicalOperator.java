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

//        논리 연산자는 short circuit이 발생할 수 있다. short circuit을 방지하기 위해서 비트 연산자를 사용해서 방지 할 수있다.
            //  AND연산에서 앞에 false가 올 경우 short circuit이 발생
            //  OR연산에서 앞에 true가 올 경우 short circuit이 발생



    }
}
