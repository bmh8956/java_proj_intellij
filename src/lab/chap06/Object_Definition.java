package lab.chap06;

class animal {
	String aName;
	String aColor;
	int aLeg;
	int aSpeed;
	String aCry;

	public animal() {

	}

	public animal(String aName, String aColor, int aLeg, int aSpeed, String aCry) {
		this.aName = aName;
		this.aColor = aColor;
		this.aLeg = aLeg;
		this.aSpeed = aSpeed;
		this.aCry = aCry;
	}

	void printAll() {
		System.out.println(this.toString());
	}

	int abc() {
		return this.aLeg + this.aSpeed;
	}

	@Override
	public String toString() {
		return "animal{" +
				"aName='" + aName + '\'' +
				", aColor='" + aColor + '\'' +
				", aLeg=" + aLeg +
				", aSpeed=" + aSpeed +
				", aCry='" + aCry + '\'' +
				'}';
	}
}


public class Object_Definition {
	public static void main(String[] args) {
		animal t = new animal();
		animal e = new animal();
		animal l = new animal();
		animal d = new animal();

		t.aName = "ger";
		t.aColor = "o&b";
		t.aLeg = 4;
		t.aSpeed = 50;
		t.aCry = "trr";

		e.aName = "gle";
		e.aColor = "w&b";
		e.aLeg = 2;
		e.aSpeed = 100;
		e.aCry = "err";

		l.aName = "on";
		l.aColor = "y";
		l.aLeg = 4;
		l.aSpeed = 40;
		l.aCry = "lrr";

		d.aName = "og";
		d.aColor = "b";
		d.aLeg = 4;
		d.aSpeed = 30;
		d.aCry = "drr";

		t.printAll();
		e.printAll();
		l.printAll();
		d.printAll();


	}
}
