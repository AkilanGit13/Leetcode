package designpatterns.factory;

import designpatterns.factory.button.Button;
import designpatterns.factory.menu.Menu;

public interface UIFactory {
	Button createButton();
	Menu createMenu();
}
