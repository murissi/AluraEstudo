package TreinoInterfaces;

public class Program {
    public static void main(String[] args) {

        Funcionario d1 = new Dentista("Marcos",23,1200.0);
        Funcionario m1 = new Medico("Joao",45, 1200.0);

        System.out.printf("Taxa de salario do %s: %.2f%n",d1.getNome(),d1.taxaSalario());
        System.out.printf("Taxa de salario do %s: %.2f%n",m1.getNome(),m1.taxaSalario());
    }
}
