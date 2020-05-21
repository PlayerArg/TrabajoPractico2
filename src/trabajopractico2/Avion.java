package trabajopractico2;

import java.util.ArrayList;

public class Avion {
    private Integer ID;
    private String estado;
    private String ubicacion;
    private String tipoAvion;
    private ArrayList <Piloto> pilotos;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTipoAvion() {
        return tipoAvion;
    }

    public void setTipoAvion(String tipoAvion) {
        this.tipoAvion = tipoAvion;
    }

    @Override
    public String toString() {
        return "ID: "+ID+"\n"+"Estado: "+estado+"\n"+"Ubicacion: "+ubicacion+"\n"+"Tipo: "+tipoAvion; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
