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
    protected ArrayList<Lavadora> lava = new ArrayList<>();
    Lavadora l;
    
    
    
    public Lavanderia(int idLavanderia, String namEstacion){
        this.idlavanderia = idLavanderia;
        this.namEstacion = namEstacion;
    }
    
    public void AnadirLavadora(int idlavadora){
        l = new Lavadora(idlavadora);
        lava.add(l);
    }
    
    public void EliminarLavadora(int idlavadora){
        l = new Lavadora(idlavadora);
        for (int i = 0; i < lava.size(); i++) {
            if (lava.get(i).getIdlavadora() == idlavadora) {
                lava.remove(i);
                System.out.println("Se elimino: " + lava.get(i).getIdlavadora() );
            }
        }
    }
    
    public int CantidadLavadora(){
        return lava.size();
    }
    

    
    
}
