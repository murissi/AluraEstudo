public class TestaGerente {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        System.out.println(gerente.autentica(0));

        gerente.setNome("Fabricio");
        System.out.println(gerente.getNome() );

        gerente.setSalario(2000);
        System.out.println(gerente.getBonificacao());

    }
}

