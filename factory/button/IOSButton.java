package designpatterns.factory.button;

public class IOSButton implements Button {

	@Override
	public void click() {
		System.out.println("clicking ios button");
	}

}
