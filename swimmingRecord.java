import java.util.Scanner;

public class swimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double record = Double.parseDouble(scanner.nextLine());//world record
        double metres = Double.parseDouble(scanner.nextLine());//metres that need to swim
        double timeInSec = Double.parseDouble(scanner.nextLine());//time in second for 1 meter

        double timeIvan = metres * timeInSec; // time

        double timeAfterDelay = Math.floor(metres / 15) * 12.5;

        double allTime = timeAfterDelay + timeIvan;



        if(record>allTime){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",allTime);
        }else{
            System.out.printf("No, he failed! He was %.2f seconds slower.",allTime-record);
        }

    }
}
