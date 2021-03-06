import java.util.Scanner;

public class maxVaueAndMinValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;
        String input = scanner.nextLine();

        while (!"END".equals(input)) {
            int currentNumber = Integer.parseInt(input);

            if (currentNumber > maxNumber) {
                maxNumber = currentNumber;
            }
            if (currentNumber < minNumber) {
                minNumber = currentNumber;
            }
            input = scanner.nextLine();
        }

        System.out.printf("Max number: %d%n Min number: %d", maxNumber, minNumber);
    }
}
