package Garage_Exercise;

public class Bike extends Vehicle {
	
	// At least 2 more variables specific to the vehicle
	
	private int chain_rings;
	private String bike_type;

	// - Constructor
	public Bike(String vehicle_name, String company_name, int model_year, String colour, int iD, int chain_rings, String bike_type) {
		super(vehicle_name,company_name,model_year, colour, iD);
		this.chain_rings = chain_rings;
		this.bike_type = bike_type;
	}
	
	// Getters and setters
	public int getChain_rings() {
		return chain_rings;
	}

	public void setChain_rings(int chain_rings) {
		this.chain_rings = chain_rings;
	}

	public String getBike_type() {
		return bike_type;
	}

	public void setBike_type(String bike_type) {
		this.bike_type = bike_type;
	}

	
	// Overridden Calculate Bill method, each vehicle type should have a specific way of calculating a bill 
	//(£50 + for each wheel, times 2 for bad condition etc) and should return a float for the cost of the repair
	
	public float bill_bike(){
		int totalBill = 0;
		String condition = "GC";
		int noOfWheels = 2;
		
		totalBill += (noOfWheels*35);
		
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
