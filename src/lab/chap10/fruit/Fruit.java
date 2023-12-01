package lab.chap10.fruit;

import java.lang.reflect.Field;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Random;

public class Fruit {
	String name;
	int cnt;
	int price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	void totalPrice() {
		System.out.println("과일의 총 가격은 " + (cnt * price) + "원 입니다.");
	}

	static void tt(List<Fruit> li) {
		int total = 0;
		String fm = "";
		DecimalFormat df = new DecimalFormat("###,###");
		for(Fruit f : li) {
			System.out.println(f.name + "의 전체 가격은 " + df.format(f.cnt * f.price) + "원 입니다.");
			total += f.cnt * f.price;
			fm = df.format(total);
		}
		System.out.println("과일의 총 가격은 " + fm + "원 입니다.");
	}

	static void auto(Object obj) throws IllegalAccessException {
		Class<?> c = obj.getClass();
		Field[] fields = c.getDeclaredFields();
		if(fields.length == 0) fields = c.getSuperclass().getDeclaredFields();

		for(Field f : fields) {
			f.setAccessible(true);
			int random_int = 0;
			if(f.getType() == String.class) {
				int leftLimit = 48; // numeral '0'
				int rightLimit = 122; // letter 'z'
				int targetStringLength = 10; // 문자열 길이
				Random random = new Random();

				String generatedString = random.ints(leftLimit, rightLimit + 1)
						.filter(j -> (j <= 57 || j >= 65) && (j <= 90 || j >= 97))
						.limit(targetStringLength)
						.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
						.toString();
				f.set(obj, generatedString);
			} else if(f.getType() == int.class) {
				random_int = (int) (Math.random() * 100) + 1;
				f.set(obj, random_int);
			}
		}
	}

}
