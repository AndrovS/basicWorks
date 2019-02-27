import java.util.Scanner;

public class Choreography {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double countSteps = Double.parseDouble(scanner.nextLine());
        int dancers = Integer.parseInt(scanner.nextLine());
        double learningDays = Double.parseDouble(scanner.nextLine());

        double percentStepsPerDay = Math.ceil(((countSteps / learningDays)/countSteps) * 100);

        double percentStepsPerEveryDanecr =percentStepsPerDay / dancers;

        if(percentStepsPerDay <= 13){
            System.out.printf("Yes, they will succeed in that goal! %.2f%%. ", percentStepsPerEveryDanecr);
        }else{
            System.out.printf("No, they will not succeed in that goal! Required %.2f%% steps to be learned per day.", percentStepsPerEveryDanecr);

        }

    }
}
