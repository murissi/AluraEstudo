public class Main {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.setCpf("222.222.222-22");
        funcionario.setNome("Frederikson");
        funcionario.setSalario(2000_01);

        System.out.println(funcionario.getBonificacao());
        System.out.println(funcionario.getNome());
        System.out.println();
    }

}