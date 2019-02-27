import java.util.Scanner;

public class ZeroToSto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int in = Integer.parseInt(scanner.nextLine());
        if (in < 0 && in > 10) {
            System.out.println("number too big");
        } else if (in == 1) {
            System.out.println("one");
        } else if (in == 2) {
            System.out.println("two");
        } else if (in == 3) {
            System.out.println("tree");
        } else if (in == 4) {
            System.out.println("four");
        } else if (in == 5) {
            System.out.println("five");
        } else if (in == 6) {
            System.out.println("six");
        } else if (in == 7) {
            System.out.println("seven");
        } else if (in == 8) {
            System.out.println("eight");
        } else if (in == 9) ;
        {
            System.out.println("nine");
        }
    }
}