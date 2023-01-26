public class TesteReferencia {
    public static void main(String[] args) {

        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;

        System.out.printf("Saldo da primeira conta: %.2f%n",primeiraConta.saldo);

        Conta segundaConta = primeiraConta; // 2 referencias para o mesmo objeto

        System.out.printf("Saldo da segunda conta: R$ %.2f%n", segundaConta.saldo);

        segundaConta.saldo += 100;
        System.out.println(segundaConta.saldo);
        System.out.println(primeiraConta.saldo);

        if (primeiraConta == segundaConta) {
            System.out.println("Mesma conta");

        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }
}
