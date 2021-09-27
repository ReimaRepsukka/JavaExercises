public class ColumnPanel extends Panel{

    public ColumnPanel(int width, int height) {
        super(width, height);
    }

    @Override
    public void addComponent(String componentType) {
        System.out.println("Adding component " + componentType +
        " into new column.");
    }
    
}
