package pitest;

public class ConverteSegundos {

    private static final int ERRO = -1;

    public int converteSegundos(int horas, int minutos, int segundos) {

        int result = ERRO;

        if ((horas >= 0) && (horas <= 23)) {

            if ((minutos >= 0) && (minutos <= 59)) {

                if ((segundos >= 0) && (segundos <= 59)) {

                    result = segundos + minutos * 60 + horas * 60 * 60;

                }

            }

        }

        return result;

    }

}