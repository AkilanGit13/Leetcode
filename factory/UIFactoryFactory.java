package designpatterns.factory;

public class UIFactoryFactory {

	public static UIFactory getUIFactory(Platform platform) {
		switch (platform) {
		case ANDROID:
			return new AndroidUIFactory();
		case IOS:
			return new IOSUIFactory();
		}
		return null;
	}
}
