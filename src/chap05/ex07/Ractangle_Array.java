package chap05.ex07;

import java.util.*;

public class Ractangle_Array {
	public static void main(String[] args) {
		int[][] arr1 = new int[3][4];
		int[][] arr2;
		int arr3[][] = new int[3][4];
		int arr4[][];
		arr4 = new int[3][4];

		int[][] arr5 = new int[][]{{1, 2, 3}, {4, 5, 6, 7}};
		System.out.println(arr5[1][2]);

		int[][] arr6;
		arr6 = new int[][]{{1, 2, 3, 4, 5}, {2, 3, 4, 5, 6,7}, {11, 22, 33, 44}};
		System.out.println(Arrays.deepToString(arr6));

		int[][] arr7 = {{1, 2, 3, 4, 5}, {2, 3, 4, 5, 6,7}, {11, 22, 33, 44}};
		
		int[][] arr8;
//		arr8 = {{1, 2, 3, 4, 5}, {2, 3, 4, 5, 6,7}, {11, 22, 33, 44}};  //오류
		arr8 = new int[][]{{1, 2, 3, 4, 5}, {2, 3, 4, 5, 6,7}, {11, 22, 33, 44}};

	}
}
