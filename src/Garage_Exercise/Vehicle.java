package Garage_Exercise;

public class Vehicle {
	
	//- At least 3 variables (with differing data types) String, int
	
	private String vehicle_name;
	private String company_name;
	private int model_year;
	private String colour;

	
	//- + 1 ID variable
	
	private int ID;

	// - Constructor
	
	public Vehicle(String vehicle_name, String company_name, int model_year, String colour, int iD) {
		super();
		this.vehicle_name = vehicle_name;
		this.company_name = company_name;
		this.model_year = model_year;
		this.colour = colour;
		ID = iD;
	}
	// Getters and setters

	public String getVehicle_name() {
		return vehicle_name;
	}

	public void setVehicle_name(String vehicle_name) {
		this.vehicle_name = vehicle_name;
	}


	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public int getModel_year() {
		return model_year;
	}

	public void setModel_year(int model_year) {
		this.model_year = model_year;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}


	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}
	

	//Calculate Bill method(but this will be replaced by the sub vehicle classes)

	public float bill_method(){
		int totalBill = 0;
		String condition = "C";
		int noOfWheels = 4;
		
		// For every wheel on the vehicle multiply by 5 and add to the bill
		totalBill += (noOfWheels*58);
		
		if (condition == "C") 
		{
			totalBill = totalBill * 3;
		}
		//System.out.println("the total bill is"+totalBill);
        return totalBill;
	}	
}
	
	


