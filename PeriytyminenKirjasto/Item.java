public class Item {

    private static int idCounter;
    private int id;
    private String name;
    protected int loantime;
    private boolean onLoan;
    private String lender;

    public Item(String name){
        this.name = name;
        this.id = idCounter++;
    }

    public void lend(String lenderName){
        this.lender = lenderName;
        this.loantime = 14;
        this.onLoan = true;
    }

}
