package academy.devdojo.maratonajava.javacore.gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("O grande software de previsao do futuro");
        System.out.println("Digite a sua pergunta que eu responderei sim ou nao");
        String pergunta = input.nextLine();
        if(pergunta.charAt(0) == ' '){
            System.out.println("Sim");
        }else{
            System.out.println("NAO");
        }
    }
}
