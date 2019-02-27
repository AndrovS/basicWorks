import java.util.Scanner;

public class DanceHall2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double L = Double.parseDouble(scanner.nextLine());
        double W = Double.parseDouble(scanner.nextLine());
        double A = Double.parseDouble(scanner.nextLine());

        double hallArea = (L * 100) * (W * 100);
        double warSide = ((A * 100) * (A*100));
        double peika = hallArea /10;

        double freeArea = hallArea - warSide - peika;

        double dancers = freeArea / (40 + 7000);

        System.out.printf("%.0f", Math.floor(dancers));
    }

}
