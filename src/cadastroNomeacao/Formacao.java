package cadastroNomeacao;

public class Formacao {
    private String universidade;
    private String curso;
    private boolean apresentouArtigo;

    public Formacao(String universidade, String curso, boolean apresentouArtigo) {
        this.universidade = universidade;
        this.curso = curso;
        this.apresentouArtigo = apresentouArtigo;
    }

    public void apresentarFormacao() {
        System.out.println("Universidade: " + universidade);
        System.out.println("Curso: " + curso);
        System.out.println("Apresentou artigo científico: " + apresentouArtigo);
    }
}
