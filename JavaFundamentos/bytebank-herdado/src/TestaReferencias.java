public class TestaReferencias {

    public static void main(String[] args) {

        Gerente g1 = new Gerente();
        g1.setNome("Marcos");
        String nome = g1.getNome();

        System.out.println(nome);

        Funcionario g2 = new Gerente(); // g2 é do tipo funcionario e nao Gerente
/*
        Gerente g3 = new Funcionario(); Não funciona pq nem t
        odo funcionario é gerente


*/
//        Funcionario novoFuncionario = new Funcionario() {}
//Não se pode criar objetos pelas classes abastratas

    }
}
