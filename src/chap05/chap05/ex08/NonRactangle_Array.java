package chap05.chap05.ex08;

import java.util.Arrays;

public class NonRactangle_Array {
	public static void main(String[] args) {
		int[][] arr = new int[3][];

		arr[0] = new int[2];
		arr[1] = new int[3];
		arr[2] = new int[4];

		System.out.println(Arrays.deepToString(arr));
	}
}
