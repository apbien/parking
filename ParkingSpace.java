public class ParkingSpace {
    private boolean available;
    private static int spaceCounter = 0;
    private final int spaceID = ++spaceCounter;
    private Vehicle vehicle;
    public ParkingSpace(){
        available = true;
    }
    public boolean isAvailable(){
        return available;
    }
    public void addVehicle(Vehicle theVehicle){
        if(isAvailable()){
            available = false;
            System.out.println("Car with the license plate of " + theVehicle.getLicencePlateNumber() + " has parked in spot " + spaceID +".");
            this.vehicle = theVehicle;
        }else{
            System.out.println("Sorry, parking spot " + spaceID + " is occupied by a car with the license plate " + this.vehicle.getLicencePlateNumber());
        }
    }

    public void removeVehicle(Vehicle theVehicle){
        if(!available){
            System.out.println("Car with the license plate of " + theVehicle.getLicencePlateNumber() + " has left spot " + spaceID +".");
            available = true;
        }
        else{
            System.out.println("This parking spot with the ID of " + spaceID + " is already available.");
        }
    }
    public Vehicle getVehicle(){
        return this.vehicle;
    }
}
