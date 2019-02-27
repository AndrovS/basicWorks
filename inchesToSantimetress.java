import java.util.Scanner;

public class inchesToSantimetress {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double inches = Double.parseDouble(scanner.nextLine());

        double santimetres = inches * 2.54;

        System.out.printf("%.2f",santimetres);
    }
}
