package Ex06_BIE;

public class AccountEx {
	public static void main(String[] args) {
		Account account = new Account();
//		예금하기
		account.deposit(1000);
		System.out.println("예금액 : "+account.getBalance());
//		출금하귀
		try {
			account.withdraw(2000);
		}catch (BalanceInsufficientExceptionEx e) {
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			e.printStackTrace();
		}
	}
}
