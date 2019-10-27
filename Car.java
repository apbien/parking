public class Car extends Vehicle {
    public Car(){
        super(vehicleType.car);
    }
    public Car(String license){
        super(vehicleType.car,license);
    }
}