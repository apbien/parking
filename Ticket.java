public class Ticket {
    private final long startTime = System.currentTimeMillis();
    private final Vehicle vehicle;
    private ticketStatus status;

    public enum ticketStatus{
        active,paid,lost
    }

    public Ticket(Vehicle vehicle){
        super();
        this.vehicle = vehicle;
    }
    public double parkingDuration(){
        return System.currentTimeMillis()-startTime;
    }
    public double calculateCost(){
        return (parkingDuration()*vehicle.getTypeCost()*.0001);
    }
}
