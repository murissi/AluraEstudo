package TreinoInterfaces;

public class Medico extends Funcionario implements TaxaSalario{
    public Medico() {
        super();
    }

    public Medico(String nome, Integer idade, Double salario) {
        super(nome, idade, salario);
    }

    @Override
    public Double taxaSalario() {
        return super.getSalario() *0.20;
    }
}
