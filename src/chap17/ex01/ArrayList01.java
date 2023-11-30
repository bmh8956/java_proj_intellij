package chap17.ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList01 {
	public static void main(String[] args) {
		/*
			배열 :


			컬렉션(프레임워크) : 배열의 단점을 보완해서 만든 클래스
				- List(인터페이스) : ArrayList, LinkkedList, Vector
					(메소드 선언)

		*/

//		배열
		String[] arr = new String[]{"가", "나", "다", "라", "마", "바", "사"};

		for(String a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.println(arr.length);

		arr[2] = null;
		arr[3] = null;
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);

		List<String> arl1 = new ArrayList<>();
		List<String> arl2 = new ArrayList<>();
		ArrayList<String> arl3 = new ArrayList<>();

		arl1.add("Test");
		System.out.println(arl1.size());

	}
}
