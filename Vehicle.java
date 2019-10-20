public abstract class Vehicle {
    private vehicleType type;
    private String licencePlateNumber;
    private Ticket ticket;

    public enum vehicleType{
        car, truck, motorcycles, electric
    }
    public Vehicle(vehicleType newVehicleType){
        this.type = newVehicleType;
    }
    public Vehicle(vehicleType newVehicleType, String licenceNum){
        this.type =  newVehicleType;
        this.licencePlateNumber = licenceNum;
    }

    public void setTicket(Ticket newTicket){
        this.ticket = newTicket;
    }

    public void setLicensePlateNumber(String newLicenseNum){
        this.licencePlateNumber = newLicenseNum;
    }

    public String getLicencePlateNumber(){
        return this.licencePlateNumber;
    }
    public double getTypeCost(){
        if(this.type == vehicleType.car){return 2.00;}
        else if(this.type == vehicleType.truck){return 2.75;}
        else if(this.type == vehicleType.electric){return 0.50;}
        else if(this.type == vehicleType.motorcycles){return 1.25;}
        else{return 1.00;}
    }
}

