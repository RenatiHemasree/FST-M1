package activities;

public class Activity1 {
	public static void main(String[] args) {
        Car myCar = new Car();
        myCar.color = "White";
        myCar.transmission = "Automatic";
        myCar.make = 2025;
        myCar.displayCharacteristics();
        myCar.accelerate();
        myCar.brake();
    }
}
