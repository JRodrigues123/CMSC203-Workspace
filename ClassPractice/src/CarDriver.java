import java.util.ArrayList;
import java.util.Scanner;
public class CarDriver {

	public static void main(String[] args) {
		
		Car c1 = new Car("Jaguar", "2018");
		Car c2 = new Car("Honda Civic", "2020");
		
		ArrayList<Car> cars = new ArrayList<Car>();
		
		cars.add(c1);
		cars.add(c2);
		
		System.out.println(cars.get(0).getName() + " and " + cars.get(1).getName());
		
		
	
		
		
		
	}

}
