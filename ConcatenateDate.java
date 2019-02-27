import java.sql.SQLOutput;
import java.util.Scanner;

public class ConcatenateDate {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String name2 = scanner.nextLine();
        int a = Integer.parseInt(scanner.nextLine());
        String city = scanner.nextLine();

        System.out.printf("You are %s %s,a %d-years old person from %s", name, name2, a, city);
    }
}
