import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
     
        Scanner sc = new Scanner(System.in);


        //Harj1
        System.out.println("Anna kaksi lukua:");
        int x = Integer.parseInt(sc.nextLine());
        int y = Integer.parseInt(sc.nextLine());
        int summa, tulo;
        double osamaa;

        summa = x+y;
        tulo = x*y;
        osamaa = (double)x/y;

        System.out.println(summa + " " + tulo + " " + osamaa);

        //Harj2
        System.out.println("Anna nimi:");
        String nimi = sc.nextLine();
        System.out.println("Anna ikä");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Hei " + nimi +". Olet " + age + " vuotias");

        //Harj3
        System.out.println(x + "+" + y + "=" + (x+y));
        System.out.println(x + "*" + y + "=" + (x*y));
        System.out.println(x + "/" + y + "=" + ((double)x/y));

        //Harj4
        //Harj5
        double paino = 80;
        double pituus = 1.75;
        double painoindeksi = paino/(pituus*pituus);
        System.out.println(painoindeksi);

        //Harj6
        double korkeus = 5;
        double leveys = 8;
        double radius = 7;
        double nelioAla= korkeus*korkeus;
        double suorakulmAla = korkeus*leveys;
        double ympyraAla = Math.PI * radius *radius;
        
        //Harj7
        System.out.println("Paljonko karkkeja?");
        int karkit = Integer.parseInt(sc.nextLine());

        int jaannos = karkit%5;
        System.out.println(jaannos + "kpl karkkeja jää yli");

        //Harj8
        System.out.println("Paljonko Matti sinulla on rahaa?");
        double money = Double.parseDouble(sc.nextLine());
        System.out.println("Montako lasta?");
        int children = Integer.parseInt(sc.nextLine());      

        double  leftover = money%(double)children;
        System.out.println("Matti sinulle jäi " + leftover + "€");

        //Harj8 - osa2
        double mattimoney = money - 50;
        int leftOver2 = 50%children;
     
        mattimoney += leftOver2;

        System.out.println("Matti sinulle jäi " + mattimoney + "€");
      
        //Harj9
        Random rnd = new Random();
        int arvottu = rnd.nextInt(21)*5;  //0-20 * 5
        System.out.println(arvottu);

        sc.close();
    }
}
