package algoroma.Estado;

/**
 * Leyenda
 */
public class Leyenda implements Estado {

    public Estado ascender() {
        return this;
    }

    public double modificarEspada(int daño) {
        return daño + (daño * 0.50);
    }

    public double modificarJabalina(int daño) {
        return daño * 2;
    }

    public double modificarTridente(int daño) {
        return daño + 500;
    }

    public double modificarEscamas(int defensa) {
        return defensa + 750;
    }

    public double modificarEscudo(int defensa) {
        return defensa * 2;
    }

    public double modificarPesada(int defensa) {
        return 750;
    }
}
