import java.util.Scanner;

public class onTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hourForExam = Integer.parseInt(scanner.nextLine());
        int minuteForExam = Integer.parseInt(scanner.nextLine());
        int hourArrive = Integer.parseInt(scanner.nextLine());
        int minuteArrive = Integer.parseInt(scanner.nextLine());
//Late, On time, Early
        int examTime = (hourForExam * 60) + minuteForExam;
        int arriveTime = (hourArrive * 60) + minuteArrive;

        if (arriveTime > examTime) {
            System.out.println("Late");
            int lateTime = arriveTime - examTime;

            if (lateTime < 60) {
                System.out.printf("%d minutes after the start", lateTime);
            } else {
                int lateHour = lateTime / 60;
                int lateMinutes = lateTime % 60;
                System.out.printf("%d:%02d hours after the start", lateHour, lateMinutes);
            }


        } else if (arriveTime == examTime || examTime - arriveTime <= 30) {
            System.out.println("On time");
            int onTime = examTime - arriveTime;

            if (onTime != 0) {
                System.out.printf("%d minutes before the start", onTime);
            }


        } else if (examTime - arriveTime > 30) {
            System.out.println("Early");
            int early = examTime - arriveTime;
            if (early < 60) {
                System.out.printf("%d minutes before the start", early);
            } else {
                int earlyHour = early / 60;
                int earlyMinutes = early % 60;
                if (earlyMinutes < 10) {
                    System.out.printf("%d:0%d hours before the start", earlyHour, earlyMinutes);
                } else {
                    System.out.printf("%d:%d hours before the start", earlyHour, earlyMinutes);
                }
            }


        }
    }
}