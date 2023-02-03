public class TestaReferencias {
    public static void main(String[] args) {


        Funcionario g1 = new Gerente();
        g1.setNome("Marcos");
        String nome = g1.getNome();
        System.out.println(nome);


        Funcionario f1 = new Funcionario();
        f1.setSalario(2000.0);

        Funcionario e1 = new EditorVideo();
        e1.setSalario(2500.0);

        Design d = new Design();
        d.setSalario(2000);


        g1.setSalario(5000.0);
        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(f1);
        controle.registra(e1);
        controle.registra(d);

        System.out.println(controle.getSoma());





    }
}
