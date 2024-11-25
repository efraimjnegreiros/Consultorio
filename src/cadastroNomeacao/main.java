package cadastroNomeacao;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new scanner(System.in);

        System.out.println("=== Cadastro do Médico ===");
        Medico medico = new Medico(
            input("Nome" , scanner),
            input("CPF" , scanner),
            integer.parseInt(input("Idade",scanner)),
            
            input("Email",scanner),
            input("Endereço",scanner),
            input("CRM/UF",scanner),
            input("Espeialidade",scanner),
            input("Área de atuação", scanner)
        );

        System.out.println("\n=== Cadastro do Paciente ===");
        Paciente paciente = new Paciente(
            input("Número CNS", scanner),
            input("Doença",scanner),
            Float.parseInt(input("Tempo de doença(em anos)",scanner))
            Boolean.parseBoolean(input("DIreito a teleconsulta (true/false)",scanner)),
            input("Nome",scanner),
            input("CPF",scanner),
            integer.parseInt(input("Idade",scanner)),
            input("Email",scanner),
            input("Endereço",scanner),
            input("Telefone",scanner)
        );

        System.out.println("\n=== Cadastro do Atendente ===");
        Atendente atendente = new
    }
}