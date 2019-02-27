import java.util.Scanner;

public class divideWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int Div2 = 0;   // divide by 2
        int Div3 = 0;  //divide by 3
        int Div4 = 0; // divide by 4

        double p1 = 0;
        double p2 = 0;
        double p3 = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number % 2 == 0) {
                Div2++;
                p1 = ((Div2 * 1.0) / number) * 100;
            } else if (number % 3 == 0) {
                Div3++;
                p2 = ((Div3 * 1.0) / number) * 100;
            } else if (number % 4 == 0) {
                Div4++;
                p3 = ((Div4 * 1.0) / number) * 100;
            }
        }
        System.out.printf("%.2f%%%n", p1);
        System.out.printf("%.2f%%%n", p2);
        System.out.printf("%.2f%%%", p3);
    }

}



