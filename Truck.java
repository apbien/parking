public class Truck extends Vehicle {
    public Truck(){
        super(vehicleType.truck);
    }
    public Truck(String license){
        super(vehicleType.truck,license);
    }
}