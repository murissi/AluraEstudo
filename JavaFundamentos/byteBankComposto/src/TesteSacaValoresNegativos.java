public class TesteSacaValoresNegativos {

    public static void main(String[] args) {

        Conta conta  = new Conta();
        conta.depositar(100);
        conta.sacar(200);

        // proibido modificar a conta usando atributos, somente metodos
        // conta.saldo += - 1002;

        System.out.println(conta.getSaldo());
    }
}
