package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionaisExercicio {
    public static void main(String[] args) {
        double wage = 45000;
        double impost1 = (9.7 / 100);
        double impost2 = (37.35 / 100);
        double impost3 = (49.50 / 100);

        if (wage < 34713){
            wage *= impost1;
        }else if (wage >= 34713 && wage <68508 ){
            wage *= impost2;
        }else {
            wage *= impost3;
        }
        System.out.println("Você vai pagar " + wage + " de imposto");

    }
}

