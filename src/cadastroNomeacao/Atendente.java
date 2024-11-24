package cadastroNomeacao;

public class Atendente extends Consultorio {
    private int numIdentificacao;
    private boolean trabalhoEmCasa;

    public Atendente(int numIdentificacao, boolean trabalhoEmCasa, String nome, String cpf, int idade, String emailPessoal, String endereco, String telefone) {
        super(nome, cpf, idade, emailPessoal, endereco, telefone);
        this.numIdentificacao = numIdentificacao;
        this.trabalhoEmCasa = trabalhoEmCasa;
    }

    public int getNumIdentificacao() {
        return numIdentificacao;
    }

    public void setNumIdentificacao(int numIdentificacao) {
        this.numIdentificacao = numIdentificacao;
    }

    public boolean isTrabalhoEmCasa() {
        return trabalhoEmCasa;
    }

    public void setTrabalhoEmCasa(boolean trabalhoEmCasa) {
        this.trabalhoEmCasa = trabalhoEmCasa;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void consulta(Medico medico) {
        System.out.println("O atendente " + this.getNome() + " está auxiliando no atendimento do paciente.");
    }
}
