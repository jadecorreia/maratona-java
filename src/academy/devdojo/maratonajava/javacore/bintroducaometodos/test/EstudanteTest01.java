package academy.devdojo.maratonajava.javacore.bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.name = "Mido";
        estudante01.age = 16;
        estudante01.sex = 'F';

        estudante02.name = "Goku";
        estudante02.age = 26;
        estudante02.sex = 'M';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);


        System.out.println("##################");

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);


    }

}
