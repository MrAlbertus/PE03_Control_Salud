import java.util.Scanner;
public class exerciciConstant6 {
    public static void main(String[] args) {
        //Fes un programet que demani la nota de tres exàmens i ens faci la mitjana resultant. Les qualificacions poden tenir decimals.
        double nota1;
        double nota2;
        double nota3;
        double mitjana;

        Scanner Scanner1 = new Scanner(System.in);

        System.out.println("Introdueix la nota del primer examen: ");
        nota1 = Scanner1.nextDouble();

        System.out.println("Introdueix la nota del segon examen: ");
        nota2 = Scanner1.nextDouble();

        System.out.println("Introdueix la nota del tercer examen: ");
        nota3 = Scanner1.nextDouble();

        mitjana = (nota1 + nota2 + nota3) / 3;

        System.out.println("La teva mitjana es: " + mitjana);

        Scanner1.close();
        

    }
}
