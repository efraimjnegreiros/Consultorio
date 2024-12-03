package cadastroNomeacao;

public class Medico extends Consultorio {
    private String crmUf;
    private String especialidade;
    private Formacao formacao;

    public Medico(String nome, String cpf, int idade, String emailPessoal, String endereco, String telefone, String crmUf, String especialidade, Formacao formacao) {
        super(nome, cpf, idade, emailPessoal, endereco, telefone);
        this.crmUf = crmUf;
        this.especialidade = especialidade;
        this.formacao = formacao;
    }

    @Override
    public void consulta(Consultorio consultorio) {
        if (consultorio instanceof Paciente) {
            Paciente paciente = (Paciente) consultorio;
            System.out.println("O médico " + this.getNome() + " está atendendo o paciente " + paciente.getNome());
        } else {
            System.out.println("Consulta inválida.");
        }
    }

    @Override
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void apresentarFormacao() {
        formacao.apresentarFormacao();
    }
}
