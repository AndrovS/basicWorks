import java.util.Scanner;

public class accountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contributions = Integer.parseInt(scanner.nextLine()); //вноски които ще се внасят
        int transactions = 0;//брой направени вноски
        double sum = 0.0;

        while (transactions < contributions){
            double amount = Double.parseDouble(scanner.nextLine());
            if(amount<0){
                System.out.println("Invalid operation!");
            break;
            }
            System.out.printf("Increase: %.2f%n",amount);

            sum += amount;
            transactions++;
        }
        System.out.printf("Total: %.2f",sum);






    }
}
