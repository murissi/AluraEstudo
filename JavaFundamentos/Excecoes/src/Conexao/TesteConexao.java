package Conexao;

public class TesteConexao {
    public static void main(String[] args) {
//        Conexao con = null;
//        try {
//            con = new Conexao();
//            con.leDados();
//        } catch (IllegalStateException e) {
//            System.out.println("Erro conexao");
//        } finally {
//            System.out.println("Finally");
//            if (con != null) {
//                con.fecha();
//            }
//
//
//        }

        // Codigo resumido
        try (Conexao conexao = new Conexao()) {
            conexao.leDados();
        } catch (IllegalStateException e) {
            System.out.println("conection error");
        }


    }

}