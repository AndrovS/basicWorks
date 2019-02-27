import java.util.Scanner;

public class TailoringWorkshop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int recTables = Integer.parseInt(scanner.nextLine());

        double lenght = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());

        double areaOneCover = (lenght + 2 * 0.30) * (width + 2 * 0.30);
        double areaOneSquare = (lenght / 2) * (lenght / 2);

        double areaCovers = recTables * areaOneCover;
        double areaSquares = recTables * areaOneSquare;

        double priceCovers = areaCovers * 7;
        double priceSquare = areaSquares * 9;

        double totalPriceOnDollars = priceCovers + priceSquare;

        double totalPriceOnBgn = totalPriceOnDollars * 1.85;


        System.out.printf("%.2f USD%n", totalPriceOnDollars);
        System.out.printf("%.2f BGN", totalPriceOnBgn);


    }
}
