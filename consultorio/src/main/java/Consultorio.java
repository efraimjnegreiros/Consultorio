package cadastroNomeacao;

public abstract class Consultorio {
    protected String nome;
    protected String cpf;
    protected int idade;
    protected String emailPessoal;
    protected String endereco;
    protected String telefone;

    public Consultorio(String nome, String cpf, int idade, String emailPessoal, String endereco, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.emailPessoal = emailPessoal;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public abstract void consulta(Consultorio consultorio);

    public abstract void setTelefone(String telefone);
}
