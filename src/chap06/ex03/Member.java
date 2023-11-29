package chap06.ex03;

public class Member {
	/*
		접근 제어자 : OOP의 캡슐화 필드 메소드 클래스에 보안
			-   클래스 : public default
			-   필드 : public, protected default, private
			-   메소드 : public, protected default, private


		public : 다른 패키지에서 접근 가능
		protected : 다른 패키지에서 접근 가능(상속관계인 경우)
		default : 같은 패키지에서 접근 가능
		private : 외부 클래스에서 수정 불가
	*/

//	1. 필드
	private long idx;
	private String id;
	private String pw;
	private String name;
	private int year;
	private int month;
	private int day;
	private String phone;
	private String addr;

//	2. 생성자
	public Member() {

	}

	public Member(long idx, String id, String pw, String name, int year, int month, int day, String phone, String addr) {
		this.idx = idx;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.year = year;
		this.month = month;
		this.day = day;
		this.phone = phone;
		this.addr = addr;
	}

	public long getIdx() {
		return idx;
	}

	public void setIdx(long idx) {
		this.idx = idx;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Member{" +
				"idx=" + idx +
				", id='" + id + '\'' +
				", pw='" + pw + '\'' +
				", name='" + name + '\'' +
				", year=" + year +
				", month=" + month +
				", day=" + day +
				", phone='" + phone + '\'' +
				", addr='" + addr + '\'' +
				'}';
	}
}
