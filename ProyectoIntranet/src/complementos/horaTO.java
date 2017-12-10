/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complementos;

/**
 *
 * @author Alisoft
 */
public class horaTO {
    private int hora;
    private int minuto;

    public horaTO(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }
    
    private String to(int minuto) {
        if (minuto < 10) {
            return "0"+minuto;
        }
        return String.valueOf(minuto);
    }

    @Override
    public String toString() {
        return String.valueOf(to(getHora())+":"+to(getMinuto())); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    public void agregarMinutos(int i) {
        minuto+=i;
        if (minuto >=60) {
            hora++;
            minuto = 0;
        }
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }    
}
