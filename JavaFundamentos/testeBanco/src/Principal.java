public class Principal {

    public static void main(String[] args) {

        Conta contaLucas = new Conta();
        contaLucas.saldo = 20;
        contaLucas.depositar(100);
        System.out.println(contaLucas.saldo);

        contaLucas.sacar(20);
        System.out.println(contaLucas.saldo);

        // Transferir para outra conta
        Conta contaMaria = new Conta();

        boolean validaTransferencia = contaLucas.transferir(50,contaMaria);

        if (validaTransferencia) {
            System.out.println("Transferencia concluida");

        } else {
            System.out.println("Transferencia negada");

        }

        System.out.printf("Conta Maria: %.2f%n",contaMaria.saldo);
        System.out.printf("Conta Lucas: %.2f%n",contaLucas.saldo);

        contaLucas.titular = "Lucas Vinicius";
        contaMaria.titular = "Maria";

    }

}