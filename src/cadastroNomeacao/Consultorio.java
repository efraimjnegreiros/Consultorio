package cadastroNomeacao;

public abstract class Consultorio {
    private String nome;
    private String cpf;
    private int idade;
    private String emailPessoal;
    private String endereco;
    private String telefone;
    
    public Consultorio(String nome, String cpf, int idade, String emailPessoal, String endereco, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.emailPessoal = emailPessoal;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmailPessoal() {
        return this.emailPessoal;
    }

    public void setEmailPessoal(String emailPessoal) {
        this.emailPessoal = emailPessoal;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public abstract void setTelefone(String telefone);

    public abstract void consulta(Medico medico);
}