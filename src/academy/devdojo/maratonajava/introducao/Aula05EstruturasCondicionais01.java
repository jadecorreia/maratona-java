package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int age = 13;
        boolean isAutorizado = age > 17;
        // !
        if(isAutorizado){
            System.out.println("Autorizado a comprar bebida alcolica");
        }else{
            System.out.println("Nao Autorizado a comprar bebida alcolica");
        }
        /*if(isAutorizado == false){
        ou if(!isAutorizado)
            System.out.println("Nao Autorizado a comprar bebida alcolica");
         */


    }
}
