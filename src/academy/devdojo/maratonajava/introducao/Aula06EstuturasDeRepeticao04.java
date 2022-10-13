package academy.devdojo.maratonajava.introducao;

public class Aula06EstuturasDeRepeticao04 {
    public static void main(String[] args) {
        double carValue = 50000;
        for (int parc = 1; parc <= carValue; parc++){
            double vParc =  carValue / parc;
            if (vParc <= 1000 ){
                break;
            }
            System.out.println("Parcela "+ parc + " Valor da parcela " +vParc);

        }
    }


}
