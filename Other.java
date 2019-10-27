public class Other extends Vehicle {
    public Other(){
        super(vehicleType.other);
    }
    public Other(String license){
        super(vehicleType.other,license);
    }
}