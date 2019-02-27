import java.util.Scanner;

public class jurney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budgete = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double poharcheniPari = 0;
        String destination = "";
        String kudeShteE = "";

        if (budgete <= 100) {
            destination = "Somewhere in Bulgaria";
            if (season.equals("summer")) {
                kudeShteE = "Camp";
                poharcheniPari = budgete * 0.3;
            } else if (season.equals("winter")) {
                kudeShteE = "Hotel";
                poharcheniPari = budgete * 0.7;
            }
        } else if (budgete > 100 && budgete <= 1000) {
            destination = "Somewhere in Balkans";
            if (season.equals("summer")) {
                kudeShteE = "Camp";
                poharcheniPari = budgete * 0.4;

            } else if (season.equals("winter")) {
                kudeShteE = "Hotel";
                poharcheniPari = budgete * 0.8;
            }
        } else if (budgete > 1000) {
            destination = "Somewhere in Europe";
            kudeShteE = "Hotel";
            if (season.equals("summer")) {
                poharcheniPari = budgete * 0.9;
            } else if (season.equals("winter")) {
                poharcheniPari = budgete * 0.9;
            }
        }

        System.out.println(destination);
        System.out.printf("%s - %.2f", kudeShteE, poharcheniPari);
    }
}
