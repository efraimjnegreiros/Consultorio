package cadastroNomeacao;

public class Atendente extends Consultorio{
    private int num_identificacao;
    private boolean trabalho_em_casa;

    public Atendente(int num_identificacao, boolean trabalho_em_casa){
        super(nome, cpf, idade, emailPessoal, endereco, telefone);
        this.num_identificacao = num_identificacao;
        this.trabalho_em_casa = trabalho_em_casa;
    }

    public int getNum_identificacao() {
		return this.num_identificacao;
	}

	public void setNum_identificacao(int num_identificacao) {
		this.num_identificacao = num_identificacao;
	}

	public boolean isTrabalho_em_casa() {
		return this.trabalho_em_casa;
	}

	public void setTrabalho_em_casa(boolean trabalho_em_casa) {
		this.trabalho_em_casa = trabalho_em_casa;
	}

}