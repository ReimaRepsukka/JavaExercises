public class CD extends MusicItem{
    boolean isDoubleCd;
    public CD(String name, String artist, int time, boolean isDoubleCd){
        super(name, artist, time);
        this.isDoubleCd = isDoubleCd;
    }
}
