public class Main {

    public static void main(String[] args) {

        Conta conta1 = new Conta(666, 777);
        Cliente cliente1 = new Cliente("Lucas Vinicius", "programador");
        conta1.setCliente(cliente1);

        Conta conta2 = new Conta(666,778);
        Conta conta3 = new Conta(666, 779);

        System.out.println(conta1.getCliente().getProfissao());
        System.out.println(conta1.getCliente().getNome());
        System.out.println(Conta.getContas());

    }
}