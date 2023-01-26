public class Programa {

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.nome = "Paulo";
//        p.endereco = new Endereco();
//        p.endereco.logradouro = "Avenida XYZ";
        Endereco b = new Endereco();
        b.logradouro = "Avenida XYZ";

        p.endereco = b;
        System.out.println(b.logradouro);

    }
}
