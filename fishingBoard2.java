import java.util.Scanner;

public class fishingBoard2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budgete = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int countFishers = Integer.parseInt(scanner.nextLine());

        double springPrice = 3000;
        double summerPrice = 4200;
        double winterPrice = 2600;
        double autumnPrice = 4200;

        double totalPrice = 0;

        if ("Spring".equals(season)) {
            if (countFishers <= 6) {
                totalPrice = springPrice * 0.9;
            } else if (countFishers > 6 && countFishers <= 11) {
                totalPrice = springPrice * 0.85;
            } else if (countFishers > 11) {
                totalPrice = springPrice * 0.75;
            }
        } else if ("Summer".equals(season)) {
            if (countFishers <= 6) {
                totalPrice = summerPrice * 0.9;
            } else if (countFishers > 6 && countFishers <= 11) {
                totalPrice = summerPrice * 0.85;
            } else if (countFishers > 11) {
                totalPrice = summerPrice * 0.75;
            }
        } else if ("Winter".equals(season)) {
            if (countFishers <= 6) {
                totalPrice = winterPrice * 0.9;
            } else if (countFishers > 6 && countFishers <= 11) {
                totalPrice = winterPrice * 0.85;
            } else if (countFishers > 11) {
                totalPrice = winterPrice * 0.75;
            }
        }else if("Autumn".equals(season)){
            if(countFishers<=6){
                totalPrice = autumnPrice * 0.9;
            }else if(countFishers>6 && countFishers <=11){
                totalPrice = autumnPrice * 0.85;
            }else if(countFishers>11){
                totalPrice = autumnPrice * 0.75;
            }
        }
        if(countFishers % 2 == 0 && !("Autumn".equals(season))){
            totalPrice = totalPrice * 0.95;
        }else{
            totalPrice = totalPrice;
        }
        double ostavashtiPari = budgete - totalPrice;
        double nedostigashtiPari = totalPrice - budgete;

        if(budgete>=totalPrice){
            System.out.printf("Yes! You have %.2f leva left.", ostavashtiPari);
        }else if(budgete<totalPrice){
            System.out.printf("Not enough money! You need %.2f leva.",nedostigashtiPari);
        }
    }
}