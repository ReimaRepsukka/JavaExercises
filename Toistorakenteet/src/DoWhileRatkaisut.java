import java.util.Scanner;

public class DoWhileRatkaisut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // //Harj1
        // int luku = 2;
        // do{
        //    luku*=2;
        //    System.out.println(luku);
        //    System.out.println("Wanna continue? (y/n)");

        // }while(sc.nextLine().charAt(0) == 'y');

        // //Harj2
        // boolean cont;
        // do {
        //     System.out.println("Give a number.");
        //     luku = Integer.parseInt(sc.nextLine());
        //     if(cont = luku<1 || luku>20)
        //         System.out.println("The number has to be between 1-20");
        // } while (cont);
        
        // //Harj3
        // do {
        //     System.out.println("Give another number.");
            
        // } while ((luku = Integer.parseInt(sc.nextLine())) != 0);

        //Harj4
        int x=1,y=1;
        do {
            System.out.print(x + " : ");

            do {
                System.out
                .print(y++ + " ");
            } while (y<5);
            
            System.out.println();
            y = 1;
            x++;
        } while (x<4);
    }
}
