import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int movieSize = 1500;
        int wifiSpeed = 2; //  mb/s

        double downloadData = Double.parseDouble(scanner.nextLine());
        int cinemaPrice = Integer.parseInt(scanner.nextLine());
        int wifeSpending = Integer.parseInt(scanner.nextLine());


        double downloadTime = downloadData/2/60/60;

        double priceInTheMall = downloadTime*wifeSpending;

        double numberOfMovies = downloadData/movieSize;

        double priceInTheCinema = numberOfMovies * cinemaPrice;

        if(priceInTheCinema<priceInTheMall){
            System.out.printf("cinema -> %.2flv",priceInTheCinema);
        }else{
            System.out.printf("mall -> %.2flv",priceInTheMall);
        }


    }
}
