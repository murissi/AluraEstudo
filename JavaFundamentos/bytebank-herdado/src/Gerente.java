// Gerente herdando atributos e metodos do Funcionario
public class Gerente extends Funcionario{

    private int senha;


    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public double getBonificacao() {
        return super.getSalario(); // atributo salario pertence a classe mae por isso usamos o super
    }



}
