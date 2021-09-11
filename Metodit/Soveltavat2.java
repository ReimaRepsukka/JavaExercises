import java.util.Scanner;

public class Soveltavat2 {
    static double saldo = 0;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        aloitus();
        //Valikko palauttaa false, jos käyttäjä ei tehnyt enää järkevää valintaa
        //While ilman koodilohkoa voi päättyä puolipisteeseen
        while(Valikko());
    }

    static boolean Valikko(){

        System.out.println("***********************");
        System.out.println("Anna valinta:");
        System.out.println("a Pano");
        System.out.println("b Nosto");
        System.out.println("c Tulosta saldo");
        String valinta = sc.nextLine();
        System.out.println("***********************");
        
        switch (valinta) {
            case "a":
                pano();
                break;
        
            case "b":
                otto();
                break;

            case "c":
                System.out.println("Tilin saldo on " + saldo);
                break;

            default:
                return false;
        }

        return true;
    }

    static void aloitus(){
        System.out.println("Anna alkusaldo");
        saldo = Double.parseDouble(sc.nextLine());
    }

    static void pano(){
        System.out.println("Anna talletuksen määrä:");
        saldo += Double.parseDouble(sc.nextLine());
    }

    static void otto(){
        System.out.println("Anna nostettava määrä:");
        double maara = Double.parseDouble(sc.nextLine());

        if(maara > saldo){
            System.out.println("Ei riittävästi rahaa tilillä");
        }else{
            saldo -= maara;
        }
    }
}
