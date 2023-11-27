package lab.chap05;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Definition2 {
	public static void main(String[] args) {
//		arr : 배열변수 String 값을 저장; 방 6개

		String[] arr = new String[6];
		arr[0] = "자바";
		arr[1] = "HTML";
		arr[2] = "CSS";
		arr[3] = "javascript";
		arr[4] = "oracle";
		arr[5] = "spring";

////		출력1: 직접 찍어서 출력
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
//		System.out.println(arr[5]);
//
//		System.out.println("===================================");
//
////		출력2: for문
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//
//		System.out.println("===================================");
//
////		출력3: Enhanced for문
//		for (String str : arr) {
//			System.out.println(str);
//		}
//
//		System.out.println("===================================");
//
////		출력4: Arrays.toString(arr)
//		System.out.println(Arrays.toString(arr));
//
//		System.out.println("===================================");

		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("===================================");
			System.out.println("1:직접 출력 \n2:for \n3:enhanced for \n4:Arrays.toString \n5:End");
			System.out.println("===================================");
			int sn = sc.nextInt();
			if (sn == 1) {
				System.out.println("직접 출력");
				System.out.println(arr[0]);
				System.out.println(arr[1]);
				System.out.println(arr[2]);
				System.out.println(arr[3]);
				System.out.println(arr[4]);
				System.out.println(arr[5]);
			} else if (sn == 2) {
				System.out.println("for");
				for (int i = 0; i < arr.length; i++) {
					System.out.println(arr[i]);
				}
			} else if (sn == 3) {
				System.out.println("enhanced for");
				for (String str : arr) {
					System.out.println(str);
				}
			} else if (sn == 4) {
				System.out.println("Arrays.toString");
				System.out.println(Arrays.toString(arr));
			} else if (sn == 5) {
				System.out.println("End");
				break;
			}

		} while (true);

		sc.close();
	}
}
