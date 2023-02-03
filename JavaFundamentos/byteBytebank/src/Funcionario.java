public class Funcionario {

    private String nome;
    private String cpf;
    private double salario;

    public Funcionario() {

    }

    public double getBonificacao() {
        return this.salario * 0.10;
    }


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
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }
}
