//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            EntierNaturel entier = new EntierNaturel(5);
            System.out.println("Valeur initiale : " + entier.getVal());

            entier.decrementer();
            System.out.println("Valeur après décrémentation : " + entier.getVal());

            entier.setVal(-3); // Cela va générer une exception
        } catch (NombreNegatifException e) {
            System.out.println("Exception capturée : " + e.getMessage());
            System.out.println("Valeur erronée : " + e.getValeurErronee());
        }

        try {
            EntierNaturel entier2 = new EntierNaturel(0);
            entier2.decrementer(); // Cela va également générer une exception
        } catch (NombreNegatifException e) {
            System.out.println("Exception capturée : " + e.getMessage());
            System.out.println("Valeur erronée : " + e.getValeurErronee());
        }
    }
}