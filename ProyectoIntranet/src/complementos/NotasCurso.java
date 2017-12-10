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
public class NotasCurso {

    private String nombre, docente;
    private Double ec1, ep1, ed1;
    private Double ec2, ep2, ed2;
    private Double ec3, ep3, ed3;
    private Double ec4, ep4, ed4;
    private Double creditos;
    private int inasistencias;

    public NotasCurso(String nombre, String docente, Double creditos) {
        this.nombre = nombre;
        this.docente = docente;
        inasistencias = 0;
        this.creditos = creditos;
    }

    public Double getCreditos() {
        return creditos;
    }

    public void setCreditos(Double creditos) {
        this.creditos = creditos;
    }

    public Double getPAcumulado() {
        int cont = 0;
        Double acum = 0.0;
        Double aux = getPromedioDeModulo1();
        if (aux != null) {
            acum += aux;
            cont++;
        }
        aux = getPromedioDeModulo2();
        if (aux != null) {
            acum += aux;
            cont++;
        }
        aux = getPromedioDeModulo3();
        if (aux != null) {
            acum += aux;
            cont++;
        }
        aux = getPromedioDeModulo4();
        if (aux != null) {
            acum += aux;
            cont++;
        }
        if (cont != 0) {
            return format(acum / cont);
        } else {
            return 0.0;
        }
    }

    public Double getPromedioDeModulo1() {
        if (ec1 != null && ep1 != null && ed1 != null) {
            return format((ec1 + ep1 + ed1) / 3);
        }
        return null;
    }

    public Double getPromedioDeModulo2() {
        if (ec2 != null && ep2 != null && ed2 != null) {
            return format((ec2 + ep2 + ed2) / 3);
        }
        return null;
    }

    public Double getPromedioDeModulo3() {
        if (ec3 != null && ep3 != null && ed3 != null) {
            return format((ec3 + ep3 + ed3) / 3);
        }
        return null;
    }

    public Double getPromedioDeModulo4() {
        if (ec4 != null && ep4 != null && ed4 != null) {
            return format((ec4 + ep4 + ed4) / 3);
        }
        return null;
    }

    public Double getPuntosParaAprobar() {
        return format(getPAcumulado() - 10.5);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public Double getEc1() {
        return ec1;
    }

    public void setEc1(Double ec1) {
        this.ec1 = validarNota(ec1);
    }

    public Double getEp1() {
        return ep1;
    }

    public void setEp1(Double ep1) {
        this.ep1 = validarNota(ep1);
    }

    public Double getEd1() {
        return ed1;
    }

    public void setEd1(Double ed1) {
        this.ed1 = validarNota(ed1);
    }

    public Double getEc2() {
        return ec2;
    }

    public void setEc2(Double ec2) {
        this.ec2 = validarNota(ec2);
    }

    public Double getEp2() {
        return ep2;
    }

    public void setEp2(Double ep2) {
        this.ep2 = validarNota(ep2);
    }

    public Double getEd2() {
        return ed2;
    }

    public void setEd2(Double ed2) {
        this.ed2 = validarNota(ed2);
    }

    public Double getEc3() {
        return ec3;
    }

    public void setEc3(Double ec3) {
        this.ec3 = validarNota(ec3);
    }

    public Double getEp3() {
        return ep3;
    }

    public void setEp3(Double ep3) {
        this.ep3 = validarNota(ep3);
    }

    public Double getEd3() {
        return ed3;
    }

    public void setEd3(Double ed3) {
        this.ed3 = validarNota(ed3);
    }

    public Double getEc4() {
        return ec4;
    }

    public void setEc4(Double ec4) {
        this.ec4 = validarNota(ec4);
    }

    public Double getEp4() {
        return ep4;
    }

    public void setEp4(Double ep4) {
        this.ep4 = validarNota(ep4);
    }

    public Double getEd4() {
        return ed4;
    }

    public void setEd4(Double ed4) {
        this.ed4 = validarNota(ed4);
    }

    public int getInasistencias() {
        return inasistencias;
    }

    public void setInasistencias(int inasistencias) {
        this.inasistencias = inasistencias;
    }

    public static Double format(double d) {
        return (double) Math.round(d * 10d) / 10d;
    }

    public static Double validarNota(Double nota) {
        if (nota >= 2020.0) {
            return 20.0;
        } else if (nota <= 0.0) {
            return 0.0;
        } else {
            return nota;
        }
    }
}
