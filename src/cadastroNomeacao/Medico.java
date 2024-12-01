package cadastroNomeacao;

public class Medico extends Consultorio {
    private String crmUf;
    private String especialidade;
    private String areaAtuacao;
    private String universidade;
    private String curso;
    private boolean apresentouArtigo;

    public Medico(String nome, String cpf, int idade, String emailPessoal, String endereco, String telefone,
    String crmUf, String especialidade, String areaAtuacao, String universidade, String curso, boolean apresentouArtigo) {
        super(nome, cpf, idade, emailPessoal, endereco, telefone);
        this.crmUf = crmUf;
        this.especialidade = especialidade;
        this.areaAtuacao = areaAtuacao;
        this.universidade = universidade;
        this.curso = curso;
        this.apresentouArtigo = apresentouArtigo;
    }

    @Override
    public void setTelefone(String telefone) {
        this.telefone = telefone != null ? telefone : "Sem telefone";
    }

    @Override
    public void consulta(Consultorio consultorio) {
        System.out.println("Consulta realizada pelo médico " + this.getNome() +
                           " (CRM: " + this.crmUf + "), especialista em " + this.especialidade +
                           ". Paciente: " + consultorio.getNome());
    }

    public void apresentarDadosAcademicos() {
        System.out.println("Dados Acadêmicos do Médico:");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Universidade: " + this.universidade);
        System.out.println("Curso: " + this.curso);
        System.out.println("Apresentou Artigo? " + (this.apresentouArtigo ? "Sim" : "Não"));
    }
}
