package academy.devdojo.maratonajava.javacore.aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.name = "Toyota";
        carro.model = "Sedan";
        carro.year = 1999;

        carro2.name = "Fiat";
        carro2.model = "Uno";
        carro2.year = 2005;

        carro = carro2;

        System.out.println("Carro 1 : " + carro.name+", modelo: "+ carro.model+", ano: "+ carro.year);
        System.out.println("-------------");
        System.out.println("Carro 2 : " + carro2.name+", modelo: "+ carro2.model+", ano: "+ carro2.year);


    }

}
