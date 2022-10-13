package academy.devdojo.maratonajava.javacore.bintroducaometodos.dominio;

public class Funcionario {
    public String name;
    public int age;
    public double[] wage;
    private double media = 0;


        public void imprime(){
        System.out.println("--------------");
        System.out.println(this.name);
        System.out.println(this.age);
        if (wage != null){
            for(double wages: wage){
                System.out.println(wages + " ");
            }
        }
        imprimeMediaSalario();

    }
    public void imprimeMediaSalario(){
            if (wage == null){
                return;
            }
            double media = 0;
            for(double wages: wage){
                media += wages;
            }
            media /= wage.length;
        System.out.println("\nMedia salarial " + media );
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWage(double[] wage) {
        this.wage = wage;
    }
    public void setMedia(double media) {
        this.media = media;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double[] getWage() {
        return wage;
    }

    public double getMedia() {
        return media;
    }
}
