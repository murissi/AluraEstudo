public class Cliente {

    private String nome;
    private String cpf;
    private String profissao;

    public Cliente(String nome, String profissao) {
        this.profissao = profissao;
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getNome() {
        return this.nome;
    }

    public String getProfissao() {
        return this.profissao;
    }
}
