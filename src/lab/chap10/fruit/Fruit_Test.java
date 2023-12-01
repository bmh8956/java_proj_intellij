package lab.chap10.fruit;

import common.Common;

import java.util.ArrayList;
import java.util.List;

public class Fruit_Test {
	public static void main(String[] args) throws IllegalAccessException, InstantiationException {
		Fruit ap = new Apple("사과", 30, 5000);
		Fruit ba = new Banana("바나나", 44, 6000);
		Fruit st = new Strawberry("딸기", 55, 7000);

		List<Fruit> li = new ArrayList<>();
		li.add(ap);
		li.add(ba);
		li.add(st);

//		for(Fruit f : li) {
//			f.totalPrice();
//		}

		List<Object> ls = new ArrayList<>();
		List<Fruit> ll = new ArrayList<>();
		ls = Common.autoObject(4, ap, 5, 100);
		ls = Common.autoObject(5, ba, 6, 200);
		for(Object ob : ls) {
			ll.add((Fruit) ob);
			System.out.println(ob);
		}
		Fruit.tt(ll);
		System.out.println(ap);


	}
}
