package designpatterns.builder;
// create object only after validation
public class Student {
	private String name;
	private int age;
	private String email;
	// and lot of attributes
	// constructor is not created coz constructor explosion due to optional parameters 
	// and different combinations 2^n
	
	private Student(Builder builder){
		this.name = builder.name;
		this.age = builder.age;
		this.email = builder.email; 
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public static Builder getBuilder() {
		return new Builder();
	}
	// static coz inner class cant be accessed from client w/o instance object if the class is not static 
	public static class Builder {
		// Map has disadvantage of typecast and runtime exception
		// so create a data structure with same attributes as Student
		private String name;
		private int age;
		private String email;
		//and lot of attributes
		// no need for getters
		
		public Builder setName(String name) {
			this.name = name;
			return this;
		}
		
		public Builder setAge(int age) {
			this.age = age;
			return this;
		}
		
		public Builder setEmail(String email) {
			this.email = email;
			return this;
		}
		
		public Student build(){
			// after validations
			// if invalid, throws exception. so student obj is not created
			return new Student(this);
		}
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", email=" + email + "]";
	}
	
	
}
