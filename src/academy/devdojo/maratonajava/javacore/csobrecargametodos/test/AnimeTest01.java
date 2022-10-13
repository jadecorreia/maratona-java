package academy.devdojo.maratonajava.javacore.csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
//        Sobrecarga de metodos

        anime.init("Akudama Drive", "TV", 12, "Acao");
        anime.imprime();
    }
}
