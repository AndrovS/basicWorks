import java.util.Scanner;

public class operationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N1 = Integer.parseInt(scanner.nextLine());
        int N2 = Integer.parseInt(scanner.nextLine());
        char operation = scanner.nextLine().charAt(0);

        switch (operation) {
            case '+':
                int sum = N1 + N2;
                if (sum % 2 == 0) {
                    System.out.printf("%d + %d = %s - even", N1, N2, sum);
                } else {
                    System.out.printf("%d + %d = %s - odd", N1, N2, sum);
                }
                break;

            case '-':
                int diff = N1 - N2;
                if (diff % 2 == 0) {
                    System.out.printf("%d - %d = %d - even", N1, N2, diff);
                } else {
                    System.out.printf("%d - %d = %d - odd", N1, N2, diff);
                }
                break;

            case '*':
                int product = N1 * N2;
                if (product % 2 == 0) {
                    System.out.printf("%d * %d = %d - even", N1, N2, product);
                } else {
                    System.out.printf("%d * %d = %d - odd", N1, N2, product);
                }
                break;

            case '/':
                if (N2 == 0) {
                    System.out.printf("Cannot divide %d by zero", N1);
                } else {
                    double division = N1 * 1.0 / N2;
                    System.out.printf("%d / %d = %.2f", N1, N2, division);
                }
                break;

            case '%':
                if (N2 == 0) {
                    System.out.printf("Cannot divide %d by zero", N1);
                } else {
                    int residue = N1 % N2;
                    System.out.printf("%d %% %d = %d", N1, N2, residue);
                }
                break;
        }

    }
}
