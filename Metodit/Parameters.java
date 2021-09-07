public class Parameters {
    public static void main(String[] args) {
        //Harj1
        printText("Hello");
        //Harj2
        sum(6.6, 3.5);

        //Harj3
        int[] luvut = {3,2,4,5};
        arrayInfo(luvut);

    }

    static void printText(String text){
        System.out.println(text);
    }

    static void sum(double x, double y){
        System.out.println(x+y);
    }

    static void arrayInfo(int[] array){
        int sum = 0;
        for (int i : array) {
            System.out.println(i);
            sum+=i;
        }

        System.out.println("Summa on " + sum);
    }
}
