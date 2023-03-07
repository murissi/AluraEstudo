package TreinoInterfaces;

public class Dentista extends Funcionario implements TaxaSalario{
    public Dentista(){
        super();
    }

    public Dentista(String nome, Integer idade, Double salario) {
        super(nome, idade, salario);
    }

    @Override
    public Double taxaSalario() {
        return super.getSalario() * 0.15;
    }
}
