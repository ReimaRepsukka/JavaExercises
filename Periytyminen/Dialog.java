public class Dialog {
    protected int width;
    protected int height;
    private String type;

    public Dialog(int width, int height){
        this(width, height, "default");
    }

    public Dialog(int width, int height, String type){
        this.width = width;
        this.height = height;
        this.type = type;
    }

    public String getInfo(){
        return  this.type + " dialog: Size = " + this.width + "x" + this.height; 
    }

}
