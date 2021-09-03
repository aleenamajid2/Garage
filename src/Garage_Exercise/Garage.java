package Garage_Exercise;

import java.util.ArrayList;

public class Garage {
	
	//Using an Array list implementation store all of the vehicles in a garage class
	
	ArrayList<Vehicle> vehicle = new ArrayList <>();
	
	// Adding a vehicle to the garage
		public void addToGarage(Vehicle mv) {
		vehicle.add(mv);
		System.out.println(mv.getVehicle_name() + " has been added to the garage :) ");
		}
	// Removing a vehicle from the garage (By ID, type etc)
		public void removeFromGarage(int id) {
			for ( Vehicle mv: vehicle)
			{
				if (id == mv.getID()) {
				vehicle.remove(mv);
				System.out.println(mv.getVehicle_name()+ " with the ID"+mv.getID()+ " has been removed from the garage");}
			}
		}
		
	// Fixing a vehicle (Running calculate bill and printing the cost)
		public void calc_bill (Vehicle mv)
		{
			System.out.println("The cost for repairing " +mv.getVehicle_name() + " is " +mv.bill_method());
		}
		
	// Listing all vehicles in the garage
		public void list_vehicle () {
		for (Vehicle mv : vehicle) {
			System.out.println(mv.getVehicle_name() + " is in the garage");
		}
		}
	// Clearing all vehicles in the garage
		public void clear_vehicles () {
			vehicle.clear();
			System.out.println(vehicle);
				System.out.println("Garage is empty");
			}
}
