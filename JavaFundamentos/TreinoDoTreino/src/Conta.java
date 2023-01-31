public class Conta {

    private int agencia;
    private double saldo;
    private int numero;
    private Cliente cliente;
    private static int contas;

    public Conta(int agencia, int numero) {
        contas++;
        if (agencia <0 || numero <0) {
            System.out.println("Error");
            return;
        }
        this.agencia = agencia;
        this.numero = numero;

    }

    public int getAgencia() {
        return this.agencia;
    }

    public int getNumero() {
        return this.numero;
    }

    public static int getContas() {
        return contas;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


}
