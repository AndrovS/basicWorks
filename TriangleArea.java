
import java.text.DecimalFormat;
import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {

        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double area = a * h / 2;

        System.out.println(decimalFormat.format((double)Math.round(area * 100d)/100d));

    }
}

