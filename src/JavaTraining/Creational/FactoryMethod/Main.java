package JavaTraining.Creational.FactoryMethod;

public class Main {

    public static void main(String[] args) {

        VehicleFactory bikeFactory = new BikeFactory();
        VehicleFactory suvFactory = new SuvFactory();

        Client bikeClient = new Client(bikeFactory);
        Vehicle bike = bikeClient.getVehicle();
        bike.printVehicle();

        Client suvClient = new Client(suvFactory);
        Vehicle suv = suvClient.getVehicle();
        suv.printVehicle();

    }
}
