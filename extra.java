import java.util.Scanner;

public class extra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int finish1 = Integer.parseInt(scanner.nextLine());
        int finish2 = Integer.parseInt(scanner.nextLine());
        int finish3 = Integer.parseInt(scanner.nextLine());

        int sumSeconds = finish1 + finish2 + finish3;

        int sumMinutes = sumSeconds / 60;
        int seconds = sumSeconds % 60;

        if (sumSeconds < 10) {
            System.out.println("0:" + seconds);
        } else if ((sumSeconds > 0) && (sumSeconds < 60)) {
            System.out.println("0:" + seconds);
        } else if ((sumSeconds >= 60) && (sumSeconds < 120)) {
            System.out.println("1:" + (sumSeconds - 60));
        } else if ((sumSeconds >= 120) && (sumSeconds < 180)) {
            System.out.println("2:" + (sumSeconds - 120));
        }


    }
}


