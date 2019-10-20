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
    public void removeVehicle(Vehicle vehicle){
        for(int i = 0; i < capacity; i++){
            if(parkingSpaces[i].getVehicle() == vehicle){
                parkingSpaces[i].removeVehicle(vehicle);
            }

        }
    }

    public boolean isFull(){
        if(carCount < 500){return false;}
        else{return true;}
    }

}
