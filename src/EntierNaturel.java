public class EntierNaturel {

    private int val;

    public EntierNaturel(int val) throws NombreNegatifException {
        setVal(val);
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) throws NombreNegatifException {
        if (val < 0) {
            throw new NombreNegatifException(val);
        }
        this.val = val;
    }

    public void decrementer() throws NombreNegatifException {
        if (val <= 0) {
            throw new NombreNegatifException(val - 1); // On passe val - 1 pour indiquer la valeur qui a causé l'erreur
        }
        val--;
    }
}

