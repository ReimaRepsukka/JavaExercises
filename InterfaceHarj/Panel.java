public abstract class Panel implements SizableComponent {

    private int width;
    private int height;


    public Panel(int width, int height) {
        this.width = width;
        this.height = height;
    }


    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    @Override
    public void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }


    public abstract void addComponent(String componentType);

}
