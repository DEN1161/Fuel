public class Fuel {
    public static void main(String[] args) {
        int conditionalDistance = 100;
        double fuelConsumption = 9.5;
        int currentFuelVolume = 45;

        int distance = (int) (currentFuelVolume / fuelConsumption * conditionalDistance);
        System.out.println(distance + "km");
    }
}