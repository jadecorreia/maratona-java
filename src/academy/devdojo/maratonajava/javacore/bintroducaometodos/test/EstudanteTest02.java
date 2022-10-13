package academy.devdojo.maratonajava.javacore.bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.name = "Mido";
        estudante01.age = 16;
        estudante01.sex = 'F';

        estudante02.name = "Goku";
        estudante02.age = 26;
        estudante02.sex = 'M';

        estudante01.imprime();
        estudante02.imprime();
    }
}
