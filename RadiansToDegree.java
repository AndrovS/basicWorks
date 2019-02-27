import java.util.Scanner;

public class RadiansToDegree {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double Radians = Double.parseDouble(scanner.nextLine());

        double Degrees = Radians *  180 / Math.PI;

        System.out.printf("%.0f", Degrees);

    }
}
