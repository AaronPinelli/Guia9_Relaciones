
package ejer2_guiarelaciones;

import Servicios.*;
import java.util.Scanner;
import entidad.revolverDeAgua;

public class Ejer2_guiaRelaciones {

    
    public static void main(String[] args) {
       
         
       Scanner leer = new Scanner(System.in);
        
        Service servRevolver = new Service();
        ServiceJuego servJuego = new ServiceJuego();
        ServiceJugador servJugador = new ServiceJugador();        
         
        revolverDeAgua R = new revolverDeAgua();
        
        R = servRevolver.llenarRevolver(R);
        System.out.println("Ingrese el número de jugadores");
        servJuego.llenarJuego(servJugador.CrearJugadores(leer.nextInt()), R);
        servJuego.ronda(servJugador);
        
    }
    
}
