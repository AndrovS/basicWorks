import java.util.Scanner;

public class skiiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String evaluation = scanner.nextLine();

        int nights = days - 1;
        double price = 0;

        double krainaCena = 0;

        double priceApartament = nights * 25.00;
        double pricePresidentApartament = nights * 35.00;

        if ("room for one person".equals(room)) {
            price = nights * 18.00;
        } else if ("apartment".equals(room)) {

            if (nights < 10) {
                price = priceApartament - (priceApartament * 0.30);


            } else if (nights < 15) {
                price = priceApartament - (priceApartament * 0.35);


            } else if (nights >= 15) {
                price = priceApartament - (priceApartament * 0.50);
            }

        } else if ("president apartment".equals(room)) {

            if (nights < 10) {
                price = pricePresidentApartament - (pricePresidentApartament * 0.1);
            } else if (nights >= 10 && nights < 15) {
                price = pricePresidentApartament - (pricePresidentApartament * 0.15);
            } else if (nights > 15) {
                price = pricePresidentApartament - (pricePresidentApartament * 0.20);
            }
        }
        if("positive".equals(evaluation)){
            krainaCena = price + (price * 0.25);
        }else if("negative".equals(evaluation)){
            krainaCena = price - (price*0.1);
    }
        System.out.printf("%.2f",krainaCena);
}
}
