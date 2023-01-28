public class Main {

    public static void main(String[] args) {

        Carro carro1 = new Carro();
        carro1.setGasolina(50);
        carro1.setModelo("Porshe");
        carro1.setVelocidade(150);

        Piloto piloto1 = new Piloto();
        piloto1.setNome("Lucas");



        System.out.println(carro1.getGasolina());
        System.out.println(carro1.getModelo());

        carro1.setPiloto(piloto1);

        System.out.println(carro1.getNomePiloto());

    }
}