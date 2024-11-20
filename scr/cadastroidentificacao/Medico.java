public class Medico extends Consultorio {
    private String especialidade;

    public Medico(String nome, String cpf, int idade, String emailPessoal, String endereco, String especialidade) {
        super(nome, cpf, idade, emailPessoal, endereco);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public void setTelefone(String telefone) {
        super.setTelefone(telefone); // Pode adicionar validações se necessário
    }
    public void consulta(Paciente paciente, Medico medico) {
        System.out.println("Médico " + this.getNome() + " atendendo o paciente " + paciente.getNome());
    }
}
