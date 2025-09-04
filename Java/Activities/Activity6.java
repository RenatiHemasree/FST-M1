package activities;

import java.time.LocalDateTime;

public class Activity6 {
    public static void main(String[] args) {
        Plane plane = new Plane(10);

        plane.onboard("Hema");
        plane.onboard("Sree");
        plane.onboard("Renati");
        plane.onboard("Reddi");

        LocalDateTime takeOffTime = plane.takeOff();
        System.out.println("Plane took off at: " + takeOffTime);
        System.out.println("Passengers onboard: " + plane.getPassengers());

        try {
            System.out.println("Plane is in flight...");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        plane.land();
        System.out.println("Plane landed at: " + plane.getLastTimeLanded());
        System.out.println("Passengers after landing: " + plane.getPassengers());
    }
}
