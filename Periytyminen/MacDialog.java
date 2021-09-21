public class MacDialog extends Dialog{
    public MacDialog(int width, int height){
        super(width, height, "Mac");
    }

    public int getTruePixels(){
        return this.width * (this.height+5);
    }
}
