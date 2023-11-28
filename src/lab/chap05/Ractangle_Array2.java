package lab.chap05;

import java.util.Arrays;

public class Ractangle_Array2 {
	public static void main(String[] args) {

		int[][] arr = new int[5][10];
		int a = 1;
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = (j + 1) * 2;
				}
			} else if (i == 1) {
				a = 1;
				for (int j = 0; j < arr[i].length; a++) {
					if (a % 3 != 0 && a % 2 != 0) {
						arr[i][j] = a;
						j++;
					}
				}
			}
			if (i == 2) {
				a = 1;
				for (int j = 0; j < arr[i].length; a++) {
					if (a % 4 == 0 || a % 5 == 0) {
						arr[i][j] = a;
						j++;
					}
				}
			} else if (i == 3) {
				a = 1;
				for (int j = 0; j < arr[i].length; a++) {
					if (a % 10 == 0) {
						arr[i][j] = a;
						j++;
					}
				}
			} else if (i == 4) {
				a = 1;
				for (int j = 0; j < arr[i].length; a++) {
					if (a % 8 == 0) {
						arr[i][j] = a;
						j++;
					}
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d\t", arr[i][j]);
			}
			System.out.println();
		}

		for (int[] k : arr) {
			for (int l : k) {
				System.out.printf("%d\t", l);
			}
			System.out.println();
		}

		for (int[] k : arr) {
			System.out.println(Arrays.toString(k));
		}

		System.out.println(Arrays.deepToString(arr));
	}
}
