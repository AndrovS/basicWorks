import java.util.Scanner;

public class summerOutfit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int degrees = Integer.parseInt(scanner.nextLine());
        String timeOfTheDay = scanner.nextLine();// "Morning","Afternoon","Evening"

        String outfit = null;
        String shoes = null;

        if (degrees >= 10 && degrees <= 18) {
            if ("Morning".equals(timeOfTheDay)) {
                outfit = "Sweatshirt";
                shoes = "Sneakers";
            } else if ("Afternoon".equals(timeOfTheDay)) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if ("Evening".equals(timeOfTheDay)) {
                outfit = "Shirt";
                shoes = "Moccasins";
            }
        } else if (degrees > 18 && degrees <= 24) {
            if ("Morning".equals(timeOfTheDay)) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if ("Afternoon".equals(timeOfTheDay)) {
                outfit = "T-Shirt";
                shoes = "Sandals";
            } else if ("Evening".equals(timeOfTheDay)) {
                outfit = "Shirt";
                shoes = "Moccasins";
            }
        } else if (degrees > 24) {
            if ("Morning".equals(timeOfTheDay)) {
                outfit = "T-Shirt";
                shoes = "Sandals";
            } else if ("Afternoon".equals(timeOfTheDay)) {
                outfit = "Swim Suit";
                shoes = "Barefoot";
            } else if ("Evening".equals(timeOfTheDay)) {
                outfit = "Shirt";
                shoes = "Moccasins";
            }
        }
        System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
    }
}
