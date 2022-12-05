
package entidad;


public class revolverDeAgua {
    private int posicionActual,PosicionAgua;

    public revolverDeAgua() {
    }

    public revolverDeAgua(int posicionActual, int PosicionAgua) {
        this.posicionActual = posicionActual;
        this.PosicionAgua = PosicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return PosicionAgua;
    }

    public void setPosicionAgua(int PosicionAgua) {
        this.PosicionAgua = PosicionAgua;
    }

    @Override
    public String toString() {
        return "revolverDeAgua{" + "posicionActual=" + posicionActual + ", PosicionAgua=" + PosicionAgua + '}';
    }
    
    
    
}
