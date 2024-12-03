package FuelEfficiency;

import java.time.LocalDate;

public class Fuel {
    public static double getMPG;
    private LocalDate date;
    private double distanceTraveledMiles;
    private double fuelConsumedGallons;
    private String toString;
    private double milespergallon;

    public Fuel(LocalDate date, double distanceTraveledMiles, double cons) {
        this.date = date;
        this.distanceTraveledMiles = distanceTraveledMiles;
        this.fuelConsumedGallons = getFuelConsumedGallons();
        this.milespergallon = distanceTraveledMiles/fuelConsumedGallons;
    }

    public double getmilespergallon() {
        return milespergallon;
    }

    public double getDistanceTraveledMiles() {
        return distanceTraveledMiles;
    }
    public double getFuelConsumedGallons() {
        return fuelConsumedGallons;
    }
    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return date + "\t" + distanceTraveledMiles + "\t" + fuelConsumedGallons + "\n";
    }

}
