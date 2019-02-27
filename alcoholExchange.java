import java.util.Scanner;

public class alcoholExchange {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double whiskyPrice = Double.parseDouble(scanner.nextLine());//Цена на Уискито в лв за л.

        double beerLitres = Double.parseDouble(scanner.nextLine());
        double wineLitres = Double.parseDouble(scanner.nextLine());// КОЛИЧЕСТВО
        double rakiqLitres = Double.parseDouble(scanner.nextLine());
        double whiskyLitres = Double.parseDouble(scanner.nextLine());


        double rakiqPriceLitres = 25;

        double whiskyPriceLitres = 25 * 2;
        double winePriceLitres = 25 - (0.4 * 25);//ЦЕНА ЗА ЛИТЪР
        double beerPriceLitre = 25 - (0.8 * 25);


        double orderRakiq = (rakiqLitres * rakiqPriceLitres);
        double orderWhisky = (whiskyLitres * whiskyPriceLitres);
        double orderWine = (wineLitres * winePriceLitres);// ПОРЪЧКА
        double orderBeer = (beerLitres * beerPriceLitre);


        double order = (orderBeer + orderRakiq + orderWhisky + orderWine);

        System.out.printf("%.2f%n", order);

    }
}
