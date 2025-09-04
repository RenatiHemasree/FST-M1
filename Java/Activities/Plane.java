package activities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Plane {
    private final int maxPassengers;
    private final List<String> passengers;
    private LocalDateTime lastTimeLanded;

    public Plane(int maxPassengers) {
        this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();
    }

    public void onboard(String passenger) {
        if (passengers.size() >= maxPassengers) {
            throw new IllegalStateException("Plane is full");
        }
        passengers.add(passenger);
    }

    public LocalDateTime takeOff() {
        return LocalDateTime.now();
    }

    public void land() {
        this.lastTimeLanded = LocalDateTime.now();
        passengers.clear();
    }

    public LocalDateTime getLastTimeLanded() {
        return lastTimeLanded;
    }

    public List<String> getPassengers() {
        return new ArrayList<>(passengers);
    }
}