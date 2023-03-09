package TreinoExecao;

public class Program {
    public static void main(String[] args) {
        Usuario user01 = new Usuario();
        user01.setSenha(123);

        try {
            user01.accessSystem();
        } catch (Exception e) {
            System.out.println(e);
        } finally {

            System.out.println("FIM DO PROGRAMA");
        }


    }
}
