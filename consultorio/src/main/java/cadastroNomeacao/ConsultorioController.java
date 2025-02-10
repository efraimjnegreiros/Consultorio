import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ConsultorioController {

    private List<Paciente> pacientes = new ArrayList<>();
    private List<Medico> medicos = new ArrayList<>();
    private List<Atendente> atendentes = new ArrayList<>();

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/cadastro_paciente")
    public String listarPacientes(Model model) {
        model.addAttribute("pacientes", pacientes);
        return "pacientes";
    }

    @PostMapping("/cadastro_paciente")
    public String adicionarPaciente(Paciente paciente) {
        pacientes.add(paciente);
        return "redirect:/cadastro_paciente";
    }

    @GetMapping("/medicos")
    public String listarMedicos(Model model) {
        model.addAttribute("medicos", medicos);
        return "medicos";
    }

    @PostMapping("/medicos")
    public String adicionarMedico(Medico medico) {
        medicos.add(medico);
        return "redirect:/medicos";
    }

    @GetMapping("/atendentes")
    public String listarAtendentes(Model model) {
        model.addAttribute("atendentes", atendentes);
        return "atendentes";
    }

    @PostMapping("/atendentes")
    public String adicionarAtendente(Atendente atendente) {
        atendentes.add(atendente);
        return "redirect:/atendentes";
    }
}
