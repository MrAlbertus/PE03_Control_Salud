import java.util.Scanner;

public class exerciciConstant3 {
    public static void main(String[] args) {
        //Introduir un import i calcular què ha de pagar si li fem 20% de descompte.
        double import1;
        double impfinal;
        double descompte;

        Scanner Scanner1 = new Scanner(System.in);

        System.out.println("Introdueix el import numero 1: ");
        import1 = Scanner1.nextFloat();

        descompte = import1 * 0.20;
        
        impfinal = import1 - descompte ;

        System.out.println("L'import amb el 20% de descompte aplicat es: " + impfinal);

        Scanner1.close();
    }
}
