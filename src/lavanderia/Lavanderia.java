/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lavanderia;
import java.util.ArrayList;
/**
 *
 * @author heill
 */
public class Lavanderia {

    protected int idlavanderia;
    protected String namEstacion;
    protected ArrayList<Lavadora> lavadoras = new ArrayList<>();
    Lavadora l;
    
    
    
    public Lavanderia(int idLavanderia, String namEstacion){
        this.idlavanderia = idLavanderia;
        this.namEstacion = namEstacion;
    }
    
    public void AnadirLavadora(int idlavadora){
        l = new Lavadora(idlavadora);
        lavadoras.add(l);
    }
    
    public void EliminarLavadora(int idlavadora){
        l = new Lavadora(idlavadora);
        for (int i = 0; i < lavadoras.size(); i++) {
            if (lavadoras.get(i).getIdlavadora() == idlavadora) {
                lavadoras.remove(i);
                System.out.println("Se elimino: " + lavadoras.get(i).getIdlavadora() );
            }
        }
    }
    
    public int CantidadLavadora(){
        return lavadoras.size();
    }
    

    
    
}
