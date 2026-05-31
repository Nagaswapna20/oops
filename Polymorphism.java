import java.util.Scanner;
class RideBooking {
    int Uber;
    int Auto;
    int Bike;
    void bookRide(int uberFare) {
        Uber=uberFare;
        System.out.println("Uber Fare : Rs." + Uber);
    }
    void bookRide(int autoFare, String ride) {
        Auto=autoFare;
        System.out.println("Auto Fare : Rs." + Auto);
    }
    void bookRide(int bikeFare, String ride, int x) {
        Bike=bikeFare;
        System.out.println("Bike Fare : Rs." + Bike);
    }
    void checkFare() {
        if(Bike < Auto && Bike < Uber) {
            System.out.println("Bike fare is less. Person books Bike.");
        } else if(Auto < Uber && Auto < Bike) {
            System.out.println("Auto fare is less. Person books Auto.");
        } else{
            System.out.println("Uber fare is less. Person books Uber.");
        }
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        RideBooking r=new RideBooking();
        System.out.print("Enter Uber Fare: ");
        int uber=sc.nextInt();
        System.out.print("Enter Auto Fare: ");
        int auto=sc.nextInt();
        System.out.print("Enter Bike Fare: ");
        int bike=sc.nextInt();
        r.bookRide(uber);
        r.bookRide(auto, "Auto");
        r.bookRide(bike, "Bike", 1);
        r.checkFare();
    }
}