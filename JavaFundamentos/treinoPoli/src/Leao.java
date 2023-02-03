public class Leao extends Animal{
    @Override
    public void setCacador(boolean cacador) {
        super.setCacador(cacador);
    }

    public String  extincao() {
        if(super.getCacador()) {
            return "Rei da selva!!!";
        } else {
            return "Gatinho de condominio";
        }
    }
}
