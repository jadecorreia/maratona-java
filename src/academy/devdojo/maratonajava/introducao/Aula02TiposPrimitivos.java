package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int age = 7;
        long numeroGrande = 100000L;
        double salarioDouble = 2000.0D;
        float salarioFloat = 2500.0F;
        byte idadeByte = 10;
        short idadeShort = 20;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 65;
        var name2 = "Vegeta";
        // string don't is a primitive type but is a class
        String name = "Jade";
        System.out.println("A idade eh: " + age + " anos");
        System.out.println(verdadeiro);
        System.out.println("char " + caractere);
        System.out.println("Oi, meu nome eh: " + name);
    }
}
