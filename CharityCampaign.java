
import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int daysOfCampaign = Integer.parseInt(scanner.nextLine());//Броя на дните
        int bakersNum = Integer.parseInt(scanner.nextLine());//Броя на Сладкарите

        int cakesNum = Integer.parseInt(scanner.nextLine());// броя на Тортите
        int wafflesNum = Integer.parseInt(scanner.nextLine());//Броя на Гофретите
        int pancakesNum = Integer.parseInt(scanner.nextLine());// Броя на палачинките

        double sumPerBakerPerDay = (cakesNum * 45) + (wafflesNum * 5.80)
                + (pancakesNum * 3.20);

        double sumForAllBakers = sumPerBakerPerDay * bakersNum;

        double result = sumForAllBakers * daysOfCampaign;
        double finalResult = result * 7/8;

        System.out.printf("%.2f", finalResult);


    }
}

