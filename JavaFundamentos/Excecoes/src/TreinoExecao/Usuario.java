package TreinoExecao;

public class Usuario implements Senha{
    private String nick;
    private Integer senha;
    private static Integer senhaPadrao = 123;

    public Usuario() {
    }

    public Usuario(String nick, Integer senha) {
        this.nick = nick;
        this.senha = senha;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public Integer getSenha() {
        return senha;
    }

    public void setSenha(Integer senha) {
        this.senha = senha;
    }

    @Override
    public void accessSystem() throws SenhaIncorretaExeception{
        if(this.senha == senhaPadrao) {
            System.out.println("Senha correta");
        } else {
            throw new SenhaIncorretaExeception("Senha incorreta");
        }
    }
}
