package cars;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarLotApp {
	
	//making a static variable(arrayList) outside main means it can
	//be shared by all the methods
	
	private static List<Car> cars = new ArrayList <>();
	public static void main(String[] args) {
		// list that holds both types of cars
		// if they type list, we will print out list
		// if they hit remove then we will remove
		//hold cars and used cars
		Scanner scnr = new Scanner(System.in);
	
		cars.add(new Car ("Nikolai", "Model S", 2017, 54999.90 ));
		cars.add(new UsedCar("Fourd", "Escapade", 2017, 31999.90, 88888 ));
		cars.add(new Car ("Chewie", "Vette", 2017, 44989.95 ));
		cars.add(new UsedCar("Hyonda", "Chirpus", 2017, 54999.90, 88887 ));
		
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

	
}
