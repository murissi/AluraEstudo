public class Fluxo {

    public static void main(String[] args) {

        System.out.println("Ini do main");
        try{
            metodo1();

        } catch (Exception e) {
            System.out.println("Error: "+ e);
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaExecao {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaExecao{
        System.out.println("Ini do metodo2");
        throw new MinhaExecao("deu error");
        //System.out.println("Fim do metodo2");
    }
}

