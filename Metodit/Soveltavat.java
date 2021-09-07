import java.util.Scanner;

public class Soveltavat {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        

        System.out.println("Anna luku 1");
        double luku1 = Double.parseDouble(sc.nextLine());
        System.out.println("Anna luku 2");
        double luku2 = Double.parseDouble(sc.nextLine());
        double result = 0;

        switch (selection()) {
            case 1:
                result = sum(luku1, luku2);
                break;
            case 2:
                result = subtraction(luku1, luku2);
                break;
            case 3:
                result = multip(luku1, luku2);
                break;
            case 4:
                result = division(luku1, luku2);
                break;
        
            default:
                break;
        }

        System.out.println("Result is " + result);
        sc.close();
    }

    static int selection(){
        System.out.println("Valitse seuraavista");
        System.out.println("1 Summa ");
        System.out.println("2 Erotus");
        System.out.println("3 Tulo");
        System.out.println("4 Osamäärä");

        return Integer.parseInt(sc.nextLine());
    }

    static double sum(double x, double y){
        return x+y;
    }

    static double subtraction(double x, double y){
        return x-y;
    }

    static double multip(double x, double y){
        return x*y;
    }

    static double division(double x, double y){
        return x/y;
    }
}
