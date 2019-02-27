import java.util.Scanner;

public class salary2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= tabs; i++) {
            String tabName = scanner.nextLine();
            if (tabName.equals("Facebook")) {
                salary -= 150;
            } else if (tabName.equals("Instagram")) {
                salary -= 100;
            } else if (tabName.equals("Reddit")) {
                salary -= 50;

            }
            if (salary <= 0) {
                System.out.println("You have lost your salary.");
                break;
            }
        }
        if (salary > 0) {
            System.out.println(salary);
        }
    }
}
