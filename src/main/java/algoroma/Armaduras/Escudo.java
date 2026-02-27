package algoroma.Armaduras;

import algoroma.Estado.Estado;

/**
 * Escudo
 */
public class Escudo implements Armadura {

    private int defensaBasica = 150;

    public double defensa(Estado estado) {
        return estado.modificarEscudo(this.defensaBasica);
    }
}
