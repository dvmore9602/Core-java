
public class Car {
	

	    int carId = 101;
	    String carName = "Swift";
	    String brand = "Maruti";
	    String model = "VXI";
	    int manufacturingYear = 2024;
	    double price = 850000.50;
	    float mileage = 22.5f;
	    char fuelType = 'P';
	    boolean automatic = false;
	    int seatingCapacity = 5;
	    String color = "White";
	    long registrationNumber = 1234567890L;
	    short warranty = 36;
	    byte airbags = 2;
	    String ownerName = "Dnyaneshwari";

	    public static void main(String[] args) {

	        Car c = new Car();

	        System.out.println("Car ID: " + c.carId);
	        System.out.println("Car Name: " + c.carName);
	        System.out.println("Brand: " + c.brand);
	        System.out.println("Model: " + c.model);
	        System.out.println("Manufacturing Year: " + c.manufacturingYear);
	        System.out.println("Price: " + c.price);
	        System.out.println("Mileage: " + c.mileage);
	        System.out.println("Fuel Type: " + c.fuelType);
	        System.out.println("Automatic: " + c.automatic);
	        System.out.println("Seating Capacity: " + c.seatingCapacity);
	        System.out.println("Color: " + c.color);
	        System.out.println("Registration Number: " + c.registrationNumber);
	        System.out.println("Warranty: " + c.warranty);
	        System.out.println("Airbags: " + c.airbags);
	        System.out.println("Owner: " + c.ownerName);
	    }
	}


