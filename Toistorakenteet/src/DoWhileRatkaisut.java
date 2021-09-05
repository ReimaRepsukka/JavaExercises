import java.util.Scanner;

public class DoWhileRatkaisut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Harj1
        int luku = 2;
        do{
           luku*=2;
           System.out.println(luku);
           System.out.println("Wanna continue? (y/n)");

        }while(sc.nextLine().charAt(0) == 'y');

        //Harj2
        
    }
}
