
package Entidades;


public class cartaEnt {
    
    public int numero;
    public String palo;

    public cartaEnt() {
    }

    public cartaEnt(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return  "   [" + "numero=" + numero + ", palo=" + palo + "]";
    }
    
    
    
    
}
