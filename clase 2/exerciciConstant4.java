import java.util.Scanner;
public class exerciciConstant4 {
    public static void main(String[] args) {
        //Introduir un import i un descompte en tant per cent. Calcular l’import  net
        double import1;
        double descompte;
        double importnet;
        double importnet1;

        System.out.println("Introdueix el import1: ");
        Scanner Scanner1 = new Scanner(System.in);
        import1 = Scanner1.nextDouble();

        System.out.println("Introdueix el descompte: ");
        descompte = Scanner1.nextDouble();

        importnet = descompte * 0.01;
        importnet1 = importnet * import1;
        importnet1 = import1 - importnet1;

        System.out.println("El import 1 val: " + import1 + " y el descompte es de: " + descompte + " El valor final amb descompte es: " + importnet1);

        Scanner1.close();

    }
}
