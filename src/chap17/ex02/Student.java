package chap17.ex02;
public class Student {

	String name;
	int age;
	String addr;
	int num;
	int kor;
	int eng;
	int math;

	public Student() {

	}

	public Student(Student st) {
		this.name = st.name;
		this.addr = st.addr;
		this.num = st.num;
		this.kor = st.kor;
		this.eng = st.eng;
		this.math = st.math;
	}

	public Student(String name, String addr, int num, int kor, int eng, int math) {
		this.name = name;
		this.addr = addr;
		this.num = num;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	void hapAvg(Student s) {
		int total = s.getKor() + s.getEng() + s.getMath();
		double avg = Math.round(total / 3.0 * 100) / 100.0;

		System.out.println(s.getName() + "의 국영수 합계점수: " + total + "  평균점수: " + avg);
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", addr='" + addr + '\'' +
				", num=" + num +
				", kor=" + kor +
				", eng=" + eng +
				", math=" + math +
				'}';
	}
}
