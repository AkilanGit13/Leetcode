package designpatterns.prototype;

public class Phone implements Prototype<Phone>{
	int imei;
	String model;
	String brand;
	String madeIn;
	int ram;
	String phoneType;
	
	Phone(){}
	
	Phone(Phone other){
		this.imei = other.imei;
		this.brand = other.brand;
		this.madeIn = other.madeIn;
		this.model = other.model;
		this.phoneType = other.phoneType;
		this.ram = other.ram;
	}

	@Override
	public String toString() {
		return "Phone [imei=" + imei + ", model=" + model + ", brand=" + brand + ", madeIn=" + madeIn + ", ram=" + ram
				+ ", phoneType=" + phoneType + "]";
	}

	@Override
	public Phone copy() {
		Phone ph = new Phone(this);
		
		return ph;
	}
	
	
}
