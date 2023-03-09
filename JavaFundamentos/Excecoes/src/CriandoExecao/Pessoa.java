package CriandoExecao;

public class Pessoa implements AutoCloseable {
    private Integer idade;
    private String nome;

    public Pessoa() {

    }

    public Pessoa(Integer idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void maiorIdade() throws MaiorIdadeException{
        if(idade < 18) {
            throw new MaiorIdadeException("Error menor de idade!");
        }
        System.out.println(idade);
    }

    @Override
    public void close() throws MaiorIdadeException {

    }
}
