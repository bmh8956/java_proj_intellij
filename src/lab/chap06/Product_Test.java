package lab.chap06;

import java.util.Arrays;

public class Product_Test {
	public static void main(String[] args) {
		Product pr1 = new Product();
		Product pr2 = new Product();
		Product pr3 = new Product();
		Product pr4 = new Product();

		Product[] arr = new Product[10];

		pr1.setIdx(1);
		pr1.setProName("product1");
		pr1.setQty(10);
		pr1.setYear(2021);
		pr1.setProColor("red");

		pr2.setIdx(2);
		pr2.setProName("product2");
		pr2.setQty(20);
		pr2.setYear(2022);
		pr2.setProColor("blue");

		pr3.setIdx(3);
		pr3.setProName("product3");
		pr3.setQty(30);
		pr3.setYear(2023);
		pr3.setProColor("green");

		pr4.setIdx(4);
		pr4.setProName("product4");
		pr4.setQty(40);
		pr4.setYear(2024);
		pr4.setProColor("black");

		arr[0] = pr1;
		arr[1] = pr2;
		arr[2] = pr3;
		arr[3] = pr4;

		for(Product p : arr) {
			if(p != null) System.out.println(p);
		}

		System.out.println("===================================================");

		for(int i=0;i<arr.length;i++) {
			Object p = arr[i];
			System.out.println(p);
		}

		System.out.println("===================================================");

		System.out.println(Arrays.toString(arr));


	}
}
