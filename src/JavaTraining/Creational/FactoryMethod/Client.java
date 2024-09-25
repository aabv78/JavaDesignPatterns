package JavaTraining.Creational.FactoryMethod;

public class Client {
    private Vehicle vehicle;

    public Client(VehicleFactory vehicleFactory) {
        vehicle = vehicleFactory.createVehicle();
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
