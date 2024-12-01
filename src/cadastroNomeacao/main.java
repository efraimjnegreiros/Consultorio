package cadastroNomeacao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cadastro do Médico
        System.out.println("=== Cadastro do Médico ===");
        System.out.print("Nome: ");
        String nomeMedico = scanner.nextLine();
        System.out.print("CPF: ");
        String cpfMedico = scanner.nextLine();
        System.out.print("Idade: ");
        int idadeMedico = scanner.nextInt();
        scanner.nextLine();  // Limpar buffer
        System.out.print("Email: ");
        String emailMedico = scanner.nextLine();
        System.out.print("Endereço: ");
        String enderecoMedico = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefoneMedico = scanner.nextLine();  // Coletando o telefone corretamente
        System.out.print("CRM/UF: ");
        String crmMedico = scanner.nextLine();
        System.out.print("Especialidade: ");
        String especialidadeMedico = scanner.nextLine();
        System.out.print("Área de atuação: ");
        String areaAtuacaoMedico = scanner.nextLine();
        System.out.print("Universidade: ");
        String universidade = scanner.nextLine();
        System.out.print("Curso: ");
        String curso = scanner.nextLine();
        System.out.print("Apresentou artigo (true/false): ");
        boolean apresentouArtigo = scanner.nextBoolean();
        scanner.nextLine();  // Limpar buffer

        // Criando o objeto Médico com todas as informações
        Medico medico = new Medico(nomeMedico, cpfMedico, idadeMedico, emailMedico, enderecoMedico, telefoneMedico, crmMedico, especialidadeMedico, areaAtuacaoMedico, universidade, curso, apresentouArtigo);

        // Cadastro do Paciente
        System.out.println("\n=== Cadastro do Paciente ===");
        System.out.print("Nome: ");
        String nomePaciente = scanner.nextLine();
        System.out.print("CPF: ");
        String cpfPaciente = scanner.nextLine();
        System.out.print("Idade: ");
        int idadePaciente = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Email: ");
        String emailPaciente = scanner.nextLine();
        System.out.print("Endereço: ");
        String enderecoPaciente = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefonePaciente = scanner.nextLine();  // Coletando telefone
        System.out.print("Número CNS: ");
        String numCNS = scanner.nextLine();
        System.out.print("Doença: ");
        String doenca = scanner.nextLine();
        System.out.print("Tempo de doença (em anos): ");
        float tempoDoenca = scanner.nextFloat();
        System.out.print("Direito a teleconsulta (true/false): ");
        boolean direitoTeleconsulta = scanner.nextBoolean();
        scanner.nextLine();  // Limpar buffer

        Paciente paciente = new Paciente(numCNS, doenca, tempoDoenca, direitoTeleconsulta, nomePaciente, cpfPaciente, idadePaciente, emailPaciente, enderecoPaciente, telefonePaciente);

        // Cadastro do Atendente
        System.out.println("\n=== Cadastro do Atendente ===");
        System.out.print("Nome: ");
        String nomeAtendente = scanner.nextLine();
        System.out.print("CPF: ");
        String cpfAtendente = scanner.nextLine();
        System.out.print("Idade: ");
        int idadeAtendente = scanner.nextInt();
        scanner.nextLine();  // Limpar buffer
        System.out.print("Email: ");
        String emailAtendente = scanner.nextLine();
        System.out.print("Endereço: ");
        String enderecoAtendente = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefoneAtendente = scanner.nextLine();  // Coletando telefone
        System.out.print("Número de identificação: ");
        int numIdentificacao = scanner.nextInt();
        System.out.print("Trabalho em casa (true/false): ");
        boolean trabalhoEmCasa = scanner.nextBoolean();

        Atendente atendente = new Atendente(numIdentificacao, trabalhoEmCasa, nomeAtendente, cpfAtendente, idadeAtendente, emailAtendente, enderecoAtendente, telefoneAtendente);

        // Exibição dos dados
        System.out.println("\n=== Dados do Médico ===");
        medico.apresentarDadosAcademicos();

        System.out.println("\n=== Dados do Paciente ===");
        System.out.println("Nome: " + paciente.getNome());
        System.out.println("Consultas Anteriores:");
        paciente.listarConsultasAnteriores();

        System.out.println("\n=== Dados do Atendente ===");
        System.out.println("Nome: " + atendente.getNome());

        scanner.close();
    }
}
