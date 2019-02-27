import java.util.Scanner;

public class ThreeAliNums {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int Num1 = Integer.parseInt(scanner.nextLine());
        int Num2 = Integer.parseInt(scanner.nextLine());
        int Num3 = Integer.parseInt(scanner.nextLine());

    if(Num1 == Num2 && Num2==Num3) {
        System.out.println("yes");
    }else {
        System.out.println("no");

    }
    }

}
