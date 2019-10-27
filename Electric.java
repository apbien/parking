public class Electric extends Vehicle {
    public Electric(){
        super(vehicleType.car);
    }
    public Electric(String license){
        super(vehicleType.electric,license);
    }
}