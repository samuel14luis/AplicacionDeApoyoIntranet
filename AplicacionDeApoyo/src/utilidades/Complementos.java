/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Alisoft
 */
public class Complementos {
    public static void mostrarMensaje(String m){
        JOptionPane.showMessageDialog(null, m);
    }
    
    public static File getDirOpen(){
        JFileChooser open = new JFileChooser();
        open.showOpenDialog(open);
        return open.getSelectedFile();
    }
    
    public static File getDirOpen(FileNameExtensionFilter filtro){
        JFileChooser open = new JFileChooser();
        open.setFileFilter(filtro);
        open.showOpenDialog(open);
        return open.getSelectedFile();
    }
    
    public static File getDirSave(){
        JFileChooser save = new JFileChooser();
        save.setApproveButtonText("Guardar");
        save.showSaveDialog(null);
        return save.getSelectedFile();
    }
    
    /**
     * 
     * @param label label al que se le pondra la foto
     * @param width largo a mostrar de la foto, para el  tamaño nuevo
     * @param height alto a mostrar de la foto, para el  tamaño nuevo
     * @return FotoTO object
     * @throws Exception si hay algun error durante la ejecucion
     */
    public static FotoTO leerFotoALabel(JLabel label,int width,int height) throws Exception{
        File dir = getDirOpen(new FileNameExtensionFilter("JPG & PNG", "jpg", "png"));
        FileInputStream fis = new FileInputStream(dir);
        label.setIcon(null);     
        FotoTO foto = new FotoTO();
        foto.setFoto(fis);
        foto.setLong_bytes((int) dir.length());
        Image icono = ImageIO.read(dir).getScaledInstance(width, height, Image.SCALE_DEFAULT);
        label.setIcon(new ImageIcon(icono));
        label.updateUI();    
        return foto;
    }
    
    /*
    public static FotoTO getFotoFromLabel(JLabel label){
        
    }*/
}
