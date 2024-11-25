package cadastroNomeacao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        String nomeMedico = scanner.nextLine();
        System.out.print("CPF: ");
        String cpfMedico = scanner.nextLine();
        System.out.print("Idade: ");
        int idadeMedico = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Email: ");
        String emailMedico = scanner.nextLine();
        System.out.print("Endereço: ");
        String enderecoMedico = scanner.nextLine();
        System.out.print("CRM/UF: ");
        String crmMedico = scanner.nextLine();
        System.out.print("Especialidade: ");
        String especialidadeMedico = scanner.nextLine();
        System.out.print("Área de atuação: ");
        String areaAtuacaoMedico = scanner.nextLine();

        Medico medico = new Medico(nomeMedico, cpfMedico, idadeMedico, emailMedico, enderecoMedico, crmMedico, especialidadeMedico, areaAtuacaoMedico);

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
        String telefonePaciente = scanner.nextLine();
        System.out.print("Número CNS: ");
        String numCNS = scanner.nextLine();
        System.out.print("Doença: ");
        String doenca = scanner.nextLine();
        System.out.print("Tempo de doença (em anos): ");
        float tempoDoenca = scanner.nextFloat();
        scanner.nextLine(); 
        System.out.print("Direito a teleconsulta (true/false): ");
        boolean direitoTeleconsulta = scanner.nextBoolean();
        scanner.nextLine(); 

        Paciente paciente = new Paciente(numCNS, doenca, tempoDoenca, direitoTeleconsulta, nomePaciente, cpfPaciente, idadePaciente, emailPaciente, enderecoPaciente, telefonePaciente);

        System.out.println("\n=== Cadastro do Atendente ===");
        System.out.print("Nome: ");
        String nomeAtendente = scanner.nextLine();
        System.out.print("CPF: ");
        String cpfAtendente = scanner.nextLine();
        System.out.print("Idade: ");
        int idadeAtendente = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Email: ");
        String emailAtendente = scanner.nextLine();
        System.out.print("Endereço: ");
        String enderecoAtendente = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefoneAtendente = scanner.nextLine();
        System.out.print("Número de identificação: ");
        int numIdentificacao = scanner.nextInt();
        System.out.print("Trabalho em casa (true/false): ");
        boolean trabalhoEmCasa = scanner.nextBoolean();

        Atendente atendente = new Atendente(numIdentificacao, trabalhoEmCasa, nomeAtendente, cpfAtendente, idadeAtendente, emailAtendente, enderecoAtendente, telefoneAtendente);

        System.out.println("\n=== Interações ===");
        medico.consulta(paciente);
        atendente.consulta(paciente, medico);

        scanner.close();
    }
}
