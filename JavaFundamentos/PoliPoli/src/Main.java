public class Main {
    public static void main(String[] args) {
        Brinquedo carro = new Carro();
        carro.mover();

        Brinquedo aviao = new Aviao();
        aviao.mover();

        Brinquedo barco = new Barco();
        barco.mover();

        Barco barco1 = new Barco(); // Não é polimorfismo
        barco1.mover();
    }

}