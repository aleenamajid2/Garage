package Garage_Exercise;

public class Truck extends Vehicle{
	
	// At least 2 more variables specific to the vehicle
	
		private int tyres;
		private String truck_type;

		// - Constructor
		
		public Truck(String vehicle_name, String company_name, int model_year, String colour, int iD, int tyres, String truck_type) {
			super(vehicle_name,company_name,model_year, colour, iD);
			this.tyres = tyres;
			this.truck_type = truck_type;
		}
		
		// Getters and setters
		
		public int getTyres() {
			return tyres;
		}

		public void setTyres(int tyres) {
			this.tyres = tyres;
		}

		public String getTruck_type() {
			return truck_type;
		}

		public void setTruck_type(String truck_type) {
			this.truck_type = truck_type;
		}
		
		// Overridden Calculate Bill method, each vehicle type should have a specific way of calculating a bill 
		//(£50 + for each wheel, times 2 for bad condition etc) and should return a float for the cost of the repair
		
		public float bill_truck(){
			int totalBill = 0;
			String condition = "GC";
			int noOfWheels = 8;
			
			totalBill += (noOfWheels*100);
			
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
