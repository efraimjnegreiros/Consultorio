package cadastroNomeacao;

public class Medico extends Consultorio {
    private String crmUf;
    private String especialidade;
    private String areaAtuacao;

    public Medico(String nome, String cpf, int idade, String emailPessoal, String endereco, String crmUf, String especialidade, String areaAtuacao) {
        super(nome, cpf, idade, emailPessoal, endereco, "");
        this.crmUf = crmUf;
        this.especialidade = especialidade;
        this.areaAtuacao = areaAtuacao;
    }

    public String getCrmUf() {
        return crmUf;
    }

    public void setCrmUf(String crmUf) {
        this.crmUf = crmUf;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void consulta(Medico medico) {
        System.out.println("O médico " + this.getNome() + " está atendendo o paciente.");
    }
}
