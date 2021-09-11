public class Soveltavat3 {
    public static void main(String[] args) {
        rekursio(2);
    }

    static void rekursio(double luku){
        if(luku > 1000)
            System.out.println(luku); //Metodia ei enää kutsuta, joten kutsuketju päättyy tähän
        else
            rekursio(luku*4); //Kertoo luvun neljällä ja kutsuu metodia uudelleen.
    }
}
