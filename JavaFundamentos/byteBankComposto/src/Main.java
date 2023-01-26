public class Main {

    public static void main(String[] args) {

        Cliente paulo = new Cliente();
        paulo.nome = "Paulo Silveira";
        paulo.cpf = "222.222.222-22";
        paulo.proffisao = "Programador";

        Conta contaDoPaulo = new Conta();
        contaDoPaulo.depositar(100);

        contaDoPaulo.titular = paulo;
        System.out.println(contaDoPaulo.titular);
        System.out.println(paulo);
    }

}