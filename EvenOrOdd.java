import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a =Integer.parseInt(scanner.nextLine());
        if(a%2==0)
            System.out.println("Even");
        else{
            System.out.println("Odd");
        }

    }
}
