package lab.chap10.fruit;

public class Apple extends Fruit{

	public Apple() {

	}

	Apple(String name, int cnt, int price) {
		super.name = name;
		super.cnt = cnt;
		super.price = price;
	}

	@Override
	void totalPrice() {
		System.out.println(name + "의 전체 가격은 " + (cnt * price) + "원 입니다.");
	}

	@Override
	public String toString() {
		return "Apple{" +
				"name='" + name + '\'' +
				", cnt=" + cnt +
				", price=" + price +
				'}';
	}
}
