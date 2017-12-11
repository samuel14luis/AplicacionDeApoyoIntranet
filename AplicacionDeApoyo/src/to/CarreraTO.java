package to;

import java.io.FileInputStream;
import java.util.Date;

/**
 *
 * @author Alisoft
 */
public class CarreraTO {
    int id, id_facultad;
    String nombre;
    Date creacion;
    FileInputStream foto;
    int long_bytes;
    int id_ciclo_max;

    public int getId_ciclo_max() {
        return id_ciclo_max;
    }

    public void setId_ciclo_max(int id_ciclo_max) {
        this.id_ciclo_max = id_ciclo_max;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_facultad() {
        return id_facultad;
    }

    public void setId_facultad(int id_facultad) {
        this.id_facultad = id_facultad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getCreacion() {
        return creacion;
    }

    public void setCreacion(Date creacion) {
        this.creacion = creacion;
    }

    public FileInputStream getFoto() {
        return foto;
    }

    public void setFoto(FileInputStream foto) {
        this.foto = foto;
    }

    public int getLong_bytes() {
        return long_bytes;
    }

    public void setLong_bytes(int long_bytes) {
        this.long_bytes = long_bytes;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
