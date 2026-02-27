package algoroma;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import algoroma.Armaduras.*;
import algoroma.Armas.*;
import algoroma.Gladiadores.*;

/**
 * Test
 */
public class GladioTest {
    @Test
    public void test01CreoUnGladiador() {
        int pgBasico = 1000;
        Gladiador maximo = new Gladiador(new Tridente());

        assertEquals(pgBasico, maximo.pg_base());
    }

    @Test
    public void testo02UnGladiadorConDosArmas() {
        int pbTotal = 1500;

        Gladiador maximo = new Gladiador(new Tridente(), new Espada());

        assertEquals(pbTotal, maximo.pg_base());

    }

    @Test
    public void test03CalculaUnDañoBaseConEscudo() {
        double pgBasico = 660.0;
        Gladiador maximo = new Gladiador(new Tridente());
        maximo.obtenerArmadura(new Escudo());

        assertEquals(pgBasico, maximo.calcularDaño());
    }

    @Test
    public void test04UnGladiadorGana3Batallas() {

        double pgBasico = 1035.0;
        Gladiador maximo = new Gladiador(new Tridente(), new Espada());

        maximo.ascender();

        assertEquals(pgBasico, maximo.calcularDaño());

    }

    @Test
    public void test05GladiadorLegendarioCOnTRidenteJabalinaYEscamas() {
        double valorEsperado = 950.0;

        Gladiador maximo = new Gladiador(new Tridente(), new Jabalina());
        maximo.obtenerArmadura(new Escamas());

        maximo.ascender();

        assertEquals(valorEsperado, maximo.calcularDaño());
    }
}
