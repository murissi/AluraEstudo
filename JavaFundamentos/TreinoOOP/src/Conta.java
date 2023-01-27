public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente cliente;

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getContaNome() {
        return this.cliente.getNome();
    }



}
