package sintaxeVariaveisFluxo;

public class TestaPontoFlutuante {

    public static void main(String[] args) {

        double salario = 1250.70;
        System.out.printf("Meu salario é: %.2f%n",salario);

        // forcando a troca de double para int | Cast
        // cast faz conversao de tipos primitivos
        int valor = (int) salario;
        System.out.println(valor);

        long numeroGrande = 324124124L;
        short valorPequeno = 2131;
        byte b = 123;

        System.out.println(0.1 + 0.2);

        float pontoFlutuante = 3.14f;
    }
}
