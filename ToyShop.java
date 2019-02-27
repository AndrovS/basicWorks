import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double Excursion = Double.parseDouble(scanner.nextLine());// Цена Екскурзия
        int Puzzles = Integer.parseInt(scanner.nextLine());//Брой Пъзели
        int Dolls = Integer.parseInt(scanner.nextLine());//Брой Кукли
        int Bears = Integer.parseInt(scanner.nextLine());//Брой Мечки
        int Minions = Integer.parseInt(scanner.nextLine());//Брой Миньони
        int Trucks = Integer.parseInt(scanner.nextLine());//Брой Камиони

        double PuzzleProfit = Puzzles * 2.60;//печалба пъзели
        double DollsProfit = Dolls * 3.0;//печалба кукли
        double BearsProfit = Bears * 4.10;//печалба мечки
        double MinionsProfit = Minions * 8.20;//печалба миниони
        double TrucksProfit = Trucks * 2.0;//печалба камиони

        double TotalPrice = (2.60 + 3.0 + 4.10 + 8.20 + 2.0);// Обща цена
        double TotalProfit = (PuzzleProfit + DollsProfit + BearsProfit + MinionsProfit + TrucksProfit);//Обща печалба
        int TotalOrder = (Puzzles + Dolls + Bears + Minions + Trucks);//Обща поръчка

        if(TotalOrder > 50 ){
            TotalProfit = (TotalPrice * 0.25);
        }else{
            TotalProfit = TotalProfit * 1;
        }

        double ExtremeProfit = TotalProfit - (TotalProfit * 0.1);

        if(ExtremeProfit >= 500){
            System.out.println("nema qdove");
        }else{
            System.out.println("Oshte pari trebat");
        }



    }
}
