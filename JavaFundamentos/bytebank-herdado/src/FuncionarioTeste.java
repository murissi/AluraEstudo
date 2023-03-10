public class FuncionarioTeste {

    private String nome;
    private String cpf;
    private double salario;
    private int tipo = 0; // 0 - Funcionario normal, 1 - Gerente
    private int senha;


    public double getBonificacao() {
        if (this.tipo == 0) {
            return this.salario * 0.1;

        } else if(this.tipo == 1) {
            return this.salario;
        } else {
            return this.salario + 1000.0;
        }
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getTipo() {
        return this.tipo;
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
