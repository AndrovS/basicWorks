import java.util.Scanner;

public class Nums1to9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Num = Integer.parseInt(scanner.nextLine());

        if(Num ==1){
            System.out.println("One");
        }else if(Num==2){
            System.out.println("Two");
        }else if(Num==3){
            System.out.println("Three");
        }else if(Num==4){
            System.out.println("Four");
        }else if(Num==5){
            System.out.println("Five");
        } else if (Num == 6){
            System.out.println("Six");
        }else if(Num ==7){
            System.out.println("Seven");
        }else if(Num==8){
            System.out.println("Eight");
        }else if(Num==9){
            System.out.println("Nine");
        }else{
            System.out.println("Number too big");
        }
    }
}
