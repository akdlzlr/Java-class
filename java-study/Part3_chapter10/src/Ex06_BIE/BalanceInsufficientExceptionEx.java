package Ex06_BIE;

public class BalanceInsufficientExceptionEx	extends Exception {
	public BalanceInsufficientExceptionEx() {
		
	}
	
	public BalanceInsufficientExceptionEx(String message) {
		super(message);
	}
}