package FernandaDev;

public class CarroTestar {

    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.nome = "Uno";
        carro1.marca = "Fiat";
        carro1.ano = 2015;
        carro1.velocidade = 50;

        carro1.acelerarCarro(50);
        carro1.freiarCarro(25);
        carro1.buzinar();

    }
}
