package Ex06_BIE;

public class AccountEx {
	public static void main(String[] args) {
		Account account = new Account();
//		�����ϱ�
		account.deposit(1000);
		System.out.println("���ݾ� : "+account.getBalance());
//		����ϱ�
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
