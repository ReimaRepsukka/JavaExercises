import java.util.Scanner;

public class AppBank {

    static double balance = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {    
        start();      
    }

    static void start()
    {
        System.out.println("Welcome! Please give the default balance:");
        try{
            balance =  Double.parseDouble(scanner.nextLine());
        }catch(NumberFormatException e){
            System.out.println("Not valid balance. Setting 0 balance");
            balance = 0;
        }

        menu();
    }

    static void menu()
    {
        int selection = 1;
        do{
            System.out.println("*************");
            System.out.println("1 Deposit");
            System.out.println("2 Withdraw");
            System.out.println("3 Show balance");
            System.out.println("4 Quit");
            System.out.println("*************");
            try{
                selectAction( selection = Integer.parseInt( scanner.nextLine()));
            }catch(NumberFormatException e){
                System.out.println("Input is not in correct format.");
            }catch(NegativeBalanceException e){
                System.out.println(e.getMessage());
            }
        }while(selection != 4);
    }

    static void selectAction(int selection)
    {
        switch (selection) {
            case 1:
                deposit();
                break;
        
            case 2:
                withdraw();
                break;

            case 3:
                showBalance();
                break;

            default:
                System.err.println("No such selection");
                break;
        }
    }

    static void deposit()
    {
        System.out.println("How much you want to deposit?");
        balance += Double.parseDouble(scanner.nextLine());
    }

    static void withdraw() throws NegativeBalanceException
    {
        System.out.println("How much you want to withdraw?");
        double wd = Double.parseDouble(scanner.nextLine());

        if( balance - wd < 0){
            throw new NegativeBalanceException("You're trying to withdraw too much money!");
        }
        
        balance -= wd;
    }

    static void showBalance()
    {
        System.out.println("You have " + balance + "€ in your account.");
    }
}
