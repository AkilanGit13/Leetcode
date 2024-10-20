package designpatterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry<T> {
	Map<String, T> registry = new HashMap<>();
	
	T register(String key, T value) {
		return registry.put(key, value);
	}
	
	T get(String key) {
		return registry.get(key);
	}
	
}
