package cadastroNomeacao;

public class Main {
    public static void main(String[] args) {
        Medico medico = new Medico("Dr. João", "123.456.789-00", 40, "joao@exemplo.com", "Rua A, 123", "CRM1234", "Cardiologista", "Hospital X");
        Paciente paciente = new Paciente("123456789", "Hipertensão", 2.5f, true, "Carlos", "987.654.321-00", 55, "carlos@gmail.com", "Rua B, 456", "1234-5678");
        Atendente atendente = new Atendente(101, true, "Maria", "321.654.987-00", 30, "maria@exemplo.com", "Rua C, 789", "9876-5432");

        medico.setTelefone("9876-1234");
        paciente.setTelefone("9876-4321");

        medico.consulta(paciente);
        paciente.consulta(medico);
        atendente.consulta(medico);
    }
}
