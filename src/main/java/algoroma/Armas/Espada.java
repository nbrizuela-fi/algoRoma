package algoroma.Armas;

import algoroma.Estado.Estado;

/**
 * Espada
 */
public class Espada implements Arma {
    private int dañoBase = 500;

    public double pg(Estado estado) {
        return estado.modificarEspada(dañoBase);
    }

    public int pg_base() {
        return this.dañoBase;
    }
}
