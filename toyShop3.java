import java.util.Scanner;

public class toyShop3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());

        int bCount = Integer.parseInt(scanner.nextLine());
        int cCount = Integer.parseInt(scanner.nextLine());
        int dCount = Integer.parseInt(scanner.nextLine());
        int eCount = Integer.parseInt(scanner.nextLine());
        int fCount = Integer.parseInt(scanner.nextLine());

        double bProfit = bCount * 2.6;
        double cProfit = cCount * 3;
        double dProfit = dCount * 4.10;
        double eProfit = eCount * 8.20;
        double fProfit = fCount * 2;

        int tCount = bCount + cCount + dCount + eCount + fCount;

        double tProfit = bProfit + cProfit + dProfit + eProfit + fProfit;

        if(tCount>=50){
            tProfit = (tProfit * 0.25);
        }

        tProfit = tProfit - (tProfit * 0.1);

        if(tProfit >=a){
            double r = tProfit - a;
            System.out.printf("Yes! %.2f lv left.",r);
        }else{
            System.out.printf("Not enough money! %.2f lv needed.",a - tProfit);
        }
    }
}
