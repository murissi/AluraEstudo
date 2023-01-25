package sintaxeVariaveisFluxo;

public class NumeroPrimo {

    public static void main(String[] args) {
        // numero primo com for
        int numero = 5;
        int contador = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                contador ++;
            }
        }
        if (contador == 2) {
            System.out.printf("Numero %d é primo %n", numero);
        } else {
            System.out.printf("Numero %d não é primo %n", numero);
        }
    }

}
