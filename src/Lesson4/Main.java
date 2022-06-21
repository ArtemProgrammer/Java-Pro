public class Main {
    public static void main(String[] args) {
        Car car = new Car(75, 75, 7);
        System.out.println("Машина имеет объем бака: " + car.getVolumeOfTheTank() + " литров, в котором залито " +
                                                        car.getRestInTheTank() + " литров топлива" + " и с расходом " +
                                                        car.getFuelConsumption() + " литров на 100 км.");
        double[] routeOdessaKiev = {178.5, 152.8, 148.2};
        double track = 0;
        for (int i = 0; i < routeOdessaKiev.length; i++) {
            track += routeOdessaKiev[i];
        }
        double fullCost = 0;
        System.out.println("Маршрут Одесса - Киев имеет общую длинну: " + track + " км.");
        for (int i = 0; i < routeOdessaKiev.length; i++) {
            car.remainingFuel(routeOdessaKiev[i]);
            fullCost += car.determineRefueling();
            car.fillInTank(Double.parseDouble(args[0]));
        }
        System.out.println("Полная поездка обойдется: " + fullCost * Double.parseDouble(args[0]) + " грн.");
    }
}
