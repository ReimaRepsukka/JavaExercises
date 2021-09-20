public class Alennus {
    static double alennusPros = 5.5;

    public static double alennettuHinta(double hinta){
        return hinta-hinta*alennusPros/100;
    }
}
