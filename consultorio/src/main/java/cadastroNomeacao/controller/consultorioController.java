package cadastroNomeacao.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.spring.framework.web.bin.annotation.GetMapping;

@controller
public class PacienteController{
    @GetMapping("/cad_paciente")
    public String cadastrarPaciente(){
        return "cadastro_paciente"
    }
}