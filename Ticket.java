public class Ticket {
    private CostCalculator calculator;
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
    public long parkingDuration(){
        return System.currentTimeMillis()-startTime;
    }
    public double calculateCost(){
        return calculator.getCost(parkingDuration(), vehicle.getTypeCost());
    }
}
