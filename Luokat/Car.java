

public class Car {
    private static int carCount = 0;
    private static double totalFuelCost=0;
    public static double fuelPrice = 1.345;

    private double fuelPer100;
    private double distance = 0;

    public Car(double consumption){
        this.fuelPer100 = consumption;
        carCount++;
    }

    public void driveDistance(double distance){

        totalFuelCost += distance * this.fuelPer100/100 * fuelPrice;
        this.distance += distance;
    }

    
}
