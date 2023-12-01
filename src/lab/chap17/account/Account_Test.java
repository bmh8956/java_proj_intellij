package lab.chap17.account;

public class Account_Test {
	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//
//		List<Account> aList = new ArrayList<>();
//		Account.create(10, aList);
//		int sel;
//		Account a = aList.get(0);
//		out:
//		do {
//			System.out.println("=====================================================");
//			System.out.println("0.계좌 정보  |  1.입금  |  2.출금  |  3.종료");
//			System.out.println("=====================================================");
//			sel = sc.nextInt();
//
//			switch (sel) {
//				case 0:
//					System.out.println(a.toString());
//					break ;
//				case 1:
//					System.out.println("입금하려는 금액을 입력해주세요");
//					int de = sc.nextInt();
//					a.deposit(de);
//					break;
//				case 2:
//					System.out.println("출금하려는 금액을 입력해주세요");
//					int wi = sc.nextInt();
//					a.withdraw(wi);
//					break;
//				case 3:
//
//					break out;
//			}
//
//		} while (true);
//		System.out.println("프로그램 종료");
//		sc.close();

//		List<Account> aList1 = new ArrayList<>();
//
//		out:
//		do {
//			System.out.println("=======================================================================");
//			System.out.println("0.생성할 계좌의 수 | 1.전체 계좌 조회 | 2.잔액이 가장 많은 고객정보 | 3.잔액이 많은 고객 상위 n명 | 4.잔액이 적은 고객 하위 n명");
//			System.out.println("=======================================================================");
//
//			sel = sc.nextInt();
//
//			switch (sel) {
//				case 0:
//					System.out.println("0.생성할 계좌의 수");
//					int count = sc.nextInt();
//					Account.create(count, aList1);
//					break;
//				case 1:
//					System.out.println("전체 계좌 조회");
//					for (Account asd : aList1) {
//						System.out.println(asd);
//					}
//					System.out.println("전체 계좌 " + aList1.size() + "개");
//					break;
//				case 2:
//					System.out.println("잔액이 가장 많은 고객정보");
//					Collections.sort(aList1, (x, y) -> y.getMoney() - x.getMoney());
//					System.out.println(aList1.get(0));
//					break;
//				case 3:
//					System.out.println("잔액이 많은 고객 상위 n명");
//					int n = sc.nextInt();
//					if (aList1.size() < n) {
//						System.out.println("잘못된 값입니다.");
//						break;
//					}
//					Collections.sort(aList1, (x, y) -> y.getMoney() - x.getMoney());
//					for (int i = 0; i < n; i++) {
//						System.out.println(aList1.get(i));
//					}
//					break;
//				case 4:
//					System.out.println("잔액이 적은 고객 하위 n명");
//					int n1 = sc.nextInt();
//					if (aList1.size() < n1) {
//						System.out.println("잘못된 값입니다.");
//						break;
//					}
//					Collections.sort(aList1, (x, y) -> x.getMoney() - y.getMoney());
//					for (int i = 0; i < n1; i++) {
//						System.out.println(aList1.get(i));
//					}
//					break;
//				case 5:
//
//					break out;
//			}
//		} while (true);
//		System.out.println("프로그램 종료");
//		sc.close();

	}
}
