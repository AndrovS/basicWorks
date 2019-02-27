import java.util.Scanner;

public class oEpos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double sumOdd = 0;
        double oddMax = Double.MIN_VALUE;
        double oddMin = Double.MAX_VALUE;

        double sumEven = 0;
        double evenMax = Double.MIN_VALUE;
        double evenMin = Double.MAX_VALUE;


        for (int i = 1; i <= n; i++) {
            double number = Double.parseDouble(scanner.nextLine());

            if (i % 2 == 0) {
                sumEven += number;

                if (number > evenMax) {
                    evenMax = number;
                }
                if (number < evenMin) {
                    evenMin = number;
                }
            } else {
                sumOdd += number;

                if (number > oddMax) {
                    oddMax = number;
                }
                if (number < oddMin) {
                    oddMin = number;
                }
            }
        }
        System.out.printf("OddSum=%.2f,%n",sumOdd);

        if(oddMin==Double.MAX_VALUE){
            System.out.printf("No,");
        }else{
            System.out.printf("OddMin=%.2f,%n",oddMin);
        }

        if(oddMax ==Double.MIN_VALUE){
            System.out.printf("No,");
        }else{
            System.out.printf("OddMax=%.2f,%n",oddMax);
        }


        System.out.printf("EvenSum=%.2f,%n",sumEven);

        if(evenMin == Double.MAX_VALUE){
            System.out.printf("No,");
        }else{
            System.out.printf("EvenMin=%.2f,%n",evenMin);
        }

        if(evenMax == Double.MIN_VALUE){
            System.out.printf("No,");
        }else{
            System.out.printf("EvenMax=%.2f",evenMax);
        }

    }
}
