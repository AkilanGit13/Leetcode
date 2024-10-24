package designpatterns.Adapter;

public class YesBank {
	
	public boolean transferMoney(String to, String from, int amount){
		System.out.println(String.format("amount %d, transferred from %s account to %s account using yesbank", amount, from, to));
		return true;
	}
	
	public int getBalance(String accNum) {
		// Account acc = map.get(accNum);
		// return acc.getBalance();
		System.out.println("yes bank balance "+ 50000);
		return 35000;
	}
}
