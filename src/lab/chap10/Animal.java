package lab.chap10;

import java.util.Random;

public class Animal {
	String aName;
	int age;
	int cnt;

	void printInfo() {
		System.out.println(this.toString());
	}

	Animal create(Animal a) {

		// 랜덤 문자열
		int leftLimit = 48; // numeral '0'
		int rightLimit = 122; // letter 'z'
		int targetStringLength = 5; // 문자열 길이
		Random random = new Random();

		String generatedString = random.ints(leftLimit, rightLimit + 1)
				.filter(j -> (j <= 57 || j >= 65) && (j <= 90 || j >= 97))
				.limit(targetStringLength)
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
				.toString();
		//

		a.aName = generatedString;
		a.age = (int) (Math.random() * 11);
		a.cnt = (int) (Math.random() * 101);


		return a;
	}

	@Override
	public String toString() {
		return "Animal{" +
				"aName='" + aName + '\'' +
				", age=" + age +
				", cnt=" + cnt +
				'}';
	}
}
