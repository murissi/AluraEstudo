public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total; // static mostra que a variavel total nao vai ser atribuida para cada objeto novo e sim para a classe em geral
    private static double somaSaldo;

    public Conta(int agencia, int numero) {
        Conta.total++;
        this.agencia = agencia;
        this.numero = numero;
        System.out.printf("Estou criando uma conta %d%n", this.numero);

    }

    public void deposita(double valor) {
        this.saldo += valor;
        Conta.somaSaldo += valor;
    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    /*
    public void setNumero(int numero) {
        if(numero <= 0){
            System.out.println("Error não pode valor menor que zero");
            return;
        }
        this.numero = numero;
    }
    */

    public int getAgencia() {
        return this.agencia;
    }

   /*
   public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("Não pode valores menores que zero");
            return;
        }
        this.agencia = agencia;
    }
    */

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public static int getTotal() {
        return Conta.total;
    }

    public static double getSomaSaldo() {
        return Conta.somaSaldo;
    }
}