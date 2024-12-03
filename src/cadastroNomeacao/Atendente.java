package cadastroNomeacao;

public class Atendente extends Consultorio {
    private int numIdentificacao;
    private boolean trabalhoEmCasa;

    public Atendente(String nome, String cpf, int idade, String emailPessoal, String endereco, String telefone, int numIdentificacao, boolean trabalhoEmCasa) {
        super(nome, cpf, idade, emailPessoal, endereco, telefone);
        this.numIdentificacao = numIdentificacao;
        this.trabalhoEmCasa = trabalhoEmCasa;
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
}
