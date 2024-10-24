package designpatterns.Adapter;

public interface BankApi {
	void sendMoney(String from, String to, double amountinInr);
	double checkBalance(String accountNum);
}
