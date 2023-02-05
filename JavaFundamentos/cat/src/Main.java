public class Main {
    public static void main(String[] args) {
        Comida bolo = new Bolo(3);
        System.out.printf("Bolo R$%.2f%n",bolo.comprar());

        Comida salgado = new Salgado(3);
        System.out.printf("Salgado R$%.2f%n", salgado.comprar());
    }
}