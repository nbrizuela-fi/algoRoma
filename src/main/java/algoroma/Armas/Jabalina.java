package algoroma.Armas;

import algoroma.Estado.Estado;

/**
 * Javalina
 */
public class Jabalina implements Arma {

    private int dañoBase = 250;

    public double pg(Estado estado) {
        return estado.modificarJabalina(dañoBase);
    }

    public int pg_base() {
        return this.dañoBase;
    }

}
