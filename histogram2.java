import java.util.Scanner;

public class histogram2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number < 200) {
                p1++;

            } else if (number >= 200 && number < 400) {
                p2++;

            } else if (number >= 400 && number < 600) {
                p3++;

            } else if (number >= 600 && number < 800) {
                p4++;

            } else if (number >= 800) {
                p5++;

            }
        }
        p1 = (p1 * 1.0 / n) * 100;
        p2 = (p2 * 1.0 / n) * 100;
        p3 = (p3 * 1.0 / n) * 100;
        p4 = (p4 * 1.0 / n) * 100;
        p5 = (p5 * 1.0 / n) * 100;

        System.out.printf("%.2f%%%n", p1);
        System.out.printf("%.2f%%%n", p2);
        System.out.printf("%.2f%%%n", p3);
        System.out.printf("%.2f%%%n", p4);
        System.out.printf("%.2f%%", p5);
    }
}
