import java.util.Scanner;

public class volews {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();


        int sum = 0;

//        char a = 1;
//        char e = 2;
//        char i = 3;
//        char o = 4;
//        char u = 5;

        for (int letterIndex = 0; letterIndex < text.length(); letterIndex++) {

            char currentLetter = text.charAt(letterIndex);

            switch (currentLetter) {
                case 'a':
                    sum +=1;
                    break;
                case 'e':
                    sum +=2;
                    break;
                case 'i':
                    sum+=3;
                    break;
                case 'o':
                    sum+=4;
                    break;
                case 'u':
                    sum+=5;
                    break;
            }

        }
        System.out.println(sum);
    }
}
