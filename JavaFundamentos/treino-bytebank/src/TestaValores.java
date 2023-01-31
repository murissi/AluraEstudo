public class TestaValores {

    public static void main(String[] args) {

        Conta conta = new Conta(800, 24226);
        conta.deposita(500);


        Conta conta2 = new Conta(800, 22233);
        conta2.deposita(1500);
/*
        conta está inconsistente
        conta.setNumero(-434);
        conta.setAgencia(-5545);

*/
        Conta conta3 = new Conta(844,234432);
        conta3.deposita(500);


        System.out.println("Total conta: " + Conta.getTotal());
        System.out.println("Montante total banco R$: " + Conta.getSomaSaldo());
    }
}
