import java.util.Scanner;

public class oldLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String searchedBook = scanner.nextLine();
        int capacity = Integer.parseInt(scanner.nextLine());

        int countCheckedBooks = 0;

        while (capacity>0){
            String currentBook = scanner.nextLine();

            if(currentBook.equals(searchedBook)){
                System.out.printf("You checked %d books and found it.",countCheckedBooks);
                break;
            }else{
            countCheckedBooks++;
            capacity--;
            }
            }
        if(capacity==0){
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", countCheckedBooks);
        }

    }
}
