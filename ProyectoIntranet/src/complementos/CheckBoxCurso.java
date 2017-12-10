/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complementos;

import java.awt.Color;
import javax.swing.JCheckBox;

/**
 *
 * @author Alisoft
 */
public class CheckBoxCurso {
    public JCheckBox checkbox;
    public NotasCurso curso;
    public Color color_curso;

    public CheckBoxCurso(JCheckBox checkbox, NotasCurso curso, Color color_curso) {
        this.checkbox = checkbox;
        this.curso = curso;
        this.color_curso = color_curso;
    }
    
}
