package pitest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    ConverteSegundos cs = new ConverteSegundos();

    // @Test
    // void testaSeRetornaCertoSeHoraMinuto_E_SegundoForemValidos() {
    //     assertEquals(3661, cs.converteSegundos(1, 1, 1));
    // }

    // @Test
    // void testaSeRetornaMenosUmSeHoraForInvalidos() {
    //     assertEquals(-1, cs.converteSegundos(-1, 1, 1));
    // }

    // @Test
    // void testaSeRetornaMenosUmSeMinutoForInvalidos() {
    //     assertEquals(-1, cs.converteSegundos(1, -1, 1));
    // }

    // @Test
    // void testaSeRetornaMenosUmSeSegundoForInvalidos() {
    //     assertEquals(-1, cs.converteSegundos(1, 1, -1));
    // }

    // /* adicionado depois do pitest */

    // @Test
    // void testaSeRetornaZeroUmSeTodosIgualAZero() {
    //     assertEquals(0, cs.converteSegundos(0, 0, 0));
    // }

    // @Test
    // void testaSeRetornaValidoSeTodosNoLimiteSuperior() {
    //     assertEquals(86399, cs.converteSegundos(23, 59, 59));
    // }
}
