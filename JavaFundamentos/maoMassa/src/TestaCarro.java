public class TestaCarro {

    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setGasolina(20);

        Carro corsa = new Corsa();
        corsa.setGasolina(20);


        System.out.printf("Corsa: %d%n",corsa.gasolinaPus());
        System.out.println(carro.gasolinaPus());
    }
}
