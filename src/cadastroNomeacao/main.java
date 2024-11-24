package cadastroNomeacao;

public class Main {
    public static void main(String[] args) {
        Medico medico = new Medico("Dr. João", "123.456.789-00", 40, "joao@gmail.com", "Rua 1", "CRM12345", "Cardiologia", "Clínico Geral");
        Paciente paciente = new Paciente("123456789", "Hipertensão", 5.0f, true, "Maria", "987.654.321-00", 35, "maria@gmail.com", "Rua 2", "9999-9999");
        Atendente atendente = new Atendente(101, true, "Carlos", "111.222.333-44", 28, "carlos@atendente.com", "Rua 3", "8888-8888");

        medico.consulta(paciente);
        paciente.consulta(medico);
        atendente.consulta(paciente);
    }
}
