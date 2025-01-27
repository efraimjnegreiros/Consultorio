package cadastroNomeacao;

public class Medico extends Consultorio {
    private String crmUf;
    private String especialidade;
    private Formacao formacao;

    // Construtor
    public Medico(String nome, String cpf, int idade, String emailPessoal, String endereco, String telefone, String crmUf, String especialidade, Formacao formacao) {
        super(nome, cpf, idade, emailPessoal, endereco, telefone);
        this.crmUf = crmUf;
        this.especialidade = especialidade;
        this.formacao = formacao;
    }

    // Método consulta, que agora usa o crmUf e especialidade
    @Override
    public void consulta(Consultorio consultorio) {
        if (consultorio instanceof Paciente) {
            Paciente paciente = (Paciente) consultorio;
            System.out.println("O médico " + this.getNome() + " (" + this.crmUf + ") está atendendo o paciente " + paciente.getNome() + " na especialidade " + this.especialidade);
        } else {
            System.out.println("Consulta inválida.");
        }
    }

    // Método setTelefone
    @Override
    public void setTelefone(String telefone) {
        this.telefone = telefone; // Definindo o telefone diretamente na classe Medico
    }
    // Método para apresentar a formação do médico
    public void apresentarFormacao() {
        formacao.apresentarFormacao();
    }

    // Método toString para exibir as informações do médico
    @Override
    public String toString() {
        return "Médico: " + this.getNome() + ", CRM: " + this.crmUf + ", Especialidade: " + this.especialidade;
    }
}
