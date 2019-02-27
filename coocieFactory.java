import java.util.Scanner;

public class coocieFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        boolean eggs = false;
        boolean flour = false;
        boolean sugar = false;


        for (int i = 1; i <= n; i++) {

            String input = scanner.nextLine();

            while (!"Bake!".equalsIgnoreCase(input)) {
                switch (input) {
                    case "eggs":
                        eggs = true;
                        break;
                    case "flour":
                        flour = true;
                        break;
                    case "sugar":
                        sugar = true;
                        break;
                }
                input = scanner.nextLine();
            }
            if (eggs && flour && sugar) {
                System.out.printf("Baking batch number %d...%n", i);
                eggs = false;
                flour = false;
                sugar = false;
            } else {
                i--;
                System.out.println("The batter should contain flour, eggs and sugar!");
            }
        }
    }
}
