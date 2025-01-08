public class NombreNegatifException extends Exception{

    private final int valeurErronee;

    public NombreNegatifException(int valeurErronee) {
        super("Valeur négative : " + valeurErronee);
        this.valeurErronee = valeurErronee;
    }

    public int getValeurErronee() {
        return valeurErronee;
    }
}
