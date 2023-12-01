package lab.chap10.fruit;

public class Strawberry extends Fruit{
	public Strawberry() {

	}

	Strawberry(String name, int cnt, int price) {
		super.name = name;
		super.cnt = cnt;
		super.price = price;
	}

	@Override
	void totalPrice() {
		System.out.println(name+ "의 전체 가격은 " + (cnt * price) + "원 입니다.");
	}

	@Override
	public String toString() {
		return "Strawberry{" +
				"name='" + name + '\'' +
				", cnt=" + cnt +
				", price=" + price +
				'}';
	}
}
