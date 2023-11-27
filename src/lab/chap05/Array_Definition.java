package lab.chap05;

import java.util.Arrays;

public class Array_Definition {
	public static void main(String[] args) {
//		배열 변수명 : arr
//		배열 방 갯수 : 1000
//		각 방에 3의 배수

		int[] arr = new int[1000];
		for (int i = 0, j = 0; j < arr.length; i++) {
			if (i % 3 == 0 && i > 0) {
				arr[j] = i;
				System.out.println(arr[j]);
				j++;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
	}
}
