import java.util.Scanner;

public class DCMotorSpeed {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Input Voltage (V): ");
        double voltage = scanner.nextDouble();
        System.out.print("Enter Back EMF (V): ");
        double backEMF = scanner.nextDouble();
        System.out.print("Enter Motor Constant: ");
        double motorConstant = scanner.nextDouble();

        if (motorConstant <= 0) {
            System.out.println("Motor constant must be greater than zero.");
        } else if (voltage <= backEMF) {
            System.out.println("Input voltage must be greater than back EMF.");
        } else {
            double speed = (voltage - backEMF) / motorConstant;
            System.out.println("Motor Speed = " + speed + " RPM");
        }
        scanner.close();
    }
}
