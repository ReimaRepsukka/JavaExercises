import java.util.Scanner;

public class BankAccount {

    static double balance = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {    
        start();      
    }

    static void start()
    {
        System.out.println("Welcome! Please give the default balance:");
        balance = Double.parseDouble(scanner.nextLine());
        menu();
    }

    static void menu()
    {
        int selection;
        do{
            System.out.println("*************");
            System.out.println("1 Deposit");
            System.out.println("2 Withdraw");
            System.out.println("3 Show balance");
            System.out.println("4 Quit");
            System.out.println("*************");
            selectAction( selection = Integer.parseInt(scanner.nextLine()) );
        }while(selection != 4);
    }

    static void selectAction(int selection)
    {
        try{
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
        }catch(BankAccountBalanceException e){
            System.out.println(e.getMessage());
        }
    }

    static void deposit()
    {
        System.out.println("How much you want to deposit?");
        try {
            balance += Double.parseDouble(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("Input is not a decimal number");
        }
       
    }

    static void withdraw() throws BankAccountBalanceException
    {
        double amount = 0;
        System.out.println("How much you want to withdraw?");
        try {
            amount  =  Double.parseDouble(scanner.nextLine());
            if(balance-amount < 0){
                throw new BankAccountBalanceException("Not enough money");
            }
            balance -= amount;

        } catch (Exception e) {
            System.out.println("Input is not a decimal number");
        }
       
        
    }

    static void showBalance()
    {
        System.out.println("You have " + balance + "€ in your account.");
    }
}
