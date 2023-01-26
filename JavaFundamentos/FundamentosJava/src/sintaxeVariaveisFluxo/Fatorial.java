package sintaxeVariaveisFluxo;

public class Fatorial {
    public static void main(String[] args) {


        int fatorial = 1;
        for (int n = 1; n <= 10; n++){
            fatorial *= n;
            System.out.printf("Fatorial de %d é = %d ",n,fatorial);
        }
    }
}
