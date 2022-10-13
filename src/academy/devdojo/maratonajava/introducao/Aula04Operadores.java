package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int n1 = 10;
        int n2 = 20;
        int resultSub = n2 - n1;
        int resultSom = n1 + n2;
        int resultMult = n1 * n2;
        int resultDiv = n2 / n1;

        System.out.println(resultSub);
        System.out.println(resultSom);
        System.out.println(resultMult);
        System.out.println(resultDiv);

        //%
        int resto = 21 % 7;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10.0;
        boolean isDezDiferenteDez = 10 != 10.0;
        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezIgualVinte "+isDezIgualVinte);
        System.out.println("isDezIgualDez "+isDezIgualDez);
        System.out.println("isDezDiferenteDez "+isDezDiferenteDez);

        // && (and), || (or), ! (not)
        int age = 29;
        float wage = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = age >= 30 && wage >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = age < 30 && wage >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente >= valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel);

        /* atribuicao
        = += -= *= /= %=
         */
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        // ++ --
        int contador = 0;
        contador += 1; // contador = contador + 1;
        contador ++;
        contador --;
        ++contador;
        --contador;
        int contador2 = 0;
        System.out.println(contador2++);
        System.out.println(contador2);

    }
}
