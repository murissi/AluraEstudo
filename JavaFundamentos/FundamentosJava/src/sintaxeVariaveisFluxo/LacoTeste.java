package sintaxeVariaveisFluxo;

public class LacoTeste {

    public static void main(String[] args) {

       /* for (int linha = 0; linha <= 10 ; linha++) {
            for (int coluna = 0; coluna <= linha; coluna++) {
                System.out.print(" * ");
            }
            System.out.println();*/

        /*for (int linha = 1; linha <= 5 ;linha++ ) {
            for (int coluna = 1; coluna <= linha; coluna++){
                System.out.print(coluna);
            }
            System.out.println();
        }*/

        for (int linha  = 1; linha <= 5; linha++){
            for (int coluna = 1; coluna <= 5; coluna++){
                if (coluna > linha){
                    break;
                }
                System.out.print(coluna);
            }
            System.out.println();
        }
    }

}
