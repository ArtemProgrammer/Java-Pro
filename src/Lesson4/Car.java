package Lesson4;
public class Car {
    private final double volumeOfTheTank;
    private double restInTheTank;
    private final double fuelConsumption;

    public Car(double volumeOfTheTank, double restInTheTank, double fuelConsumption) {
        this.volumeOfTheTank = volumeOfTheTank;
        this.restInTheTank = restInTheTank;
        this.fuelConsumption = fuelConsumption;
    }

    public void fillInTank(double costFuel) {
        double numberOfLiters = volumeOfTheTank - restInTheTank;
        double fuelPrice = numberOfLiters * costFuel;
        restInTheTank += numberOfLiters;
        System.out.println("Залили " + numberOfLiters + " литров, на сумму:" + fuelPrice + " грн.");
    }

    public double remainingFuel(double numberOfKilometers) {
        double consumptionPerKm = fuelConsumption / 100;
        double costCalculation = numberOfKilometers * consumptionPerKm;
        restInTheTank -= costCalculation;
        System.out.println("После " + numberOfKilometers + " км" + " осталось " + restInTheTank + " литров.");
        return restInTheTank;
    }

    public double determineRefueling() {
        double difference = volumeOfTheTank - restInTheTank;
        if (difference < volumeOfTheTank) {
            System.out.println("Нужно дозалить " + difference);
        }
        else {
            System.out.println("Нужно дозалить " + volumeOfTheTank);
        }
        return difference;
    }

    public double getVolumeOfTheTank() {
        return volumeOfTheTank;
    }

    public double getRestInTheTank() {
        return restInTheTank;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }
}

