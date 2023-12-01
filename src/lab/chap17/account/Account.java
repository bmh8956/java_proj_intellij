package lab.chap17.account;

import java.util.List;
import java.util.Random;

public class Account {

	private String name;
	private int account;
	private int money;
	private List<Account> auto;

	public Account() {

	}

	public Account(String name, int account, int money, List<Account> auto) {
		this.name = name;
		this.account = account;
		this.money = money;
		this.auto = auto;
	}

	public Account(String name, int account, int money) {
		this.name = name;
		this.account = account;
		this.money = money;
	}

	void deposit(int money) { //입금 -> 잔금
		this.money += money;
		System.out.println(money + "원 입금이 완료되었습니다. 현재 계좌의 잔액은 " + this.money);
	}

	void withdraw(int money) {   //출금 -> 잔금
		this.money -= money;
		System.out.println(money + "원 출금이 완료되었습니다. 현재 계좌의 잔액은 " + this.money);
	}

	static List<Account> create(int count, List<Account> li) {
		li.clear();
		for (int i = 0; i < count; i++) {
			Account a = new Account();

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

			int account = (int) (Math.random() * 100001); // 0 ~ 100
			int money = (int) (Math.random() * 10000100);

			a.setName(generatedString);
			a.setAccount(account);
			a.setMoney(money);
			li.add(a);
		}
		return li;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "Account{" +
				"name='" + name + '\'' +
				", account=" + account +
				", money=" + money +
				'}';
	}
}
