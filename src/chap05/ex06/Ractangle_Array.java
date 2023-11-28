package chap05.ex06;

import java.util.Arrays;

public class Ractangle_Array {
	public static void main(String[] args) {
		/*
			다차원 배열 : 2차원 정방형 배열 
		*/
		
//		1. 2차원 정방형 배열 선언
//			[] : 행, [] : 열
		int[][] arr1 = new int[3][4];   // Heap에 값을 저장할 방을 만듬
		arr1[0][0] = 11;
		arr1[0][1] = 12;

		for(int i = 0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				arr1[i][j] = i;
				System.out.println(arr1[i][j]);
			}
		}

		for(int[] k : arr1) {
			System.out.println(Arrays.toString(k));
		}

		System.out.println(Arrays.deepToString(arr1));

		int[][] ar = {{1, 2, 3}, {2, 3, 4},{3, 4, 5}};
		System.out.println(Arrays.deepToString(ar));


	}
}
