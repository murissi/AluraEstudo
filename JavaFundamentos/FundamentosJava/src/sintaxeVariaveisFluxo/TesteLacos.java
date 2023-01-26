package sintaxeVariaveisFluxo;

public class TesteLacos {

    public static void main(String[] args) {
         // tabuada
//        for (int numeroTabuada = 1; numeroTabuada <= 10; numeroTabuada++) {
//            for (int numeros = 1; numeros <= 10; numeros++) {
//                System.out.print(numeros * numeroTabuada);
//                System.out.print(" ");
//            }
//            System.out.println();
        // matriz
        for (int linha = 1; linha <= 10; linha++) {
            for (int coluna = 1; coluna <= 10; coluna++) {
                if (coluna > linha) {
                    break;
                }
                System.out.print(" * ");
            }
            System.out.println();


        }
    }
}
