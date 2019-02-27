import java.util.Scanner;

public class fishingBoat2123 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budgete = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int countFishers = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (season) {
            case "Spring":
                price = 3000;
                break;
            case "Summer":
                price = 4200;
                break;
            case "Autumn":
                price = 4200;
                break;
            case "Winter":
                price = 2600;
                break;

        }
        if (countFishers <= 6) {
            price *= 0.9;
        } else if (countFishers <= 11) {
            price *= 0.85;
        } else {
            price *= 0.75;
        }

        if (countFishers % 2 == 0) {
            if (!season.equals("Autumn")) {
                price *= 0.95;

            } else {
                price = price;
            }
            double restMoney = budgete - price;
            double needMoney = price - budgete;

            if (budgete >= price) {
                System.out.printf("Yes! You have %.2f leva left.", restMoney);
            } else {
                System.out.printf("Not enough money! You need %.2f leva.", needMoney);
            }
        }
    }
}