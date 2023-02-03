public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Animal();
        Animal gato = new Gato();
        Animal leao = new Leao();

        leao.setCacador(false);
        gato.setCacador(false);
        cachorro.setCacador(false);


        System.out.println(leao.extincao());
        System.out.println(gato.extincao());
        System.out.println(cachorro.extincao());



    }

}