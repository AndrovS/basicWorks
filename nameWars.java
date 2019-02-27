import java.util.Scanner;

public class nameWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int maxNum = 0;
        String winner = "";


        while (!"STOP".equalsIgnoreCase(input)) {
            int countSum = 0;
            for (int i = 0; i < input.length(); i++) {
                countSum += input.charAt(i);
            }
            if(countSum>maxNum){
                maxNum = countSum;
                winner = input;

            }
            input = scanner.nextLine();
        }
        System.out.printf("Winner is %s - %d!",winner,maxNum);
    }
}
