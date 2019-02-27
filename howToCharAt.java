import java.util.Scanner;

public class howToCharAt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        System.out.println(word.charAt(0));// the first char
        System.out.println(word.charAt(word.length()-1));// the last char
    }
}
