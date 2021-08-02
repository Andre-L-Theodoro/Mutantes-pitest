package pitest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import pitest.ConverteSegundos;

public class converteSegundostest {
    
    ConverteSegundos cv = new ConverteSegundos();

    @Test
    public void deve_retornar_o_tempo_em_segundos_caso_seja_enviado_hora_minutos_segundos() {
        assertEquals(5420, cv.converteSegundos(1, 30, 20));
    }

    @Test
    public void deve_retornar_o_tempo_em_segundos_caso_seja_enviado_minutos_segundos() {
        assertEquals(1820, cv.converteSegundos(0, 30, 20));
    }

    @Test
    public void deve_retornar_o_tempo_em_segundos_caso_seja_enviado_segundos() {
        assertEquals(20, cv.converteSegundos(0, 0, 20));
    }

    @Test
    public void deve_retornar_erro_quando_horas_menor_que_zero() {
        assertEquals(-1, cv.converteSegundos(-5, 30, 20));
    }

     @Test
     public void deve_retornar_erro_quando_minutos_menor_que_zero() {
         assertEquals(-1, cv.converteSegundos(1, -10, 20));
     }

     @Test
     public void deve_retornar_erro_quando_segundos_menor_que_zero() {
         assertEquals(-1, cv.converteSegundos(1, 30, -20));
     }

     @Test
     public void deve_retornar_erro_quando_horas_maior_que_vinter_e_tres() {
         assertEquals(-1, cv.converteSegundos(25, 30, 20));
     }

     @Test
     public void deve_retornar_erro_quando_minutos_maior_que_sesenta() {
         assertEquals(-1, cv.converteSegundos(1, 65, 20));
     }

     @Test
     public void deve_retornar_erro_quando_segundos_maior_que_sesenta() {
         assertEquals(-1, cv.converteSegundos(1, 30, 80));
     }

}
