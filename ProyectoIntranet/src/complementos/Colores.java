package complementos;

import java.awt.Color;

/**
 *
 * @author Alisoft
 */
public class Colores {
    
    
    public static final Color plomo_azulado = new Color(85, 99, 112);
    public static final Color verde_agua = new Color(78, 205, 196);
    public static final Color verde_claro = new Color(199, 244, 101);
    public static final Color rojo_claro = new Color(255, 107, 107);
    public static final Color rojo_oscuro = new Color(197, 77, 87);
    public static final Color negro_azulado = new Color(52, 73, 94);
    public static final Color negro_azulado_oscuro = new Color(44, 62, 80);
    public static final Color violeta_azulado = new Color(155, 89, 182);
    public static final Color azul = new Color(52, 152, 219);
    public static final Color amarillo_patito = new Color(241, 196, 15);
    public static final Color naranja_fuerte = new Color(231, 76, 60);
    
    public static Color[] colores = {
        plomo_azulado, 
        verde_agua, 
        verde_claro,
        rojo_claro,
        rojo_oscuro,
        negro_azulado,
        negro_azulado_oscuro,
        violeta_azulado,
        azul,
        amarillo_patito,
        naranja_fuerte
    };
    
    public static Color getColorAt(int i){
        try {
            return colores[i];
        } catch (Exception e) {
            return getColorAt(i%2);//para regresar un color valido cualquiera
        }
    }
    
}
