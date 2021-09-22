public class MusicItem extends Item{

    private String artist;
    private int time;

    public MusicItem(String name, String artist, int time){
        super(name);
        this.artist = artist;
        this.time = time;
    }

    @Override
    public void lend(String lender) {
        super.lend(lender);
        super.loanTime = 7;
    }

}
