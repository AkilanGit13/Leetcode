package designpatterns.factory;

import designpatterns.factory.button.Button;
import designpatterns.factory.menu.Menu;

public class Client {

	public static void main(String[] args) {
		Flutter flutter = new Flutter();
		UIFactory uifactory = flutter.getUIFactory(Platform.IOS);
		Button button = uifactory.createButton();
		Menu menu = uifactory.createMenu();
		
		button.click();
		menu.displayMenu();
	}

}
