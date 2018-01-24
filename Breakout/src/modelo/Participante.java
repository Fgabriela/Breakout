package modelo;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Participante implements Serializable {

    @Id
    private int id;
    private String nombre;

    public Participante() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return id + " | " + nombre;
    }

}
