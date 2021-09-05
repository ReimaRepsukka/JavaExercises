import java.util.Scanner;

public class WhileRatkaisut {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        //Harj1
        int laskuri = 0;
        while(laskuri++ < 3){
            System.out.println("Tervetuloa");
        }
        //Harj2
        laskuri = 1;
        while(laskuri < 4){
            System.out.println(laskuri++);
        }
        //Harj3
        laskuri = 1;
        while(laskuri < 10){
            System.out.println( (laskuri++) + "*5");
        }
        //Harj4
        laskuri = 0;
        while(laskuri < 21){
            System.out.println(laskuri);
            laskuri+=2;
        }
        //harj5
        laskuri = 1;
        while(laskuri != 0){
            System.out.println("Anna luku");
            laskuri = Integer.parseInt(sc.nextLine());
        }

        //Harj6
        laskuri = 0;
        int summa = 0;
        while(laskuri++ < 5){
            System.out.println("Anna luku");
            summa += Integer.parseInt(sc.nextLine());
        }
        System.out.println(summa);

        //Harj7
        laskuri = 0;
        while(laskuri <1 || laskuri > 10){
            System.out.println("Anna luku");
            laskuri = Integer.parseInt(sc.nextLine());
        }

        //Harj8
        int x = 1;
        int y = 1;
        while(x < 10){
            while(y<10){
                System.out.print(x + "*" + y + "  ");
                y++;
            }
            System.out.println();
            y=1;
            x++;
        }

        sc.close();
    }
}
