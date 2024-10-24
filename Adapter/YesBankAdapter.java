package designpatterns.Adapter;

public class YesBankAdapter implements BankApi{
	YesBank yesBank = new YesBank();
	
	@Override
	public void sendMoney(String from, String to, double amountinInr) {
		this.yesBank.transferMoney(to, from, 5000);
	}

	@Override
	public double checkBalance(String accountNum) {
		return this.yesBank.getBalance(accountNum);
	}

}
