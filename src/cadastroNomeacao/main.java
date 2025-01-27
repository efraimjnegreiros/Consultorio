package cadastroNomeacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    private static List<Paciente> pacientes = new ArrayList<>();
    private static List<Medico> medicos = new ArrayList<>();
    private static List<Atendente> atendentes = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar Paciente");
            System.out.println("2 - Adicionar Médico");
            System.out.println("3 - Adicionar Atendente");
            System.out.println("4 - Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarPaciente(scanner);
                    break;
                case 2:
                    adicionarMedico(scanner);
                    break;
                case 3:
                    adicionarAtendente(scanner);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    public static void adicionarPaciente(Scanner scanner) {
        System.out.println("Digite o nome do paciente:");
        String nome = scanner.nextLine();

        System.out.println("Digite o CPF do paciente:");
        String cpf = scanner.nextLine();

        System.out.println("Digite a idade do paciente:");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o e-mail pessoal do paciente:");
        String emailPessoal = scanner.nextLine();

        System.out.println("Digite o endereço do paciente:");
        String endereco = scanner.nextLine();

        System.out.println("Digite o telefone do paciente:");
        String telefone = scanner.nextLine();

        System.out.println("Digite o número do CNS do paciente:");
        int numCNS = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite a doença do paciente:");
        String doenca = scanner.nextLine();

        System.out.println("Digite o tempo de doença do paciente:");
        String tempoDoenca = scanner.nextLine();

        System.out.println("O paciente tem direito à teleconsulta? (true/false):");
        boolean direitoTeleconsulta = scanner.nextBoolean();
        scanner.nextLine();

        boolean teveConsultaAnterior = false;
        System.out.println("O paciente já teve alguma consulta anterior? (true/false):");
        teveConsultaAnterior = scanner.nextBoolean();
        scanner.nextLine();

        Paciente paciente = new Paciente(nome, cpf, idade, emailPessoal, endereco, telefone, numCNS, doenca, tempoDoenca, direitoTeleconsulta);

        if (teveConsultaAnterior) {
            adicionarConsultaAnterior(scanner, paciente);
        }

        pacientes.add(paciente);
        System.out.println("Paciente adicionado com sucesso!");
    }

    public static void adicionarConsultaAnterior(Scanner scanner, Paciente paciente) {
        System.out.println("Digite a data da consulta anterior (ex: 01/01/2024):");
        String data = scanner.nextLine();

        System.out.println("Digite o nome do médico da consulta:");
        String nomeMedico = scanner.nextLine();

        System.out.println("Paciente estava doente na consulta anterior? (true/false):");
        boolean estavaDoente = scanner.nextBoolean();
        scanner.nextLine();

        System.out.println("Digite a doença diagnosticada na consulta anterior:");
        String doenca = scanner.nextLine();

        ConsultaAnterior consulta = new ConsultaAnterior(data, nomeMedico, estavaDoente, doenca);
        paciente.adicionarConsultaAnterior(consulta);
        System.out.println("Consulta anterior registrada com sucesso!");
    }

    public static void adicionarMedico(Scanner scanner) {
        System.out.println("Digite o nome do médico:");
        String nome = scanner.nextLine();

        System.out.println("Digite o CPF do médico:");
        String cpf = scanner.nextLine();

        System.out.println("Digite a idade do médico:");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o e-mail pessoal do médico:");
        String emailPessoal = scanner.nextLine();

        System.out.println("Digite o endereço do médico:");
        String endereco = scanner.nextLine();

        System.out.println("Digite o telefone do médico:");
        String telefone = scanner.nextLine();

        System.out.println("Digite o CRM do médico:");
        String crmUf = scanner.nextLine();

        System.out.println("Digite a especialidade do médico:");
        String especialidade = scanner.nextLine();

        System.out.println("Digite a universidade do médico:");
        String universidade = scanner.nextLine();

        System.out.println("Digite o curso do médico:");
        String curso = scanner.nextLine();

        System.out.println("O médico apresentou artigo científico? (true/false):");
        boolean apresentouArtigo = scanner.nextBoolean();
        scanner.nextLine();

        Formacao formacao = new Formacao(universidade, curso, apresentouArtigo);
        Medico medico = new Medico(nome, cpf, idade, emailPessoal, endereco, telefone, crmUf, especialidade, formacao);
        medicos.add(medico);
        System.out.println("Médico adicionado com sucesso!");
    }

    public static void adicionarAtendente(Scanner scanner) {
        System.out.println("Digite o nome do atendente:");
        String nome = scanner.nextLine();

        System.out.println("Digite o CPF do atendente:");
        String cpf = scanner.nextLine();

        System.out.println("Digite a idade do atendente:");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o e-mail pessoal do atendente:");
        String emailPessoal = scanner.nextLine();

        System.out.println("Digite o endereço do atendente:");
        String endereco = scanner.nextLine();

        System.out.println("Digite o telefone do atendente:");
        String telefone = scanner.nextLine();

        System.out.println("Digite o número de identificação do atendente:");
        int numIdentificacao = scanner.nextInt();

        System.out.println("O atendente trabalha em casa? (true/false):");
        boolean trabalhoEmCasa = scanner.nextBoolean();
        scanner.nextLine();

        Atendente atendente = new Atendente(nome, cpf, idade, emailPessoal, endereco, telefone, numIdentificacao, trabalhoEmCasa);
        atendentes.add(atendente);
        System.out.println("Atendente adicionado com sucesso!");
    }
}