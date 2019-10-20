import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        int size;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of your parking lot: ");
        size = in.nextInt();

        ParkingLot myLot = new ParkingLot(size);
        String licenseNum = "";
        while(licenseNum != "000000"){
            System.out.println("Enter vehicle license palte: ");
            licenseNum = in.next();
            int inOut;
            System.out.println("Are you parking(1) or removing a car(2)?: ");
            in.nextInt();
        }

    }
}
