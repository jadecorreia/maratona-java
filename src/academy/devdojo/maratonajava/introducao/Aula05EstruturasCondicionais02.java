package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        String categoria;
        int age = 13;
        if (age < 15){
            categoria = "Categoria Infantil";
        }else if (age >= 15 && age < 18){
            categoria ="Categoria Juvenil";
        }else{
            categoria = "Categoria Adulto";
        }
    }
}
