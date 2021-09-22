public class Item{
    private static int idCounter = 0;

    private int id;
    private String name;
    protected int loanTime;
    private boolean onLoan;
    private String lender;

    public Item(String name){
        this.id = idCounter++;
    }

    public void lend(String lender){
        this.lender = lender;
        this.onLoan = true;
        this.loanTime = 14;
    }
}