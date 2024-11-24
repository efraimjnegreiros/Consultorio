package cadastroNomeacao;

public class Atendente extends Consultorio {
    private int numIdentificacao;
    private boolean trabalhoEmCasa;

    public Atendente(String nome, String cpf, int idade, String emailPessoal, String endereco, int numIdentificacao, boolean trabalhoEmCasa) {
        super(nome, cpf, idade, emailPessoal, endereco);
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

    public void consulta(Paciente paciente) {
        System.out.println("O atendente está auxiliando o paciente: " + paciente.getNome());
    }
}