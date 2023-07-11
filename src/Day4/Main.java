package Day4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Vehicle opelAstra = new Vehicle(70.5, 300);
        Car opelCorsa = new Car(100.5, 100);
        RaceMotorcycle yamaha = new RaceMotorcycle(110, 200);
        SportCar porsche = new SportCar(120, 500);

        opelAstra.drive(50);
        opelCorsa.drive(40);
        yamaha.drive(30);
        porsche.drive(80);
    }
}
