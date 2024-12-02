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
    public void printDadosAcademicos() {
        System.out.println("Universidade: " + this.universidade);
        System.out.println("Curso: " + this.curso);
        System.out.println("Apresentou artigo? " + this.apresentouArtigo);
    }
}
