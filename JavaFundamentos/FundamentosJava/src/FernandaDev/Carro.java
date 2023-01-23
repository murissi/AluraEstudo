package FernandaDev;

public class Carro {
    // atributos
    String nome;
    String marca;
    int ano;
    int velocidade;

    // metodos
    void acelerarCarro(int aceleracao) {
        int acelerarCarro = velocidade += aceleracao;
        System.out.printf("Aceleracao: %d%n", acelerarCarro);

    }

    void freiarCarro(int reduzir) {
        int freiarCarro = velocidade -= reduzir;
        System.out.printf("Freio: %d%n", freiarCarro);
    }

    void buzinar() {
        System.out.println("bibibi");
    }

}
