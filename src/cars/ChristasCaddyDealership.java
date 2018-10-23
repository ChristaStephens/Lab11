package cars;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ChristasCaddyDealership {
	private static List<Car> cars = new ArrayList<>();
	public static void main(String[] args) {
		
		//Project Goals:Create Constructors for a Car
		//Use an ArrayList to add a car, remove a car
		//Look up a car in a given position
		//Need at least 6 cars
		
		System.out.println(greet());
		
		Scanner scnr = new Scanner(System.in);
		List<Car> list = new ArrayList<>();
		cars.add(new Car("Toyota","Corolla", 2018, 18000.99));
		cars.add(new Car("Ford","Focus", 2018, 17600.89));
		cars.add(new UsedCar("Dodge", "Ram", 1999, 2000.76, 100678));
		cars.add(new UsedCar ("General Motors", "Cadillac CTS", 2013, 14200.76, 89888));
		cars.add(new UsedCar ("Dodge", "Charger", 2017, 19002.99, 10000));
		cars.add(new Car("Ford", "Escape", 2018, 20000.99));
	
		System.out.println(list);// testing for errors
		
		boolean done = false;
		while (!done) {
			
			System.out.println("Select an option: (list, select, remove, add quit)");
			String option = scnr.nextLine();
			
			switch (option) {
			case "list":
				//creating a method to handle a listing
				doListOption();
				break;
			case "select":
				doSelectOption();
				//creating a method to handle select
				break;
			case "quit":
				done = true;
			default:
				System.out.println("Invalid choice...");
				break;
			}
		}
	}
	private  static void doListOption() {
		//when you're in a static method, you can't call
		//a non static method
		//System.out.println(cars); // testing to see if it works ( it does)
		
		for (int i = 0; i <cars.size();i++) {
			System.out.println((i+1)+ ". " +cars.get(i));
		}
	}
	
	private static void doSelectOption() {
		
	}
	
	private static String greet() {
		
		return "Welcome to Christa's Caddy Dealership! "
				+ "\nPlease view our lovely cars and select what you would like to buy.";
	}
}
