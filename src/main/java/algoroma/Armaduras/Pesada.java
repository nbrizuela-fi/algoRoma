package algoroma.Armaduras;

import algoroma.Estado.Estado;

/**
 * Pesada
 */
public class Pesada implements Armadura {
    private int defensaBase = 750;

    public double defensa(Estado estado) {
        return estado.modificarPesada(this.defensaBase);
    }

}
