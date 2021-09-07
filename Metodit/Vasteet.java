import java.util.Random;

public class Vasteet {
   public static void main(String[] args) {
       
   }
   
   //Harj1
   static int getNumber(){
       return new Random().nextInt(100);
   }

   //Harj3
   static int negation(int num){
       return -num;
   }

   //Harj3
   static double calcSubstraction(double x, double y){
       return x-y;
   }

   //Harj4
   static int max(int x, int y){
       if(x>y){
           return x;
       }else{
           return y;
       }

       //return x>y ? x : y;    (same with conditional operator)
   }

   //Harj5
   static String getValueByIndex(String[] array, int index){
       if(index < 0 || index > array.length-1){
           return "Unknown";
       }

       return array[index];
   }
}
