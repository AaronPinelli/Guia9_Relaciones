
package Servicios;


import entidad.*;

public class Service {
    
    public revolverDeAgua llenarRevolver(revolverDeAgua arma){
        arma.setPosicionAgua((int)(Math.random() * 7) );
        arma.setPosicionActual((int)(Math.random() * 7));
        
        
        return arma;
    }
    
    public Boolean mojar(revolverDeAgua arma){
       return arma.getPosicionAgua()== arma.getPosicionActual();             
    }
    
    public void siguienteChorro(revolverDeAgua arma){
        arma.setPosicionActual(arma.getPosicionActual() + 1);
        if(arma.getPosicionActual() > 6){
            arma.setPosicionActual(1); 
        }
    }
    

    

}
