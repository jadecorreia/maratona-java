package academy.devdojo.maratonajava.javacore.gassociacao.test;

import academy.devdojo.maratonajava.javacore.gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Pele");
        Time time = new Time("Brazil");
        Jogador[] jogadors = {jogador, jogador2};

        jogador.setTime(time);
        jogador2.setTime(time);

        time.setJogadors(jogadors);

        System.out.println("-----Jogador-----");

        jogador.imprime();

        System.out.println("------Time-----");

        time.imprime();
    }
}
