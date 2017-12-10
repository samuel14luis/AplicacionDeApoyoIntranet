/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complementos;

import complementos.AtributosGUI;
import javax.swing.JPanel;

/**
 *
 * @author Alisoft
 */
public class itemPanel {

    private final JPanel panel;
    private final JPanel active;
    private boolean clicked;

    public itemPanel(JPanel panel, JPanel active, boolean clicked) {
        this.panel = panel;
        this.active = active;
        this.clicked = clicked;
        if (clicked) {
            active.setBackground(AtributosGUI.item_Clicked_panel_active);
        }
    }

    public JPanel SeleccionarPanel() {
        clicked = true;
        active.setBackground(AtributosGUI.item_Clicked_panel_active);
        return panel;
    }

    public void desseleccionarPanel() {
        clicked = false;
        active.setBackground(AtributosGUI.item_On_panel_active);
    }

    public boolean isOpen() {
        return panel != null;
    }

}
