package chap05.ex04;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_Definition {
	public static void main(String[] args) {
		/*
			배열의 선언방법 : 3가지
		*/

//		1. 배열의 선언 - 1 : 배열 변수 선언과 동시에 방의 크기 지정

		int[] arr = new int[3]; // 선언과 동시에 방의 크기 지정
		int[] arr2;             // 선언
		arr2 = new int[2];      // 방의 크기는 나중에 지정

//		2. 배열 선언 - 2
		int arr3[] = new int[3];
		int arr4[];
		arr4 = new int[4];

//		3. 배열 선언 -3 : 배열 선언과 동시에 값을 할당
		int[] arr5 = new int[]{10, 20, 30};

		System.out.println(Arrays.toString(arr5));

	}
}
