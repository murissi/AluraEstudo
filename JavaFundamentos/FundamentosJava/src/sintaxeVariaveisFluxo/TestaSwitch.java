package sintaxeVariaveisFluxo;

public class TestaSwitch {

    public static void main(String[] args) {

        int mes = 10;

        switch (mes) {
            case 1:
                System.out.println("Janeiro");
                break;

            case 2:
                System.out.println("Fevereiro");
                break;

            case 3:
                System.out.println("Março");

            default:
                System.out.println("Invalido");



        }
        // nova versao do switch

        int idade = 23;
        switch (idade) {
            case 1 -> System.out.println("Bebe");
            case 23 -> System.out.println("Velho");
            default -> System.out.println("Adulto");
        }
    }
}
