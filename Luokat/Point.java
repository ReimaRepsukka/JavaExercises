public class Point {
    private int x;
    private int y;
    private int minX = 0;
    private int maxX = 640;
    private int minY = 0;
    private int maxY = 480;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y, int minX, int maxX, int minY, int maxY){
        this.x = x;
        this.y = y;
        this.minX = minX;
        this.maxX = maxX;
        this.minY = minY;
        this.maxY = maxY;
    }

    public void set(int x, int y){

        //Nested if-statements shortened. 
        //Checks the coordinate limits
        this.x = x < minX ? minX : (x > maxX ? maxX : x);  
        this.y = y < minY ? minY : (y > maxY ? maxY : y);  

    }

    public void move(int x, int y){

        //Let the set method check the coordinate limits.
        set(x+this.x, y+this.y);
    }

    public String info(){
        return "(x=" + this.x + ",y=" + this.y + ")";
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getMinX() {
        return this.minX;
    }

    public int getMaxX() {
        return this.maxX;
    }

    public int getMinY() {
        return this.minY;
    }

    public int getMaxY() {
        return this.maxY;
    }


}
