package designpatterns.Adapter;

public class HDFCBank {
	public void accountTransfer(String from, String to, double amountinDollar){
		System.out.println(String.format("amount %.2f$, transferred from %s account to %s account using hdfc bank", amountinDollar, from, to));
	}
	
	public int giveBalance(String accNum) {
		// Account acc = map.get(accNum);
		// return acc.getBalance();
		System.out.println("hdfc balance "+ 35000);
		return 35000;
	}
}
