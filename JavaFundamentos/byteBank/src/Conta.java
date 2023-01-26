public class Conta {
    double saldo;
    int agencia = 404;
    int numero;
    String titular;

    public void deposita(double valor) {
        this.saldo += valor;
        // this serve para indicar que queremos apenas nesse conta que foi iniciado o metodo
    }

    public boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;

        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            sacar(valor);
            destino.deposita(valor);
            return true;
        }
        return false;
    }
}
