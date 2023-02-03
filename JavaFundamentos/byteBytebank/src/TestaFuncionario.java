public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Lucas Vinicius");
        funcionario.setSalario(1500.0);
        funcionario.setCpf("222.222.222-22");

        System.out.printf("Nome: %s%nSalario R$: %.2f%nCpf: %s%n",
                funcionario.getNome(),funcionario.getSalario(),funcionario.getCpf());

        System.out.printf("Bonificacao R$: %.2f%n", funcionario.getBonificacao());

    // ------------------------------------------------------







    }
}