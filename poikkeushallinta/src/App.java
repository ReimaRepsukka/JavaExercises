import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        //Harj1/Harj2
        String[] names = {"John", "Lisa", "Rick"};

        int index = 0;
        boolean loop = true;

        while(loop){
            System.out.println("Give an index:");
            try{
                index = Integer.parseInt(sc.nextLine());
                System.out.println(names[index]);
                loop = false; //all good, no need to loop anymore
            }catch(NumberFormatException e){
                System.out.println("The input is not an integer number.");
                System.out.println(e.getMessage());
            }catch(IndexOutOfBoundsException e){
                System.out.println("Index is not found from the names array.");
                System.out.println(e.getMessage());
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    //Harj3
    static void checkText(String text) throws NullPointerException{
        if(text == null){
            throw new NullPointerException("Text is not defined");
        }else if(text.length() == 0){
            throw new RuntimeException("Text is too short");
        }
    }
}
