import java.util.Scanner;

public class balans {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vnoski = Integer.parseInt(scanner.nextLine());

        double total = 0;


        while (vnoski-- > 0) {
            double value = Double.parseDouble(scanner.nextLine());

            if(value>=0){
                total = total + value;
                System.out.printf("Increase: %.2f%n", value);
            }else{
                System.out.println("Invalid operation!");
                break;
            }
        }
        System.out.printf("Total: %.2f",total);

    }
}
