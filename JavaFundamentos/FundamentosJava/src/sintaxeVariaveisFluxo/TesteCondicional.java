package sintaxeVariaveisFluxo;

public class TesteCondicional {

    public static void main(String[] args) {

        System.out.println("Testando condiconais");

        int idade = 3;
        int quantidadePessoas = 1;

        if (idade >= 18) {
            System.out.println("Você tem mais que 18 anos");
            System.out.println("Seja bem vindo");
        } else {
            if (quantidadePessoas >= 2) {
                System.out.println("Voce nao tem 18, mas pode entrar " +
                        "pois esta acompanhado");
            } else {
                System.out.println("Infelizmente voce nao pode entrar");

            }
        }

    }
}
