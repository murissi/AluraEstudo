package sintaxeVariaveisFluxo;

public class Divisores3 {
    public static void main(String[] args) {

        int numero = 3;
        for (int divisor = 1; divisor <= 100; divisor++) {
            if (divisor % numero == 0){
                System.out.println(divisor);
            }
        }

    }
}
