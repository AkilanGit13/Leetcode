package designpatterns.singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class StudentSingleton {
	private String name;
	private int age;
	private String email;

	private static StudentSingleton instance;
	private static Lock lock = new ReentrantLock();
	
	// private so client cant create multiple instances
	private StudentSingleton() {
		//do initialization
		name = "akil";
		age = 28;
		email = "akilblahblah@gmail.com";
	}
	
	public static StudentSingleton getInstance() {
		if(instance == null) {
			lock.lock();
			if(instance == null) {
				instance = new StudentSingleton();
			}
			lock.unlock();
		}
		return instance;
	}

	
	
}
