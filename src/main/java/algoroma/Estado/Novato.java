package algoroma.Estado;

import algoroma.Armas.Arma;

/**
 * Novato
 */
public class Novato implements Estado {

    public Estado ascender() {
        return new Senior();
    }

    public double modificarEspada(int daño) {
        return daño;

    }

    public double modificarJabalina(int daño) {
        return daño - 50;
    }

    public double modificarTridente(int daño) {
        return daño;
    }

    public double modificarEscamas(int defensa) {
        return defensa + (defensa * 0.2);
    }

    public double modificarEscudo(int defensa) {
        return defensa;
    }

    public double modificarPesada(int defensa) {
        return defensa;
    }
}
