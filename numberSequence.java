import java.util.Scanner;

public class numberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int minNum = Integer.MAX_VALUE;
        int maxNum = Integer.MIN_VALUE;

        String command = scanner.nextLine();

        while (!"END".equals(command)) {

            int num = Integer.parseInt(command);

            if(num<minNum) minNum = num;
            if(num>maxNum) maxNum = num;

            command = scanner.nextLine();


        }
        System.out.printf("Max number: %d%n",maxNum);
        System.out.printf("Min number: %d",minNum);

    }
}
