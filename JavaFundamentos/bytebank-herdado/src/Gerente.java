// Gerente herdando atributos e metodos do Funcionario, assina o contrato autenticavel
public class Gerente extends Funcionario implements Autenticavel{

    private int senha;


    public double getBonificacao() {
        return super.getSalario(); // atributo salario pertence a classe mae por isso usamos o super
    }


    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
        return this.senha == senha;
    }
}
