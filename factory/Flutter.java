package designpatterns.factory;

public class Flutter {
	void refresh() {
		System.out.println("refresh screen");
	}
	void setTheme() {
		System.out.println("setting theme");
	}
	// following are factory methods. so separating factory methods and non factory methods
//	Button createButton();
//	Menu createMenu();
	
	UIFactory getUIFactory(Platform platform) {
//		switch(platform) {
//			case ANDROID: return new AndroidUIFactory();
//			case IOS: return new IOSUIFactory();
//		}
//		return null;
		return UIFactoryFactory.getUIFactory(platform);
	}
}
