// Gerente é um funcinario. Funcionario = mae Gerente = filho
public class Gerente extends Funcionario {
    private int senha;

    public boolean autentica(int senha) {
        return senha == this.senha;
    }

    public double getBonificacao() {
        return super.getBonificacao() + super.getSalario();
    }


}
