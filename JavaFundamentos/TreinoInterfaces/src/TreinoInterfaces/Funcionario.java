package TreinoInterfaces;

public abstract class Funcionario implements TaxaSalario{
    private String nome;
    private Integer idade;
    private Double salario;


    // Sobrescrita
    public Funcionario() {
    }

    public Funcionario(String nome, Integer idade, Double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getSalario() {
        return salario;
    }

    @Override
    public Double taxaSalario() {
        return salario;
    }
}
