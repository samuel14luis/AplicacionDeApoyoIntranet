package utilidades;

import java.io.FileInputStream;

/**
 *
 * @author Alisoft
 */
public class FotoTO {
    FileInputStream foto;
    int long_bytes;

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
    
    
}
