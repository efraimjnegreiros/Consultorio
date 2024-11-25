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
        return this.crmUf;
    }

    public void setCrmUf(String crmUf) {
        this.crmUf = crmUf;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getAreaAtuacao() {
        return this.areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    @Override
    public void setTelefone(String telefone) {
        this.telefone = telefone;
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
}
