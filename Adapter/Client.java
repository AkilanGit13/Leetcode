package designpatterns.Adapter;

public class Client {

	public static void main(String[] args) {
		Phonepe phonepe = new Phonepe();
		System.out.println(phonepe.getBalance("1111"));
		phonepe.sendMoney("AAA", "BBB", 10000);
	}

}
