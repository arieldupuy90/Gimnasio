package gimnasio;

import java.awt.Image;


public class Foto1 {

    private String id,name;
    private Image archivo;

    public Image getArchivo() {
        return archivo;
    }

    public void setArchivo(Image archivo) {
        this.archivo = archivo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }    

    @Override
    public String toString() {
        return this.id+" : "+this.name;
    }

}
