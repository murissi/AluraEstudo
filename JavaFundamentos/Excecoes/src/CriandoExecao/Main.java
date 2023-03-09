package CriandoExecao;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(22, "Joao");
        try {
            p1.maiorIdade();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
