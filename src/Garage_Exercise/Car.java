package Garage_Exercise;

public class Car extends Vehicle{
	
	// At least 2 more variables specific to the vehicle
	
	private int seat_number;
	private int door_number;
	private String car_type;

	// - Constructor
	public Car(String vehicle_name, String company_name, int model_year, String colour, int iD, int seat_number, int door_number, String car_type) {
		super(vehicle_name,company_name,model_year, colour, iD);
		this.seat_number = seat_number;
		this.door_number = door_number;
		this.car_type = car_type;
	}
	
	// Getters and setters
	public int getSeat_number() {
		return seat_number;
	}

	public void setSeat_number(int seat_number) {
		this.seat_number = seat_number;
	}

	public int getDoor_number() {
		return door_number;
	}

	public void setDoor_number(int door_number) {
		this.door_number = door_number;
	}

	public String getCar_type() {
		return car_type;
	}

	public void setCar_type(String car_type) {
		this.car_type = car_type;
	}
	
	// Overridden Calculate Bill method, each vehicle type should have a specific way of calculating a bill 
	//(£50 + for each wheel, times 2 for bad condition etc) and should return a float for the cost of the repair
	
	public float bill_car(){
		int totalBill = 0;
		String condition = "GC";
		int noOfWheels = 4;
		

		totalBill += (noOfWheels*50);
		
		if (condition == "GC") 
		{
			totalBill = totalBill * 2;
		}
		if (condition == "BC") 
		{
			totalBill = totalBill * 5;
		}

        return totalBill;
	}
}
