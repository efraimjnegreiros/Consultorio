package cadastroNomeacao;

public class Main {
    public static void main(String[] args) {
        Medico medico = new Medico("Dr. João", "123.456.789-00", 40, "joao@exemplo.com", "Rua A, 123", "CRM1234", "Cardiologista", "Hospital X");
        Paciente paciente = new Paciente("123456789", "Hipertensão", 2.5f, true, "Carlos", "987.654.321-00", 55, "carlos@gmail.com", "Rua B, 456", "1234-5678");
        
        System.out.println("Médico: " + medico.getNome() + ", Especialidade: " + medico.getEspecialidade());
        System.out.println("Paciente: " + paciente.getNome() + ", Doença: " + paciente.getDoenca());
        
        medico.consulta(paciente, medico);
    }
}
