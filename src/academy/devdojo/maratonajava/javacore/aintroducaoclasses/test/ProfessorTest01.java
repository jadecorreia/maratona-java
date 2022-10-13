package academy.devdojo.maratonajava.javacore.aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.name = "Mestre Kami";
        professor.age = 140;
        professor.sex = 'M';

        System.out.println("Nome: " + professor.name + " ,idade: "+ professor.age + " ,sexo: "+professor.sex);
    }
}
