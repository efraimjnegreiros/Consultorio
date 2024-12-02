package cadastroNomeacao;

public class Medico extends Consultorio {
    private String crmUf;
    private String especialidade;
    private String areaAtuacao;
    private Formacao formacao;
// Se trata de uma agregação porque é parte do médico e não é essencial em uma consulta do médico
    public Medico(String nome, String cpf, int idade, String emailPessoal, String endereco, String telefone,
    String crmUf, String especialidade, String areaAtuacao, Formacao formacao) {
        super(nome, cpf, idade, emailPessoal, endereco, telefone);
        this.crmUf = crmUf;
        this.especialidade = especialidade;
        this.areaAtuacao = areaAtuacao;
        this.formacao = formacao;
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

    public void apresentarFormacao() {
        if (formacao != null) {
            formacao.printDadosAcademicos();
        } else {
            System.out.print("Nenhuma Formação Associada ao Médico");
        }
        
    }
}
