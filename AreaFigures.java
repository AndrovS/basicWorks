import java.util.Scanner;

public class AreaFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String shape = scanner.nextLine();
        double area = 0.0;
        if (shape.equals("square")) {
            double side = Double.parseDouble(scanner.nextLine());
            area = side * side;
        }else if(shape.equals("rectangle")){
            double sideA = Double.parseDouble(scanner.nextLine());
            double sideB = Double.parseDouble(scanner.nextLine());
            area = sideA * sideB;
        }
        System.out.println(area);


    }
}
