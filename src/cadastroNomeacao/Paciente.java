package cadastroNomeacao;

public class Paciente extends Consultorio{
    private String num_CNS;
    private String doenca;
    private float tempo_doenca;
    private boolean direito_teleconsulta;

    public Paciente(String num_CNS, String doenca, float tempo_doenca, boolean direito_teleconsulta){
        super(nome, cpf, idade, emailPessoal, endereco, telefone)
        this.num_CNS = num_CNS;
        this.doenca = doenca;
        this.tempo_doenca = tempo_doenca;
        this.direito_teleconsulta = direito_teleconsulta;
    }

    public String getNum_CNS() {
		return this.num_CNS;
	}

	public void setNum_CNS(String num_CNS) {
		this.num_CNS = num_CNS;
	}

	public String getDoenca() {
		return this.doenca;
	}

	public void setDoenca(String doenca) {
		this.doenca = doenca;
	}

	public float getTempo_doenca() {
		return this.tempo_doenca;
	}

	public void setTempo_doenca(float tempo_doenca) {
		this.tempo_doenca = tempo_doenca;
	}

	public boolean isDireito_teleconsulta() {
		return this.direito_teleconsulta;
	}

	public void setDireito_teleconsulta(boolean direito_teleconsulta) {
		this.direito_teleconsulta = direito_teleconsulta;
	}
}
