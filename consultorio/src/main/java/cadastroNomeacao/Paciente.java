package cadastroNomeacao;

import java.util.ArrayList;
import java.util.List;

public class Paciente extends Consultorio {
    private int numCNS;
    private String doenca;
    private String tempoDoenca;
    private boolean direitoTeleconsulta;
    private List<ConsultaAnterior> consultasAnteriores;

    public Paciente(String nome, String cpf, int idade, String emailPessoal, String endereco, String telefone, int numCNS, String doenca, String tempoDoenca, boolean direitoTeleconsulta) {
        super(nome, cpf, idade, emailPessoal, endereco, telefone);
        this.numCNS = numCNS;
        this.doenca = doenca;
        this.tempoDoenca = tempoDoenca;
        this.direitoTeleconsulta = direitoTeleconsulta;
        this.consultasAnteriores = new ArrayList<>();
    }

    @Override
    public void consulta(Consultorio consultorio) {
        if (consultorio instanceof Medico) {
            Medico medico = (Medico) consultorio;
            System.out.println("Paciente " + this.getNome() + " está sendo atendido pelo médico " + medico.getNome());
        } else {
            System.out.println("Consulta inválida.");
        }
    }

    @Override
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void adicionarConsultaAnterior(ConsultaAnterior consulta) {
        this.consultasAnteriores.add(consulta);
    }

    public void listarConsultasAnteriores() {
        if (consultasAnteriores.isEmpty()) {
            System.out.println("Este paciente não tem consultas anteriores registradas.");
        } else {
            System.out.println("Consultas anteriores do paciente " + this.getNome() + ":");
            for (ConsultaAnterior consulta : consultasAnteriores) {
                System.out.println(consulta);
            }
        }
    }

    // Getters e setters
    public int getNumCNS() {
        return numCNS;
    }

    public void setNumCNS(int numCNS) {
        this.numCNS = numCNS;
    }

    public String getDoenca() {
        return doenca;
    }

    public void setDoenca(String doenca) {
        this.doenca = doenca;
    }

    public String getTempoDoenca() {
        return tempoDoenca;
    }

    public void setTempoDoenca(String tempoDoenca) {
        this.tempoDoenca = tempoDoenca;
    }

    public boolean isDireitoTeleconsulta() {
        return direitoTeleconsulta;
    }

    public void setDireitoTeleconsulta(boolean direitoTeleconsulta) {
        this.direitoTeleconsulta = direitoTeleconsulta;
    }
}
