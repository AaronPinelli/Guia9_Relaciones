
package entidad;

import java.util.ArrayList;


public class juego {
    
    private ArrayList<jugadorEnt> jugadores;
    private revolverDeAgua arma;

    public juego() {
    }

    public juego(ArrayList<jugadorEnt> jugadores, revolverDeAgua arma) {
        this.jugadores = jugadores;
        this.arma = arma;
    }

    public ArrayList<jugadorEnt> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<jugadorEnt> jugadores) {
        this.jugadores = jugadores;
    }

    public revolverDeAgua getArma() {
        return arma;
    }

    public void setArma(revolverDeAgua arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return "juego{" + "jugadores=" + jugadores + ", arma=" + arma + '}';
    }

    
    
    
}
