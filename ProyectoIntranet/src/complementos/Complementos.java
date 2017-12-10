/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complementos;

import java.awt.Color;

/**
 *
 * @author Alisoft
 */
public class Complementos {
    
    public static Color combinarColores(Color a, Color b){
        return new Color(
                        (int) (a.getRed()+b.getRed())/2 ,
                        (int) (a.getGreen()+b.getGreen())/2 ,
                        (int) (a.getBlue()+b.getBlue())/2 
                );
    }
    
}
