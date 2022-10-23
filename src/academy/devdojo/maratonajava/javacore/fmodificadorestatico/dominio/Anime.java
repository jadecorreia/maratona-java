package academy.devdojo.maratonajava.javacore.fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;
//    0 - Bloco de inicializacao é executado quando a JVM carregar classe
//    1 - Primeiro eh alocado espaco em memoria pro objeto
//    2 - Cada atributo de classe eh criado e inicializado com valores default ou o que for passada
//    3 - Bloco de inicializacao eh executado
//    4 - Construtor eh inicializado
    static {
        System.out.println("Dentro do bloco de inicializacao estático 1");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++){
            episodios[i] = i+1;
        }
    }
    static {
        System.out.println("Dentro do bloco de inicializacao estático 2");
    }
    static {
        System.out.println("Dentro do bloco de inicializacao estático 3");
    }

    {
        System.out.println("Dentro do bloco de inicializacao não estático 1");

    }
    public Anime(String nome){
        this.nome = nome;
    }
    public Anime(){
       for(int episodio : Anime.episodios){
       System.out.print(episodio + " ");
       }
    System.out.println();
    }


    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }


}



