public class ParkingLot {
    private final ParkingSpace parkingSpaces[];
    private final int capacity;
    public ParkingLot(){
        this.capacity = 500;
        parkingSpaces = new ParkingSpace[this.capacity];
    }
    public ParkingLot(int capacity){
        this.capacity = capacity;
        parkingSpaces = new ParkingSpace[this.capacity];
        for(int i = 0; i < capacity; i++){
            ParkingSpace[i] = new ParkingSpace();
        }
    }

    public Ticket parkVehicle(Vehicle vehicle){
        for(int i = 0; i < capacity; i++){

        }
    }

}
