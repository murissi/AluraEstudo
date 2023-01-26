package sintaxeVariaveisFluxo;

public class TesteIR {

    public static void main(String[] args) {

        double salario = 3300.0;

        if (salario >= 1900 && salario <= 2800) {
            System.out.println("IR de 7.5% npode deduzir R$142");

        } else if (salario >= 2000.01 && salario <= 3751) {
            System.out.println("IR de 15% npode deduzir R$350");

        } else if (salario >= 3751.01 && salario <= 4664) {
            System.out.println("IR de 22.5% npode deduzir R$636");
        } else {
            System.out.println("Salario invalido");
        }

    }
}
