package designpatterns.Adapter;

public class Phonepe {
	private BankApi bankApi;
	
	public Phonepe() {
		this.bankApi = new YesBankAdapter();
	}
	
	public void sendMoney(String from, String to, double amountInINR) {
		this.bankApi.sendMoney(from, to, amountInINR);
	}
	
	public double getBalance(String accNum) {
		return this.bankApi.checkBalance(accNum);
	}
}
