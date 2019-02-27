import java.util.Scanner;

public class hotelRoom3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine(); //– May, June, July, August, September или October
        int countNights = Integer.parseInt(scanner.nextLine());

        double studioPrice = 0;
        double apartmentPrice = 0;


        switch (month) {
            case "May":
            case "October":

                studioPrice = countNights * 50;
                apartmentPrice = countNights * 65;
                if (countNights > 7 && countNights <= 14) {
                    studioPrice *= 0.95;
                } else if (countNights > 14) {
                    studioPrice *= 0.7;
                    apartmentPrice *= 0.9;
                }
                break;

            case "June":
            case "September":

                studioPrice = countNights * 75.20;
                apartmentPrice = countNights * 68.70;
                if (countNights > 14) {
                    studioPrice *= 0.8;
                    apartmentPrice *= 0.9;
                }
                break;

            case"July":
            case"August":

                studioPrice = countNights * 76;
                apartmentPrice = countNights * 77;

                if(countNights>14){
                    apartmentPrice*=0.9;
                }
                break;
        }
        System.out.printf("Apartment: %.2f lv. %n",apartmentPrice);
        System.out.printf("Studio: %.2f lv.", studioPrice);

    }
}
