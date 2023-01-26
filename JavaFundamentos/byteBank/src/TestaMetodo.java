public class TestaMetodo {

    public static void main(String[] args) {
        Conta contaDoPaulo = new Conta();
        contaDoPaulo.saldo = 100;
        contaDoPaulo.deposita(50);
        System.out.println(contaDoPaulo.saldo);

        boolean conseguiuTirar = contaDoPaulo.sacar(50);
        System.out.println(contaDoPaulo.saldo);
        System.out.println(conseguiuTirar);

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(1000);

       if(contaDaMarcela.transfere(300,contaDoPaulo)) {
           System.out.println("Transferencia realizada");
    } else {
           System.out.println("Tranferencia nao realizada");

       }

    }
