package algoroma.Estado;

/**
 * Senior
 */
public class Senior implements Estado {

    public Estado ascender() {
        return new Senior();// tengoq ue cambiarlo al otro
    }

    public double modificarEspada(int daño) {
        return daño + (daño * 0.25);

    }

    public double modificarJabalina(int daño) {
        return daño;
    }

    public double modificarTridente(int daño) {
        return daño;
    }

    public double modificarEscamas(int defensa) {
        return defensa;
    }

    public double modificarEscudo(int defensa) {
        return defensa;
    }
}
