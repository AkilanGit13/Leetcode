package designpatterns.prototype;

public class Phone6G extends Phone implements Prototype<Phone>{
	boolean isSixG;
	
	public Phone6G() {
	}
	
	public Phone6G(Phone6G other) {
		super(other);
		this.isSixG = other.isSixG;
	}
	
	@Override
	public Phone copy() {
		Phone ph = new Phone6G(this);
		return ph;
	}

	@Override
	public String toString() {
		return "Phone6G [imei=" + imei + ", model=" + model + ", brand=" + brand + ", madeIn=" + madeIn + ", ram=" + ram
				+ ", phoneType=" + phoneType + ", isSixG=" + isSixG + "]";
	}
}
