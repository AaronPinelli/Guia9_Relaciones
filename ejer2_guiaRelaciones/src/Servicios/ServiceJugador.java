
package Servicios;


import entidad.*;
import java.util.*;


public class ServiceJugador {
    ArrayList<jugadorEnt> jugadores = new ArrayList();
    Service R = new Service();
    Scanner leer = new Scanner(System.in);
    public ArrayList<jugadorEnt> CrearJugadores(int cantJugadores){
        for (int i = 0; i < cantJugadores; i++) {
            jugadorEnt j1 = new jugadorEnt();
            System.out.println("Ingrese el jugador numero " + (i + 1));
            j1.setId(i+1);
            System.out.println("Ingrese el nombre del jugador " + (i+1));
            j1.setNombre(leer.next());
            j1.setMojado(true);
            jugadores.add(j1);
        }
             return jugadores;
    }
    public Boolean disparo(revolverDeAgua arma, jugadorEnt j1){
        System.out.println("Apuntando al jugador " + j1.getNombre());
        if(R.mojar(arma)){
            System.out.println("El jugador esta mojado");
            j1.setMojado(false);
        }else{
            System.out.println("Este jugador esta salvado");
            j1.setMojado(true);
        }
        if(j1.isMojado() == false){
            System.out.println(j1.getNombre() + "  perdio");
            System.out.println("--Se acaba el juego.--");
        }
        R.siguienteChorro(arma);
        return j1.isMojado();
    }
    
}
