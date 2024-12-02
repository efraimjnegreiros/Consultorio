package cadastroNomeacao;

public class ConsultaAnterior {
    private String data;
    private String nomeMedico;
    private boolean estavaDoente;
    private String doenca;

    public ConsultaAnterior(String data, String nomeMedico, boolean estavaDoente, String doenca){
        this.data = data;
        this.nomeMedico = nomeMedico;
        this.estavaDoente = estavaDoente;
        this.doenca = doenca;
    }
}
