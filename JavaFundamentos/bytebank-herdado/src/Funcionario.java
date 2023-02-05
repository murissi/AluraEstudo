// Nao pode instanciar essa clase, pq é abstrata.
public abstract class Funcionario {

    private String nome;
    private String cpf;
    private double salario; // protected publico para os filhos kkkk

    // metodo sem corpo, na ha implementacao
    public abstract double getBonificacao();

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public double getSalario() {
        return this.salario;
    }
}
