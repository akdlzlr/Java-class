package Ex06_BIE;

public class Account {
	private long balance;
	
	public Account() {
	}
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance +=money;
	}
	
	public void withdraw(int money) throws BalanceInsufficientExceptionEx  {
		if (balance < money) {
			throw new BalanceInsufficientExceptionEx("�ܰ���� : " + 
												(money - balance)+"�� ���ڶ�");
		}
		balance -=money;
	}
}
