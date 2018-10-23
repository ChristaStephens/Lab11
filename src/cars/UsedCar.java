package cars;

public class UsedCar extends Car {
	protected double mileage;
	
	public UsedCar() {}
	//these are the arguments( there are five total)
	public UsedCar(String make, String model, int year, double price, double mileage) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return String.format("UsedCar [ mileage=" + mileage + ", make=" + make + ", model=" + model + ", year=" + year + ", price="
				+ price + "]");
		//use %s for space and %d for digits
	}
	}



