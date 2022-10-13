package academy.devdojo.maratonajava.javacore.bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
//        pessoa.name = "jiraya";
        pessoa.setName("Jiraya");
        pessoa.setAge(70);
//        pessoa.imprime();
        System.out.println(pessoa.getName());
        System.out.println(pessoa.getAge());
    }
}
