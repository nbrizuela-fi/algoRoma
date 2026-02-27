package algoroma.Gladiadores;

import java.util.ArrayList;
import java.util.Arrays;

import algoroma.Armaduras.*;
import algoroma.Armas.*;
import algoroma.Estado.*;

/**
 * Gladidador
 */
public class Gladiador {

    private ArrayList<Arma> armas;
    private Armadura armadura;
    private Estado estado;
    private String nombre;

    public Gladiador(Arma... armas) {
        this.armas = new ArrayList<>(Arrays.asList(armas));
        this.armadura = new Escudo();
        this.estado = new Novato();

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void obtenerArmadura(Armadura aramdura) {

        this.armadura = aramdura;
    }

    public double calcularDaño() {
        return (0.6 * this.pg()) + (0.4 * this.defensa());// escudo
    }

    public double defensa() {
        return this.armadura.defensa(this.estado);
    }

    public int pg() {
        int sumador = 0;
        for (Arma arma : armas) {
            sumador += arma.pg(this.estado);

        }
        return sumador;
    }

    public int pg_base() {
        return this.armas.stream().mapToInt(arma -> arma.pg_base()).sum();
    }

    public Gladiador pelearContra(Gladiador otro) {
        if (this.calcularDaño() > otro.calcularDaño()) {
            return this;
        }
        return otro;
    }

    public void ascender() {

        this.estado = this.estado.ascender();
    }
}
