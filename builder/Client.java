package designpatterns.builder;

public class Client {

	public static void main(String[] args) {
//		Student student = new Student.Builder()
//						.setAge(23)
//						.setEmail("abc@gmail.com")
//						.setName("akil")
//						.build();
		Student student = Student.getBuilder()
						.setAge(23)
						.setEmail("abc@gmail.com")
						.setName("akil")
						.build();
		
		System.out.println(student);
	}

}
