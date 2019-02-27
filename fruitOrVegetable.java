
import java.util.Scanner;

public class fruitOrVegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        if (name.equalsIgnoreCase("banana") ||
                (name.equalsIgnoreCase("apple")) ||
                (name.equalsIgnoreCase("kiwi")) ||
                (name.equalsIgnoreCase("lemon")) ||
                (name.equalsIgnoreCase("cherry")) ||
                (name.equalsIgnoreCase("grapes"))) {
            System.out.println("fruit");

        } else if (name.equalsIgnoreCase("tomato")||
                (name.equalsIgnoreCase("cucumber")) ||
                (name.equalsIgnoreCase("pepper"))||
                (name.equalsIgnoreCase("carrot"))){
            System.out.println("vegetable");
        }else{
            System.out.println("unknown");
        }
        }
    }

