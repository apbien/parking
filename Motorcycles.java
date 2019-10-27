public class Motorcycles extends Vehicle{
    public Motorcycles(){
        super(vehicleType.motorcycles);
    }
    public Motorcycles(String license){
        super(vehicleType.motorcycles,license);
    }
}
