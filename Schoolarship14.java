import java.util.Scanner;

public class Schoolarship14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double income = Double.parseDouble(scanner.nextLine());//Дохода на член
        double averageSuccess = Double.parseDouble(scanner.nextLine());//Среден успех
        double minimalSalary = Double.parseDouble(scanner.nextLine());// Минимална заплата

        double socialSchoolarship = Math.floor(0.35 * minimalSalary);//Социална стипендия

        double highSuccessSchoolarship = Math.floor(averageSuccess * 25);// Стипендия за отличен успех


        if (averageSuccess >= 5.50 && income < minimalSalary) {
            if (socialSchoolarship > highSuccessSchoolarship) {
                System.out.printf("You get a Social scholarship %.0f BGN ", socialSchoolarship);
            } else {
                System.out.printf("You get a scholarship for excellent results %f BGN", highSuccessSchoolarship);
            }

            if (averageSuccess >= 4.50 && income < minimalSalary) {
                System.out.printf("You get a Social scholarship %.0f BNG ", socialSchoolarship);
            } else {
                System.out.println("You cannot get a scholarship!");
            }
        }
    }
}
