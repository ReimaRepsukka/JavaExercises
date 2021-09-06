import java.util.Random;
import java.util.Scanner;

public class ForRatkaisut {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Harj1
        for (int i = 0; i < 11; i++) {
            System.out.println(i);
        }

        //Harj2
        for (int i = 3; i < 16; i++) {
            System.out.println(i);
        }

        //Harj3
        System.out.println("How many prints?");
        int x =  Integer.parseInt(sc.nextLine());
        for (int i = 0; i < x; i++) {
            System.out.println("Hello world!");
        }

        //Harj4
        for (int i = 0; i < 21; i+=2) {
            System.out.println(i);
        }

        //Harj5
        //Using the console to print text requires time
        //Unnecessary printig should thus be avoided

        //Harj6
        int pot = 1;
        System.out.println("Power?");
        x =  Integer.parseInt(sc.nextLine());
        for (int i = 0; i < x; i++) {
            pot *= 2;
        }
        System.out.println(pot);

        //Harj7
        for (int i=0, a=200; i<=a; i++, a-=2) {
            System.out.println("i="+i + " a="+a);
        }

        //Harj8
        for (int i = 10, a = 100; i < 20; i++, a+=3) {
            System.out.println("Pelaaja " + i + ": " + a);
        }

        //Harj9
        Random r = new Random();
        for (int i = 1; i < 4; i++) {
            System.out.println("Joukkue " + i + ":");
            for (int j = 1; j < 11; j++) {
                System.out.print("Pelaaja " + j +
                    " numerot: " );
                for (int a = 0; a < 5; a++) {
                    System.out.print(r.nextInt(9));
                    if(a != 4)
                        System.out.print(",");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}
