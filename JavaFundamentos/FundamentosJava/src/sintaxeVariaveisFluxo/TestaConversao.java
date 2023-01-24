package sintaxeVariaveisFluxo;

public class TestaConversao {

    public static void main(String[] args) {
        double salario = 1270.50;
        int valor = (int) salario;
        System.out.println(valor);
        /*
        * Basicamente, para as variaveis primitivas, o casting nada mais é
        * do que fazer com que essa conversao seja feita quando ela nao e feita
        * de maneira automatica.
        * */

        double valor1 = 0.2;
        double valor2 = 0.1;
        double total = valor1 + valor2;
        System.out.println(total);

        float pontoFlutuante = 3.14f;
    }
}
