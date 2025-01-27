package cadastroNomeacao;

public class Atendente extends Consultorio {
    private int numIdentificacao;
    private boolean trabalhoEmCasa;

    public Atendente(String nome, String cpf, int idade, String emailPessoal, String endereco, String telefone, int numIdentificacao, boolean trabalhoEmCasa) {
        super(nome, cpf, idade, emailPessoal, endereco, telefone);  // Chama o construtor da classe pai (Consultorio)
        this.numIdentificacao = numIdentificacao;
        this.trabalhoEmCasa = trabalhoEmCasa;
    }

    // Métodos adicionais
    public void exibirInformacoes() {
        System.out.println("Nome do Atendente: " + this.getNome());
        System.out.println("Número de Identificação: " + this.numIdentificacao);
        System.out.println("Trabalho em Casa: " + (this.trabalhoEmCasa ? "Sim" : "Não"));
    }

    @Override
    public void consulta(Consultorio consultorio) {
        if (consultorio instanceof Paciente) {
            Paciente paciente = (Paciente) consultorio;
            System.out.println("O atendente " + this.getNome() + " está auxiliando no atendimento do paciente " + paciente.getNome());
        } else if (consultorio instanceof Medico) {
            Medico medico = (Medico) consultorio;
            System.out.println("O atendente " + this.getNome() + " está auxiliando no atendimento do médico " + medico.getNome());
        } else {
            System.out.println("Consulta inválida.");
        }
    }

    @Override
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getNumIdentificacao() {
        return numIdentificacao;
    }

    public boolean isTrabalhoEmCasa() {
        return trabalhoEmCasa;
    }
}
