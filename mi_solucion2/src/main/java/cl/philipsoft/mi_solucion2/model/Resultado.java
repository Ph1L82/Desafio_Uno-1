package cl.philipsoft.mi_solucion2.model;

import java.util.List;

public class Resultado {
    String id;
    String fechaCreacion;
    String fechaFin;
    List<String> fechasRecibidas;
    List<String> fechasFaltantes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public List<String> getFechasRecibidas() {
        return fechasRecibidas;
    }

    public void setFechasRecibidas(List<String> fechasRecibidas) {
        this.fechasRecibidas = fechasRecibidas;
    }

    public List<String> getFechasFaltantes() {
        return fechasFaltantes;
    }

    public void setFechasFaltantes(List<String> fechasFaltantes) {
        this.fechasFaltantes = fechasFaltantes;
    }
}
