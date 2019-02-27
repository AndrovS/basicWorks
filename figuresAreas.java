import java.io.PrintStream;
import java.util.Scanner;

public class figuresAreas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine();

        switch (figure) {
            case "square": {
                double a = Double.parseDouble(scanner.nextLine());
                System.out.printf("%.3f", a * a);
                break;
            }
            case "rectangle": {
                double a = Double.parseDouble(scanner.nextLine());
                double b = Double.parseDouble(scanner.nextLine());
                System.out.printf("%.3f", a * b);
                break;
            }
            case "circle":
                double r = Double.parseDouble(scanner.nextLine());
                PrintStream printf = System.out.printf("%.3f", Math.PI * r * r);
                break;
            case "triangle": {
                double a = Double.parseDouble(scanner.nextLine());
                double ha = Double.parseDouble(scanner.nextLine());
                System.out.printf("%.3f", a * ha / 2);
                break;
            }
        }


    }
}
