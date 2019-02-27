import java.util.Scanner;

public class tradeComissions2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double s = Double.parseDouble(scanner.nextLine());//Обем на продажбите

        double comissions = 0;

        boolean isValidCity = true;
        boolean isValidS = true;

        if ("Sofia".equals(city)) {
            if (s >= 0 && s <= 500) {
                comissions = s * 0.05;
            } else if (s > 500 && s <= 1000) {
                comissions = s * 0.07;
            } else if (s > 1000 && s <= 10000) {
                comissions = s * 0.08;
            } else if (s > 10000) {
                comissions = s * 0.12;
            } else {
                isValidS = false;
            }
        } else if ("Varna".equals(city)) {
            if (s >= 0 && s <= 500) {
                comissions = s * 0.045;
            } else if (s > 500 && s <= 1000) {
                comissions = s * 0.075;
            } else if (s > 1000 && s <= 10000) {
                comissions = s * 0.1;
            } else if (s > 10000) {
                comissions = s * 0.13;
            } else {
                isValidS = false;
            }
        } else if ("Plovdiv".equals(city)) {
            if (s >= 0 && s <= 500) {
                comissions = s * 0.055;
            } else if (s > 500 && s <= 1000) {
                comissions = s * 0.08;
            } else if (s > 1000 && s <= 10000) {
                comissions = s * 0.12;
            } else if (s > 10000) {
                comissions = s * 0.145;
            } else {
                isValidS = false;
            }
        } else {
            isValidCity = false;
        }
        if (!isValidCity || !isValidS) {
            System.out.println("error");
        } else {
            System.out.printf("%.2f", comissions);
        }
    }
}
