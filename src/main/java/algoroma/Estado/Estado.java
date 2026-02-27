package algoroma.Estado;

import algoroma.Armas.Arma;

/**
 * Estado
 */
public interface Estado {

    public Estado ascender();

    public double modificarEspada(int daño);

    public double modificarJabalina(int daño);

    public double modificarTridente(int daño);

    public double modificarEscamas(int defensa);

    public double modificarEscudo(int defensa);

    public double modificarPesada(int defensa);
}
