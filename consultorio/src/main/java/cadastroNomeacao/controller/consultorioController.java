package cadastroNomeacao.controller;

import cadastroNomeacao.Paciente;
import cadastroNomeacao.service.PacienteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class PacienteController {

    private final PacienteService pacienteService;

    public PacienteController(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }

    @GetMapping("/cad_paciente")
    public String exibirFormularioCadastroPaciente(Model model) {
        model.addAttribute("paciente", new Paciente());
        return "cadastro_paciente"; // Nome do arquivo HTML
    }

    @PostMapping("/cad_paciente")
    public String salvarPaciente(@ModelAttribute("paciente") Paciente paciente) {
        pacienteService.salvarPaciente(paciente);
        return "redirect:/cad_paciente";
    }
}