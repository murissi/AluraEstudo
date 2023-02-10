//Gerente eh um Funcionario, Gerente herda da class Funcionario, assina o contrato Autenticavel, eh um Autenticavel
public class Gerente extends Funcionario implements Autenticavel {
    private AutenticacaoUtil util;

    public Gerente() {
        this.util = new AutenticacaoUtil();
    }
    public double getBonificacao() {
        System.out.println("Chamando o método de bonificacao do GERENTE");
        return super.getSalario();
    }

    public void setSenha(int senha) {
        return this.util.setSenha(senha);
    }

    public boolean autentica(int senha) {
        return this.util.autentica(senha);
    }

}