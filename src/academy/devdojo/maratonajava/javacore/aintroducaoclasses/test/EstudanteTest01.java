package academy.devdojo.maratonajava.javacore.aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        //Variavel  Obj
        // de ref.
        Estudante estudante = new Estudante();
        //      objetos
        estudante.name = "Luffy";
        estudante.age = 21;
        estudante.sex = 'M';
        System.out.println(estudante.name);
        System.out.println(estudante.age);
        System.out.println(estudante.sex);
    }
}
