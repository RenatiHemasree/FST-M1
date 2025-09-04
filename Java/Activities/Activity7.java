package activities;

interface BicycleParts {
    int tyres = 2;
    int maxSpeed = 50;
}

interface BicycleOperations {
    void applyBrake(int decrement);
    void speedUp(int increment);
}

class Bicycle implements BicycleParts, BicycleOperations {
    protected int gears;
    protected int currentSpeed;

    public Bicycle(int gears, int currentSpeed) {
        this.gears = gears;
        this.currentSpeed = currentSpeed;
    }

    public void applyBrake(int decrement) {
        currentSpeed -= decrement;
        if (currentSpeed < 0) {
            currentSpeed = 0;
        }
        System.out.println("Applied brake, current speed: " + currentSpeed);
    }

    public void speedUp(int increment) {
        currentSpeed += increment;
        if (currentSpeed > maxSpeed) {
            currentSpeed = maxSpeed;
        }
        System.out.println("Sped up, current speed: " + currentSpeed);
    }

    public String bicycleDesc() {
        return "No of gears are " + gears + "\nSpeed of bicycle is " + currentSpeed + "\nMax speed is " + maxSpeed;
    }
}

class MountainBike extends Bicycle {
    private int seatHeight;

    public MountainBike(int gears, int currentSpeed, int seatHeight) {
        super(gears, currentSpeed);
        this.seatHeight = seatHeight;
    }

    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    @Override
    public String bicycleDesc() {
        return super.bicycleDesc() + "\nSeat height is " + seatHeight;
    }
}

public class Activity7 {
    public static void main(String[] args) {
        MountainBike mb = new MountainBike(5, 10, 25);

        System.out.println(mb.bicycleDesc());

        mb.speedUp(15);
        mb.applyBrake(5);

        mb.setHeight(30);
        System.out.println("After adjusting seat height:");
        System.out.println(mb.bicycleDesc());
    }
}

