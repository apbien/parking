import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        int size;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of your parking lot: ");
        size = in.nextInt();

        ParkingLot myLot = new ParkingLot(size);
        String licenseNum = "";
        double total = 0;
        while(licenseNum != "000000"){
            System.out.println("Enter vehicle license plate number: ");
            licenseNum = in.next();
            if(licenseNum.equals("000000")){break;}
            int inOut;
            System.out.println("Are you parking(1) or removing a car(2)?: ");
            inOut = in.nextInt();


            if(inOut == 1) {
                System.out.println("What is your vehicle type? (Car = 1, Electric = 2, Truck = 3, Motorcycle = 4, other = 5");
                int typeChoice = in.nextInt();
                Vehicle newVehicle;
                if(typeChoice == 1){newVehicle = new Car(licenseNum);}
                else if(typeChoice == 2){newVehicle = new Electric(licenseNum);}
                else if(typeChoice == 3){newVehicle = new Truck(licenseNum);}
                else if(typeChoice == 4){newVehicle = new Motorcycles(licenseNum);}
                else{newVehicle = new Other(licenseNum);}
                Ticket newTicket = new Ticket(newVehicle);
                newVehicle.setTicket(newTicket);
                myLot.parkVehicle(newVehicle);
            }else if (inOut == 2){
                total += myLot.removeVehicle(licenseNum);
            }
        }

        System.out.println("Your current total made is: " + total);

    }
}
