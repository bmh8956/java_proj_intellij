package lab.chap17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList01 {
	public static void main(String[] args) {
		int[] arr = new int[100];

		for (int i = 0, a = 10; i < arr.length; a+=10) {
			arr[i] = a;
			System.out.print(arr[i] + " ");
			i++;
		}

		System.out.println();
		System.out.println(Arrays.toString(arr));

		List<Integer> arl = new ArrayList<>();

		for(int i=0,a=20;i<100;a+=20) {
			arl.add(a);
			System.out.print(arl.get(i) + " ");
			i++;
		}

		System.out.println();
		System.out.println(arl);

	}
}
