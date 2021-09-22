public class CD extends MusicItem {
    private boolean isDoubleCd;

    public CD(String name, String artist, int time, boolean isDoubleCd){
        super(name, artist, time);
        this.isDoubleCd = isDoubleCd;
    }
}
