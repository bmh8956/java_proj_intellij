package chap05.ex03;

import java.util.Arrays;

public class Array_Definition3 {
	public static void main(String[] args) {
//		배열의 값을 출력하는 방법 : 4가지

//		배열 변수 선언
		int[] arr = new int[1000];

//		각 방에 6의 배수를 저장
		for (int i = 0, j = 6; i < arr.length; i++) {
			arr[i] = j;
//			System.out.println(arr[i]);
			j += 6;
		}

		for (int i : arr) {
			System.out.println(i);
		}
		System.out.println(Arrays.toString(arr));
	}

}
