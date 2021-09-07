import java.util.Random;
import java.util.Scanner;

public class Taulukkoharj {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);

        //Harj1
        int[] luvut = new int[5];
        luvut[0] = 1;
        luvut[1] = 2;
        luvut[2] = 3;
        luvut[3] = 4;
        luvut[4] = 5;

        //Harj2
        int[] numerot = {10,20,30};
        int x = 5;
        numerot[1] = x;

        //Harj3
        String[] tiedot = {"Sami", "Kalevi", "Mäki"};
        System.out.println(tiedot[0] + " " + tiedot[1] + " " + tiedot[2]);

        //Harj4
        double[] arvot = {1.5, 3.6, 4.7};
        double[] temp = new double[2];
        temp[0] = arvot[0];
        temp[1] = arvot[2];
        arvot[0] = temp[1];
        arvot[2] = temp[0];

        //Harj5
        char[] aakkoset = {'a','b','c','d','e','f','g',
                        'h','i','j','k','l','m','n','o',
                        'p','q','r','s','t'};
        
        char[] salasana = new char[4];
        Random rand = new Random();
        int randIndex;

        for (int i = 0; i < salasana.length; i++) {
            randIndex = rand.nextInt(aakkoset.length);
            salasana[i] = aakkoset[randIndex];
        }
        //char array can be directly printed as letters
        System.out.println(salasana); 

        //Harj6
        System.out.println("Anna taulukon koko:");
        int size = Integer.parseInt(sc.nextLine());

        String[] taulu = new String[size];

        for (int i = 0; i < taulu.length; i++) {
            taulu[i] = "";
        }

        //Harj7 c
        int[] lukuja = new int[5];

        System.out.println("Anna yksi kerrallaan kokonaisluvut taulukkoon");
        
        for (int i = 0; i < lukuja.length; i++) {
            lukuja[i] = Integer.parseInt(sc.nextLine());
        }

        //Harj7 a
        
        int summa = 0;

        for (int i : lukuja) {
            summa += i;
        }
        System.out.println("Lukujen summa on " + summa);

        //Harj7 b
        int pienin = lukuja[0];
        for (int i : lukuja) {
            if(i<pienin){
                pienin = i;
            }
        }
        System.out.println("Taulukon pienin arvo on " + pienin);


        sc.close();
    }
}
