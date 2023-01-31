public class Main {

        public static void main(String[] args) {

            Carro carro = new Carro(2,false,true);
            Piloto piloto = new Piloto();
            Carro carro2 = new Carro(true,false);

            Piloto ayrtonSenna = carro2.setPiloto();


            carro.setPiloto(piloto);

            piloto.setMacacao(true);
            piloto.setVolante(true);


            System.out.printf("Carros criados: %d%n", Carro.getCarros());

        }



    }

