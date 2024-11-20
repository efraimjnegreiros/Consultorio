public class Medico extends Consultorio {
    private String crmUf;
    private String especialidade;
    private String areaAtuacao;

    public Medico(String nome, String cpf, int idade, String emailPessoal, String endereco, String crmUf, String especialidade, String areaAtuacao) {
        super(nome, cpf, idade, emailPessoal, endereco);
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

    public void setTelefone(String telefone) {
        super.setTelefone(telefone);
    }

    public void consulta(Paciente paciente, Medico medico) {
        System.out.println("O médico " + this.getNome() + " está atendendo o paciente " + paciente.getNome());
    }

    public static void main(String[] args) {
        Medico medico = new Medico("Dr. João", "123.456.789-00", 40, "joao@exemplo.com", "Rua A, 123", "CRM1234", "Cardiologista", "Hospital X");
        System.out.println("Médico: " + medico.getNome());
        System.out.println("Especialidade: " + medico.getEspecialidade());
    }
}
