package chap06.ex03;

public class Member_Test {
	public static void main(String[] args) {
//		같은 패키지 내에서는 import없이 클래스 사용가능
//		접근제어자가 default 이상이어야 한다.

		Member mb = new Member();
		mb.setIdx(1);
		mb.setId("ID001");
		mb.setPw("pwd");
		mb.setName("minhyeok");
		mb.setYear(1995);
		mb.setMonth(10);
		mb.setDay(23);
		mb.setAddr("서울 강북구 수유동");
		mb.setPhone("01020655900");
		System.out.println(mb.toString());

	}
}
