package chap17.ex02;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Method {

	List<Student> aList;
	int[] arr;

	void arrayListOut(List<Student> aList) {
		for (int i = 0; i < aList.size(); i++) {
			Student s = aList.get(i);
			s.setNum(i + 1);

			System.out.println(aList.get(i));
		}
	}

	void arrayOutPut(int a, int[] arr) {
		int count = 0;
		for (int k : arr) {
			if (a == k) {
				count++;
			}
		}
		System.out.println("입력값: " + a + " 같은값: " + count);
	}

	void findNameAddr(List<Student> aList) {
		for (Student s : aList) {
			System.out.println("이름: " + s.getName() + "\t\t주소: " + s.getAddr());
		}
	}

	List<Student> createList(int count, List<Student> aList) {
		aList.clear();
		for (int i = 0; i < count; i++) {
			Student s = new Student();

			// 랜덤 문자열
			int leftLimit = 48; // numeral '0'
			int rightLimit = 122; // letter 'z'
			int targetStringLength = 10; // 문자열 길이
			Random random = new Random();

			String generatedString = random.ints(leftLimit, rightLimit + 1)
					.filter(j -> (j <= 57 || j >= 65) && (j <= 90 || j >= 97))
					.limit(targetStringLength)
					.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
					.toString();
			//

			int randomInt1 = (int) (Math.random() * 101); // 0 ~ 100
			int randomInt2 = (int) (Math.random() * 101);
			int randomInt3 = (int) (Math.random() * 101);

			String[] addr = new String[]{"서울", "부산", "인천", "대구", "대전"};
			int ran_addr = (int) (Math.random() * 5); // 0 ~ 4

			s.setName(generatedString);
			s.setNum(i + 1);
			s.setAddr(addr[ran_addr]);
			s.setKor(randomInt1);
			s.setEng(randomInt2);
			s.setMath(randomInt3);
			aList.add(s);
		}
		return aList;
	}

	void totalAvg(List<Student> aList) {
		Collections.sort(aList, (a, b) -> (b.getKor() + b.getEng() + b.getMath()) - (a.getKor() + a.getEng() + a.getMath()));
		for (Student s : aList) {
			int total = s.getKor() + s.getEng() + s.getMath();
			double avg = Math.round(total / 3.0 * 100) / 100.0;

			System.out.println(s.getName() + "의 국영수 합계점수: " + total + "  평균점수: " + avg);
		}
	}

	void sMethod(Student s) {
		s.hapAvg(s);
	}


}
