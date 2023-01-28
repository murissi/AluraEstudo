public class Carro {
    private String modelo;
    private int gasolina;
    private int velocidade = 0;
    private Piloto piloto;

    public int getGasolina() {
        return this.gasolina;
        }

    public void setGasolina(int gasolina) {
        this.gasolina = gasolina;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade += velocidade;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }


    public String getNomePiloto() {
        return this.piloto.getNome();
    }
}
