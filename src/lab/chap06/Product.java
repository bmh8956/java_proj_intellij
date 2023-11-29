package lab.chap06;

public class Product {

	private long idx;
	private String proName;
	private int qty;
	private int year;
	private String proColor;

	public Product() {

	}

	public Product(long idx, String proName, int qty, int year, String proColor) {
		this.idx = idx;
		this.proName = proName;
		this.qty = qty;
		this.year = year;
		this.proColor = proColor;
	}

	public long getIdx() {
		return idx;
	}

	public void setIdx(long idx) {
		this.idx = idx;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getProColor() {
		return proColor;
	}

	public void setProColor(String proColor) {
		this.proColor = proColor;
	}

	@Override
	public String toString() {
		return "Product{" +
				"idx=" + idx +
				", proName='" + proName + '\'' +
				", qty=" + qty +
				", year=" + year +
				", proColor='" + proColor + '\'' +
				'}';
	}
}
