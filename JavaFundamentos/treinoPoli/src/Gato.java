public class Gato extends Animal{
    @Override
    public void setCacador(boolean cacador) {
        super.setCacador(cacador);
    }

    public String  extincao() {
        if(super.getCacador()) {
            return "Gato está safe";
        } else {
            return "Gato corre perigo";
        }
    }


}
