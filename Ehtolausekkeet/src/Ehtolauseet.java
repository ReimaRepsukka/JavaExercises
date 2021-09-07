import java.util.Scanner;

public class Ehtolauseet {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //Harj1: Koodi tulostaa: Mielestäni ohjelmointi ei ole helppoa! Vai mitä?

        //Harj2 
        System.out.println("Anna pisteet:");
        int pisteet = Integer.parseInt(sc.nextLine());

        if( pisteet < 10){
            System.out.println("Tuloksesi on huono");
        }else{
            System.out.println("Hyvä tulos");
        }

        //Harj2 a
        System.out.println("Anna toisen pelaajan pisteet:");
        int pisteet2 = Integer.parseInt(sc.nextLine());

        if(pisteet > pisteet2){
            System.out.println("Pelaajalla 1 on enemmän pisteitä");
        }
        else if(pisteet < pisteet2){
            System.out.println("Pelaajalla 2 on enemmän pisteitä");
        }
        else{
            System.out.println("Tasapeli");
        }

        //Harj3
        System.out.println("Anna tilin saldo:");
        double saldo = Double.parseDouble(sc.nextLine());

        System.out.println("Anna tuotteen hinta:");
        double hinta = Double.parseDouble(sc.nextLine());


        if( saldo >= hinta){
            System.out.println("Rahasi riittävät tuotteen ostoon");
        }
        else{
            System.out.println("Rahasi eivät riitä tuotteen ostoon. Tarvitset vielä " + 
                (hinta-saldo)+"€");
        }

        //Harj4
        System.out.println("Anna ikäsi:");
        int age = Integer.parseInt(sc.nextLine());

        if(age>=35 && age <= 50){
            System.out.println("Olet keski-ikäinen");
        }
        else if( age < 18 ){
            System.out.println("Olet nuori");
        }else if(age > 50){
            System.out.println("Olet vanha");
        }
        else{
            System.out.println("Normi ikä");
        }

        //Harj5
        System.out.println("Paljonko sinulla on rahaa?");
        double raha = Double.parseDouble(sc.nextLine());

        if(raha < 10){
            System.out.println("Haluatko otta lainaa?");
            String otaLaina = sc.nextLine();
            //Tai vaihtoehtoisest:  char laina = sc.nextLine().charAt(0);
            if(otaLaina.equals("Y")){
                System.out.println("Anna lainan määrä");
                double laina = Double.parseDouble(sc.nextLine());
            }
        }

        //Harj6
        System.out.println("Anna sijoituksesi:");
        int sijoitus = Integer.parseInt(sc.nextLine());

        switch (sijoitus) {
            case 1:
                System.out.println("Voitit kultaa");
                break;

            case 2:
                System.out.println("Sait hopeaa");
                break;

            case 3:
                System.out.println("Sait pronssia");
                break;
        
            default:
                System.out.println("Onnittelut hyvästä kisasta, vaikkei mitalia tullutkaan");
                break;
        }


        sc.close();
    }
}
