package academy.devdojo.maratonajava.javacore.bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.name = "Sanji";
        funcionario.age = 21;
        funcionario.wage = new double[]{1200, 987.32, 2000};
        funcionario.imprime();
        System.out.println("Media"+ funcionario.getMedia());
    }
}
