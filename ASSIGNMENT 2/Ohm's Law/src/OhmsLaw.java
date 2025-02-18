import java.util.Scanner;

public class OhmsLaw  {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the unknown parameter (V, I, R): ");
        char unknown = scanner.next().charAt(0);
        double V, I, R;
        switch (unknown) {
            case 'V':
                System.out.print("Enter Current (A): ");
                I = scanner.nextDouble();
                System.out.print("Enter Resistance (Ω): ");
                R = scanner.nextDouble();
                V = I * R;
                System.out.println("Voltage = " + V + " V");
                break;
            case 'I':
                System.out.print("Enter Voltage (V): ");
                V = scanner.nextDouble();
                System.out.print("Enter Resistance (Ω): ");
                R = scanner.nextDouble();
                I = V / R;
                System.out.println("Current = " + I + " A");
                break;
            case 'R':
                System.out.print("Enter Voltage (V): ");
                V = scanner.nextDouble();
                System.out.print("Enter Current (A): ");
                I = scanner.nextDouble();
                R = V / I;
                System.out.println("Resistance = " + R + " Ω");
                break;
            default:
                System.out.println("Invalid parameter");
        }
        scanner.close();
    }
}
