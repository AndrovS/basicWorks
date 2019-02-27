import java.util.Scanner;

public class SquareAre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int area = a * a;
        System.out.println(area);
    }
}