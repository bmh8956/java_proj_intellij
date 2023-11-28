package lab.chap05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rectangle_Array {
	public static void main(String[] args) {

		int[][] arr = new int[3][10];
		System.out.println(arr.length);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].length);
			if (i == 0) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = j;
				}
			} else if (i == 1) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = (j + 1) * 3;
				}
			} else if (i == 2) {
//				for (int j = 0, a = 1, b = 1; j < arr[i].length; j++) {
//					if (j % 2 == 0) {
//						arr[i][j] = a * 7;
//						a++;
//					} else {
//						arr[i][j] = b * 8;
//						b++;
//					}
//				}
				int a = 1;
				for (int j = 0; j < arr[i].length; a++) {
					if (a % 7 == 0 || a % 8 == 0) {
						arr[i][j] = a;
						j++;
					}
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}

		for (int[] k : arr) {
			System.out.println(Arrays.toString(k));
		}

		System.out.println(Arrays.deepToString(arr));

	}
}
