package JavaTraining.Creational.FactoryMethod;

public class SuvFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Suv();
    }
}
