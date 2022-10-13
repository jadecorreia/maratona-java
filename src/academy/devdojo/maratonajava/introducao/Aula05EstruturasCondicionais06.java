package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        byte day = 6;
        switch (day){
            case 1:
            case 7:
                System.out.println("Fim de semana");
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia Util");
                break;
            default:
                System.out.println("Opçao Ivalida");
                break;
        }

    }
}
