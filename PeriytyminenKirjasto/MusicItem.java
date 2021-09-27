public class MusicItem extends Item {
    private String artist;
    private int time;
    
    public MusicItem(String name, String artist, int time){
        super(name);
    }

    @Override
    public void lend(String lenderName) {
        super.lend(lenderName);
        super.loantime = 7;
    }
}
