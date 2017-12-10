package complementos;

import java.awt.Color;

/**
 *
 * @author Alisoft
 */
public class AtributosGUI {

    /**
     * Sintaxis: - DEFINICION DEL SIGNIFICADO DE CADA COLOR. (valor por defecto)
     * ***********************************************************************
     */
    public static Color color_principal;       // - se utiliza en paneles y fondos, es el color principal del frame. (azul claro)
    public static Color foreground_principal; //  - se utiliza para labels, color 
    public static Color color_secundario;
    public static Color color_success;
    public static Color color_error;

    /* COLORES PARA LOS ITEMS DEL MENU */
    public static Color item_mouseOver_panel;
    public static Color item_selected_panel;
    
    public static Color item_mouseOver_label_foreground;
    public static Color item_mouseExited_label_foreground;
    
    public static Color item_On_panel_active;
    public static Color item_Clicked_panel_active;
    public static Color item_Off_panel_active;
    
    public static java.awt.Font item_label_font;

    /**
     * ***********************************************************************
     */
    //0,102,255);
    //static Color color_principal = new Color(255,153,153);
    //static Color color_principal = new Color(59, 0, 59);  
    public static void setColoresEstandar() {
        /* COLORES ESTÁNDAR EN TONO AZULADO*/
        color_principal = new Color(51, 153, 255);
        foreground_principal = new Color(255, 255, 255);
        color_secundario = new Color(153, 153, 153);
        color_success = new Color(102, 209, 36);
        color_error = new Color(255, 5, 0);

        /* COLORES PARA LOS ITEMS DEL MENU */
        item_mouseOver_panel = new Color(51, 146, 248); //color del panel cuando el mouse esta encima
        item_selected_panel = new Color(33, 135, 248); //color del panel cuando el mouse esta encima
        
        item_mouseOver_label_foreground = new Color(235, 235, 245);//color de la letra cuando el mouse esta encima
        item_mouseExited_label_foreground = new Color(255, 255, 255);//color de la letra cuando el mouse sale del label
        
        item_On_panel_active = new Color(255, 255, 255);//color del ActivePanel cuando el mouse esta encima
        item_Clicked_panel_active = new Color(202, 255, 89);//color del ActivePanel cuando se ha hecho click en él
        item_Off_panel_active = new java.awt.Color(0,0,0, 0);//color del ActivePanel cuando el mouse sale del ItemPane
        
        item_label_font = new java.awt.Font("Roboto", 1, 14);//new java.awt.Font("Segoe UI", 1, 14);
    }

    public static Color getColor_principal() {
        return color_principal;
    }

    public static Color getColor_secundario() {
        return color_secundario;
    }

    public static Color getColor_success() {
        return color_success;
    }

    public static Color getColor_error() {
        return color_error;
    }

}
