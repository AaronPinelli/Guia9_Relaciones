
package mains;

import Entidades.*;
import Servicios.*;
import java.util.ArrayList;

public class perroMain {

    
    public static void main(String[] args) {
      perrosEnt p1 = new perrosEnt();
      PerosnaEnt pers1 = new PerosnaEnt();
      perrosEnt p2 = new perrosEnt();
      PerosnaEnt pers2 = new PerosnaEnt();
      perrosService objeto = new perrosService();
      ArrayList<perrosEnt> perros = objeto.CrearPerros(p1, p2) ;
      ArrayList<PerosnaEnt> personas = objeto.CrearPersonas(pers1, pers2);
      
      objeto.asignarPerros(perros, personas);
            
      for(PerosnaEnt aux : personas){
        System.out.println(aux);
    }
      
      
      

    }
    
}
