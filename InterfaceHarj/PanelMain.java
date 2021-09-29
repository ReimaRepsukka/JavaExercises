import java.util.ArrayList;
import java.util.List;

public class PanelMain {
    public static void main(String[] args) {
        List<Panel> panels = new ArrayList<>();

        panels.add(new ColumnPanel(300 , 400));
        panels.add(new RowPanel(200, 200));
        panels.add(new ColumnPanel(300 , 150));
        panels.add(new RowPanel(100, 50));

        for (Panel panel : panels) {
           panel.addComponent("Button");
           panel.addComponent("Combobox");
        }

        for (Panel panel : panels) {
            System.out.println("Panel size is " + panel.getWidth() + "x" + panel.getHeight());
        }
    }
}
