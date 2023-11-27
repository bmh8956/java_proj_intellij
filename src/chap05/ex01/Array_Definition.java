package chap05.ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Array_Definition {
	public static void main(String[] args) {
        /*
            자료형 : 변수, 상수, 배열을 정의 할떄 자료형이 정의되어야함
                - 기본 자료형 : Stack 공간 변수명, 값, 값비교 ==
                    boolean, 정수(byte, short, int, long), 실수(float, double), 문자(char)
                - 참조 자료형 : Stack 공간에는 변수 참조주소, Heap에 값이 저장됨, 값비교 .equals
                    String(문자열), 객체, 배열, 인터페이스

            배열 : 하나의 배열 변수에 여러개의 값을 넣을 수 있다.
                - index : 0 ~
                - 배열을 선언시 방번호가 선언되어야한다.
                - 배열의 index : .length  ->  갯수 확인
        */
//        변수 : 하나의 값만 넣을 수 있다.
		int a = 10;
		int b;
		int c;
		c = 20;
		c = 30;
		c = 40;

		System.out.println(a);
//        System.out.println(b);    // 초기값이 없으면 오류
		System.out.println(c);

//        배열 : 배열 변수 하나에 여러 값을 넣을 수 있다.
		int[] arr = new int[5]; // index : 0 ~ 4
//        자료형[] 배열변수 = new 자료형[방의 갯수]
//            new : 배열의 값을 Heap에 저장
//            int[5] :

//        배열의 각 방의 값을 출력
		System.out.println(arr[1]);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i * 11;
		}

		System.out.println(Arrays.toString(arr));

		ArrayList arl = new ArrayList<>();
		arl.add("asd");
		arl.add("asd");
		arl.add("asd");
		System.out.println(arl);
		HashMap map = new HashMap();
		map.put("a", "A");
		map.put("b", "B");
		map.put("c", "C");
		System.out.println(map);

	}
}
