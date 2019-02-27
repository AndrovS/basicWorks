import java.util.Scanner;

public class bonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pointsNumber = Integer.parseInt(scanner.nextLine());
        double bonusPoints = 0;


        if (pointsNumber <= 100) {
            bonusPoints = bonusPoints + 5;
        } else if (pointsNumber > 1000) {
            bonusPoints = pointsNumber * 0.1;
        } else {
            bonusPoints = pointsNumber * 0.2;
        }

        if (pointsNumber % 2 == 0) {
            bonusPoints = bonusPoints + 1;
        } else if (pointsNumber % 10 == 5)
            bonusPoints = bonusPoints + 2;
        System.out.println(bonusPoints);
        System.out.println(bonusPoints + pointsNumber);
    }
}

