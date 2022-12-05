
package Servicios;


import entidad.*;
import java.util.*;


public class ServiceJuego {
    
    juego J = new juego();
    Scanner leer = new Scanner(System.in);
    
    public void llenarJuego(ArrayList<jugadorEnt> jugadores, revolverDeAgua arma){
        J.setJugadores(jugadores);
        J.setArma(arma);
    }
    
    public void ronda(ServiceJugador jugador){
        int cont = 0;
        String op = "S";
        
        while(jugador.disparo(J.getArma(),J.getJugadores().get(cont)) && op.equalsIgnoreCase("s")){
            cont++;
            System.out.println("Quiere pasar al siguiente jugador?");
            op = leer.next();
            if(cont >= J.getJugadores().size()){
                cont = 0;
            }
                
        }
                     
                     
                     
                     
    }
    
    
    
}
