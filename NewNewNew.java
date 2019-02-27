import java.util.Scanner;

public class NewNewNew {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowers = scanner.nextLine();//- "Roses", "Dahlias", "Tulips", "Narcissus", "Gladiolus"
        int numFlowers = Integer.parseInt(scanner.nextLine());
        int budgete = Integer.parseInt(scanner.nextLine());

        double rosePrice = 5;
        double dahliaPrice = 3.80;
        double tulipsPrice = 2.80;
        double narcissusPrice = 3;
        double glauiolusPrice = 2.50;


        double cena = 0;

        switch (flowers){
            case"Roses":
                if(numFlowers>80){
                    cena = ( numFlowers * 5 ) * 0.9;
                }else{
                    cena = numFlowers * 5;
                }
                break;

            case"Dahlias":
                if(numFlowers >90){
                    cena = (numFlowers * 3.80)*0.85;
                }else{
                    cena = numFlowers * 3.80;
                }
                break;

            case"Tulips":
                if(numFlowers > 80){
                    cena = (numFlowers * 2.80)* 0.85;
                }else{
                    cena=numFlowers*2.80;
                }
                break;

            case"Narcissus":
                if(numFlowers<120){
                    cena = (numFlowers * 3) * 1.15;
                }else{
                    cena = numFlowers * 3;
                }
                break;

            case"Gladiolus":
                if(numFlowers<80){
                    cena = numFlowers * 2.50 * 1.2;
                }else{
                    cena = numFlowers * 2.50;
                }
                break;
                default:

        }
        double levaLeft = budgete - cena;
        double levaNeed = cena - budgete;

        if(budgete>=cena){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",numFlowers, flowers,levaLeft);
        }else{
            System.out.printf("Not enough money, you need %.2f leva more.",levaNeed);
        }



        }
    }

