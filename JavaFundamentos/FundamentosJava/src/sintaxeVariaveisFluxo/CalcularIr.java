package sintaxeVariaveisFluxo;

public class CalcularIr {

    public static void main(String[] args) {

        double salario = 3300.0;

        if (salario < 2600.0) {

            System.out.println("Sua aliquota é de 15%");
            System.out.println("Voce pode deduzir ate R$ 350");

        } else {

            System.out.println("A sua aliquota é de 22.5%");
            System.out.println("Você pode deduzir até R$ 636");

        }

    }
}
