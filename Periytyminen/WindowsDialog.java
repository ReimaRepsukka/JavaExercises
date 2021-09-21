public class WindowsDialog extends Dialog{
    
    public WindowsDialog(int width, int height){
        super(width, height, "Win");
    }

    public int getTruePixels(){
        return this.width * (this.height+10);
    }
}
