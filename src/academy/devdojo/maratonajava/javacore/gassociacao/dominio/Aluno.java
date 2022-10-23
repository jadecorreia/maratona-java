package academy.devdojo.maratonajava.javacore.gassociacao.dominio;

public class Aluno {
    private String nome;
    private int age;
    private Seminario seminario;

    public Aluno(String nome, int age) {
        this.nome = nome;
        this.age = age;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
