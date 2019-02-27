import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        System.out.printf("%.3f", (a*b*h*(1-percent * 0.01)/1000));



    }
}
