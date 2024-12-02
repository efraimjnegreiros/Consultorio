package cadastroNomeacao;

import java.util.ArrayList;
import java.util.List;

// Se trata de uma agregação porque é parte do histórico do paciente e não é tão essencial em uma consulta
public class Paciente extends Consultorio {
    private String num_CNS;
    private String doenca;
    private float tempo_doenca;
    private boolean direito_teleconsulta;
    private List<ConsultaAnterior> consultasAnteriores;

    public Paciente(String num_CNS, String doenca, float tempo_doenca, boolean direito_teleconsulta, String nome, String cpf, int idade, String emailPessoal, String endereco, String telefone) {
        super(nome, cpf, idade, emailPessoal, endereco, telefone);
        this.num_CNS = num_CNS;
        this.doenca = doenca;
        this.tempo_doenca = tempo_doenca;
        this.direito_teleconsulta = direito_teleconsulta;
        this.consultasAnteriores = new ArrayList<>();
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

    @Override
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public void consulta(Consultorio consultorio) {
        System.out.println("Consulta realizada pelo Paciente: " + this.getNome());
        // Adicione lógica de consulta aqui, se necessário
    }

    public void adicionarConsultaAnterior(String data, String nomeMedico, boolean estavaDoente, String doenca) {
        this.consultasAnteriores.add(new ConsultaAnterior(data, nomeMedico, estavaDoente, doenca));
    }

    public List<ConsultaAnterior> getConsultasAnteriores() {
        return this.consultasAnteriores;
    }

    public void listarConsultasAnteriores() {
        System.out.println("Consultas anteriores do paciente " + this.getNome() + ":");
        for (ConsultaAnterior consulta : consultasAnteriores) {
            System.out.println(consulta);
        }
    }

    public static class ConsultaAnterior {
        private String data;
        private String nomeMedico;
        private boolean estavaDoente;
        private String doenca;

        public ConsultaAnterior(String data, String nomeMedico, boolean estavaDoente, String doenca) {
            this.data = data;
            this.nomeMedico = nomeMedico;
            this.estavaDoente = estavaDoente;
            this.doenca = doenca;
        }

        @Override
        public String toString() {
            return "Data: " + data + ", Médico: " + nomeMedico + ", Estava doente: " + estavaDoente + ", Doença: " + doenca;
        }
    }
}
