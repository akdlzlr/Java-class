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
			throw new BalanceInsufficientExceptionEx("잔고부족 : " + 
												(money - balance)+"원 모자람");
		}
		balance -=money;
	}
}
