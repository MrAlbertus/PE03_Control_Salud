public class exerciciConstant1 {
    public static void main(String[] args) {
        //definir constant --> SEMPRE EL NOM EN MAJUSCULES
        //posarem la paraula final al principi i al final.
        //una constant no es pot modificar
        final double PI = 3.1416;

        double areaRodona;
        double radi=4;
        areaRodona = PI * (radi * radi);
        System.out.println("L'area de la rodona es: " + areaRodona);
    }
}
