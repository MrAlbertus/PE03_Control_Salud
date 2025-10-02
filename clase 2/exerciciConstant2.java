import java.util.Scanner;
public class exerciciConstant2 {
    public static void main(String[] args) {
        //Introduir dos números i calcular la seva suma.
        System.out.println("Introdueix el primer numero: ");
        Scanner Scanner1 = new Scanner(System.in);
        int primerNum = Scanner1.nextInt();

        System.out.println("Introdueix el segon numero: ");
        int segonNum = Scanner1.nextInt();

        int numFinal = primerNum + segonNum;

        System.out.println("La suma es: " + numFinal);

        Scanner1.close();


    }
}
