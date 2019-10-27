public class ParkingLot {
    private final ParkingSpace parkingSpaces[];
    private final int capacity;
    private int carCount;
    public ParkingLot(){
        this.capacity = 500;
        parkingSpaces = new ParkingSpace[this.capacity];
    }
    public ParkingLot(int capacity){
        this.capacity = capacity;
        parkingSpaces = new ParkingSpace[this.capacity];
        this.carCount = 0;
        for(int i = 0; i < capacity; i++){
            parkingSpaces[i] = new ParkingSpace();
        }
    }

    public void parkVehicle(Vehicle vehicle){
        for(int i = 0; i < capacity; i++){
            if(parkingSpaces[i].isAvailable()){
                parkingSpaces[i].addVehicle(vehicle);
                carCount++;
                break;
            }
        }
    }
    public double removeVehicle(String license){
        for(int i = 0; i < capacity; i++){
            if(parkingSpaces[i].getVehicle().getLicencePlateNumber() == license){
                parkingSpaces[i].removeVehicle(parkingSpaces[i].getVehicle());
            }
            return parkingSpaces[i].getVehicle().getTicket().calculateCost();
        }
        return 0;
    }

    public boolean isFull(){
        if(carCount < 500){return false;}
        else{return true;}
    }
    public ParkingSpace[] getParkingSpace(){return parkingSpaces;}

}
