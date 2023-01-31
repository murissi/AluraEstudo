public class TestaGetESet {
    public static void main(String[] args) {

        Conta conta = new Conta(444,333);

//        conta.setNumero(800);
        System.out.println(conta.getNumero());

        Cliente paulo = new Cliente();

        conta.setTitular(paulo);

        paulo.setNome("Paulo Silveira");
        System.out.println(conta.getTitular().getNome());

//        conta.titular.setNome("Lucas");
        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("Programador");

        // agora em duas linhas
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("Jogador de Futebol");


        Cliente seuGeraldo = conta.getTitular();
        seuGeraldo.setProfissao("Mecanico");

        System.out.println(titularDaConta);
        System.out.println(paulo);
        System.out.println(conta.getTitular());
        System.out.println(seuGeraldo);
        System.out.println(conta.getTitular());

        Cliente donaClaudia = new Cliente();
        conta.setTitular(donaClaudia);
        conta.getTitular().setNome("Dona Claudia");

        System.out.println(donaClaudia);
        System.out.println(seuGeraldo);
        System.out.printf("Dono da conta: %s%n %s", conta.getTitular(), conta.getTitular().getNome());
    }
}
