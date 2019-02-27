import java.util.Scanner;

public class TreeRacers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double time1 = Double.parseDouble(scanner.nextLine());
        double time2 = Double.parseDouble(scanner.nextLine());
        double time3 = Double.parseDouble(scanner.nextLine());

        double timeAll = (time1 + time2 + time3);
        if (timeAll>0 && timeAll<59){
            System.out.println("0" + timeAll);
        }

    }

}
