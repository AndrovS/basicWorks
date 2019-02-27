import java.util.Scanner;

public class CaloriesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char gender = scanner.nextLine().charAt(0);
        double weight = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        int age = Integer.parseInt(scanner.nextLine());
        String activity = scanner.nextLine();

        height = height * 100;
        double bnm = 0;

        if(gender == 'm'){
            bnm = 66 + (13.7 * weight) + (5 * height) - (6.8 * age);
        }else if (gender == 'f'){
            bnm = 655 + (9.6 * weight) + (1.8 * height) - (4.7 * age);
        }

        double calories = 0;

        if(activity.equals("sedentary")){
            calories = bnm *  1.2;
        }else if (activity.equals("lightly active")){
            calories = bnm * 1.375;
        }else if (activity.equals("moderately active")){
            calories = bnm * 1.55;
        } else if (activity.equals("very active")){
            calories = bnm * 1.725;
        }
        calories = Math.ceil(calories);
        System.out.printf("To maintain your current weight you will need %.0f calories per day.",calories);
    }
}
