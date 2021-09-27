public class RowPanel extends Panel{
    public RowPanel(int width, int height) {
        super(width, height);
    }

    @Override
    public void addComponent(String componentType) {
        System.out.println("Adding component " + componentType +
        " into new row.");
    }
}
