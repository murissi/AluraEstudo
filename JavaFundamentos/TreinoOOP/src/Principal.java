public class Principal {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Lucas");
        cliente1.setCpf("222.222.222-22");

        System.out.printf("Seu nome é:%s%n ",cliente1.getNome());
        System.out.printf("Seu cpf é: %s%n", cliente1.getCpf());

        Conta contaLucas = new Conta();
        contaLucas.setCliente(cliente1);

        System.out.printf("Conta está no nome de: %s%n ", contaLucas.getContaNome());

    }
}