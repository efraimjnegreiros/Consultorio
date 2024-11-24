package cadastroNomeacao;

public class Paciente extends Consultorio {
    private String numCNS;
    private String doenca;
    private float tempoDoenca;
    private boolean direitoTeleconsulta;

    public Paciente(String numCNS, String doenca, float tempoDoenca, boolean direitoTeleconsulta, String nome, String cpf, int idade, String emailPessoal, String endereco, String telefone) {
        super(nome, cpf, idade, emailPessoal, endereco, telefone);
        this.numCNS = numCNS;
        this.doenca = doenca;
        this.tempoDoenca = tempoDoenca;
        this.direitoTeleconsulta = direitoTeleconsulta;
    }

    public String getNumCNS() {
        return numCNS;
    }

    public void setNumCNS(String numCNS) {
        this.numCNS = numCNS;
    }

    public String getDoenca() {
        return doenca;
    }

    public void setDoenca(String doenca) {
        this.doenca = doenca;
    }

    public float getTempoDoenca() {
        return tempoDoenca;
    }

    public void setTempoDoenca(float tempoDoenca) {
        this.tempoDoenca = tempoDoenca;
    }

    public boolean isDireitoTeleconsulta() {
        return direitoTeleconsulta;
    }

    public void setDireitoTeleconsulta(boolean direitoTeleconsulta) {
        this.direitoTeleconsulta = direitoTeleconsulta;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void consulta(Medico medico) {
        System.out.println("O paciente " + this.getNome() + " está sendo atendido por " + medico.getNome());
    }
}
