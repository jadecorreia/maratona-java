package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double wage = 6000;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo ";
        String mensagemNaoDoar = "Ainda nao tengo condicoes, mas vou ter!";
        // Tenario (condicao) ? verdadeiro : falso;
        String result = wage > 5000 ? mensagemDoar  : mensagemNaoDoar;
        System.out.println(result);
    }
}
