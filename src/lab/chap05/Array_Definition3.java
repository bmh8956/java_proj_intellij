package lab.chap05;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Definition3 {
	public static void main(String[] args) {
//		1. 스캐너로 인풋값을 받아서 배열크기 지정 7의 배수와 8의 배수를 저장 후 출력
//		2. 스캐너로 인풋값을 받아서 배열크기 지정 1씩 증가하는데 4의 배수는 제외
//		3. 스캐너로 인풋값을 받아서 배열크기 지정 3의 배수는 저장 6의 배수는 제외

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("1. 스캐너로 인풋값을 받아서 배열크기 지정 7의 배수와 8의 배수를 저장 후 출력");
			System.out.println("2. 스캐너로 인풋값을 받아서 배열크기 지정 1씩 증가하는데 4의 배수는 제외");
			System.out.println("3. 스캐너로 인풋값을 받아서 배열크기 지정 3의 배수는 저장 6의 배수는 제외");
			int sn = sc.nextInt();

			if(sn == 1) {
				System.out.println("1. 스캐너로 인풋값을 받아서 배열크기 지정 7의 배수와 8의 배수를 저장 후 출력");
				int sn1 = sc.nextInt();
				int[] arr = new int[sn1];
				for(int i=0,j=0;j<arr.length;i++) {
					if((i % 7 ==0 || i % 8 == 0) && i>0) {
						arr[j] = i;
						j++;
					}
				}
				System.out.println(Arrays.toString(arr));
			} else if(sn == 2) {
				System.out.println("2. 스캐너로 인풋값을 받아서 배열크기 지정 1씩 증가하는데 4의 배수는 제외");
				int sn1 = sc.nextInt();
				int[] arr = new int[sn1];
				for(int i=0,j=0;j<arr.length;i++) {
					if(i % 4 != 0) {
						arr[j] = i;
						j++;
					}
				}
				System.out.println(Arrays.toString(arr));
			} else if(sn == 3) {
				System.out.println("3. 스캐너로 인풋값을 받아서 배열크기 지정 3의 배수는 저장 6의 배수는 제외");
				int sn1 = sc.nextInt();
				int[] arr = new int[sn1];
				for(int i=0,j=0;j<arr.length;i++) {
					if(i % 3 == 0 && i % 6 != 0) {
						arr[j] = i;
						j++;
					}
				}
				System.out.println(Arrays.toString(arr));
			} else {
				break;
			}

		} while(true);
	}
}
