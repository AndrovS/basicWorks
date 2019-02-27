import java.util.Scanner;

public class TrapezoidArea {
    public static void main(String[] args) {
        //(b1 + b2) * h / 2

        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        System.out.printf("%.2f", (a + b) * h / 2);

    }
}
