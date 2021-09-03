package Garage_Exercise;

public class Runner {
	
	public static void main(String[] args){
	
	// Create Garage
	Garage garage = new Garage();
	
	// create new cars
	Vehicle vehicle1 = new Vehicle("Corolla", "Toyota", 2010, "white", 0);
	Car car = new Car ("Civic", "Honda", 2015, "black", 1, 5, 4, "Sedan");
	Bike bike = new Bike ("Tenere700", "Yamaha", 2019, "red and black", 2, 3, "Adventure Range");
	Truck truck = new Truck ("BigFoot 4x4", "Ford", 2021, "blue", 3, 0, "Monster Truck");
	
	//adding cars to garage
	garage.addToGarage(vehicle1);
	garage.addToGarage(car);
	garage.addToGarage(bike);
	garage.addToGarage(truck);
	
	// remove vehicle from garage
	garage.removeFromGarage (2);

	// find the price to fix
	garage.calc_bill(car);
	
	//list all vehicles
	garage.list_vehicle();
	
	// Clearing all vehicles in the garage
	garage.clear_vehicles();
	}
}
