package algoroma.Armas;

import algoroma.Estado.Estado;

/**
 * Tridente
 */
public class Tridente implements Arma {

    private int dañoBase = 1000;

    public double pg(Estado estado) {
        return estado.modificarTridente(dañoBase);
    }

    public int pg_base() {
        return dañoBase;
    }
}
