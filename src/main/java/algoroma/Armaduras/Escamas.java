package algoroma.Armaduras;

import algoroma.Estado.Estado;

/**
 * Escamas
 */
public class Escamas implements Armadura {
    private int defensaBase = 500;

    public double defensa(Estado estado) {
        return estado.modificarEscamas(defensaBase);
    }

}
