public class Main {
    public static void main(String[] args) {

        Cascavel cascavel = new Cascavel();
        System.out.println(cascavel.emiteSom());

        // Polimorfismo - Classe mais especifica ou mais ampla
        Animal cascavel2 = new Animal();
        System.out.println(cascavel2.emiteSom());
    }

}