public class Main {
    public static void main(String[] args) {
        Brinquedo b1 = new BrinquedoBarato(10,"Panini");
        System.out.printf("Brinquedo Generico R$: %.2f%n", b1.comprar());

        Brinquedo bd1 = new BrinquedoDeluxe(10, "Rolex");
        System.out.printf("Brinquedo Deluxe R$: %.2f%n", bd1.comprar());



    }
}