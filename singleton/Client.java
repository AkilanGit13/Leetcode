package designpatterns.singleton;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService es = Executors.newCachedThreadPool();
		es.execute(()->{
			StudentSingleton ss = StudentSingleton.getInstance();
			System.out.println(ss);
		});
//		StudentSingleton ss = StudentSingleton.getInstance();
		es.execute(()->{
			StudentSingleton ss2 = StudentSingleton.getInstance();
			System.out.println(ss2);
		});
		es.execute(()->{
			StudentSingleton ss2 = StudentSingleton.getInstance();
			System.out.println(ss2);
		});
		es.execute(()->{
			StudentSingleton ss2 = StudentSingleton.getInstance();
			System.out.println(ss2);
		});
//		System.out.println("DEBUG");
		StudentSingleton ss3 = StudentSingleton.getInstance();
		System.out.println(ss3);
//		System.out.println("DEBUG");
		es.shutdown();
	}

}
