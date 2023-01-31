public class Main {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Bob");
        cachorro.setPatas(3);
        System.out.println(cachorro.getPatas());

        System.out.println(cachorro.getDomestico(true));

        System.out.println(cachorro.getDomestico());

        System.out.println(cachorro.getNome());
    }
}