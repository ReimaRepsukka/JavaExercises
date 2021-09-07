import java.util.Scanner;

public class Metodit {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //Harj1&Harj2
        // printNumber();
        // for (int i = 0; i < 10; i++) {
        //     printNumber();
        // }

         //Harj3
         welcome();
         askName();
         askAge();
 
         //Harj4
         System.out.println("Laske pinta-ala");
         System.out.println("1) Suorakulmio\n2) Kolmio");
         int valinta = Integer.parseInt(sc.nextLine());
 
         switch (valinta) {
             case 1: calcSquare(); break;
             case 2: calcTriangle();break;
         }
        
        sc.close();
    }  

    //Harj1
    static void printNumber(){
        //Harj2
        System.out.println("Anna luku");
        int luku = Integer.parseInt(sc.nextLine());
        System.out.println(luku);
    }

    static void askName(){
        System.out.println("Anna nimi");
        String name = sc.nextLine();
        System.out.println(name);
    }

    static void askAge(){
        System.out.println("Anna ikä");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Täysi-ikäisyyteen on " + (18-age) + " vuotta");
    }

    static void welcome(){
        for (int i = 0; i < 10; i++) {
            System.out.println("tervetuloa");
        }
    }

    static void calcSquare(){
        System.out.println("Anna leveys");
        double w = Double.parseDouble(sc.nextLine());
        System.out.println("Anna korkeus");
        double h = Double.parseDouble(sc.nextLine());

        System.out.println("Suorakaiteen pinta-ala on " + (w*h));

    }

    static void calcTriangle(){
        System.out.println("Anna leveys");
        double w = Double.parseDouble(sc.nextLine());
        System.out.println("Anna korkeus");
        double h = Double.parseDouble(sc.nextLine());

        System.out.println("Kolmion pinta-ala on " + (w*h/2));
    }
}
