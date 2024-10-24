package designpatterns.Adapter;

public class HDFCAdapter implements BankApi{
	HDFCBank hdfc = new HDFCBank();
	
	@Override
	public void sendMoney(String from, String to, double amountinInr) {
		double amountinDollar = amountinInr/80;
		hdfc.accountTransfer(from, to, amountinDollar);
	}

	@Override
	public double checkBalance(String accountNum) {
		return hdfc.giveBalance(accountNum);
	}
	
}
