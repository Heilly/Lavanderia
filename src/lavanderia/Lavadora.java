/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lavanderia;

/**
 *
 * @author heill
 */
public class Lavadora {
    private int idlavadora;
    private boolean disponibilidad;
    private int tiempoLavado;
    
    public Lavadora(int idLavadora){
        this.idlavadora = idLavadora;
        this.disponibilidad = true;
        this.tiempoLavado = 0;
    }

    public void Lavar(int duracion){
        if((duracion > 0) && (isDisponibilidad())){
            setDisponibilidad(false);
            setTiempoLavado(duracion);
        }
    }
    
    public void Esperar(int x){
        if (getTiempoLavado() > x){
            setTiempoLavado(getTiempoLavado()- x);
        }
        else{
            setTiempoLavado(0);
            setDisponibilidad(true);
        }  
    }
    
    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public int getTiempoLavado() {
        return tiempoLavado;
    }

    public void setTiempoLavado(int tiempoLavado) {
        this.tiempoLavado = tiempoLavado;
    }

    public int getIdlavadora() {
        return idlavadora;
    }

    public void setIdlavadora(int idlavadora) {
        this.idlavadora = idlavadora;
    }
    

}
